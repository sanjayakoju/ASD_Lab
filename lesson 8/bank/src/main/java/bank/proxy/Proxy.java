package bank.proxy;

import bank.dao.IAccountDAO;
import bank.dao.IAccountMockDAO;
import bank.proxy.logging.LoggingProxy;
import bank.proxy.timing.StopWatchProxy;

public class Proxy {

    public IAccountDAO getProxy(IAccountDAO iAccountDAO) {
        ClassLoader classLoader = IAccountDAO.class.getClassLoader();
        IAccountDAO loggingProxy = (IAccountDAO) java.lang.reflect.Proxy.newProxyInstance(
                classLoader,
                new Class[]{IAccountDAO.class},
                new LoggingProxy(iAccountDAO)
        );

        IAccountDAO stopWatchProxy = (IAccountDAO) java.lang.reflect.Proxy.newProxyInstance(
                classLoader,
                new Class[]{IAccountDAO.class, IAccountMockDAO.class},
                new StopWatchProxy(loggingProxy));
        return stopWatchProxy;
    }
}
