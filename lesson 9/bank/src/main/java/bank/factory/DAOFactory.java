package bank.factory;

import bank.factory.production.ProductionFactory;
import bank.factory.testing.MockFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DAOFactory {

    private MyFactory myFactory;

    public DAOFactory() {
        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
//        try {
//            Properties properties = new Properties();
//            System.out.println("Root : "+rootPath);
//            properties.load(new FileInputStream(rootPath+"/config.properties"));
//
//            String environment = properties.getProperty("environment");
//            if (environment.equals("production")) {
//                myFactory = new ProductionFactory();
//            } else if (environment.equals("test")) {
//                myFactory = new MockFactory();
//            } else {
//                System.out.println("Please set environment properly");
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try {
            Properties properties = new Properties();
            InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties");

            if (inputStream != null) {
                properties.load(inputStream);
            } else {
                throw new FileNotFoundException("config.properties not found on classpath");
            }

            String environment = properties.getProperty("environment");
            if (environment != null) {
                if (environment.equals("production")) {
                    myFactory = new ProductionFactory();
                } else if (environment.equals("test")) {
                    myFactory = new MockFactory();
                } else {
                    System.out.println("Please set environment properly");
                }
            } else {
                System.out.println("environment property not found in config.properties");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public MyFactory getMyFactoryInstance() {
        return myFactory;
    }
}
