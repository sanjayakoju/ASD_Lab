package customers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public EmailSender emailSender() {
        return new EmailSender();
    }

    @Bean Logger logger() {
        return new Logger();
    }


    @Bean CustomerDAO customerDAO() {
        return new CustomerDAO(logger(), emailSender());
    }

    @Bean
    public ICustomerService customerService() {
        CustomerService customerService = new CustomerService();
        customerService.setEmailSender(emailSender());
        customerService.setCustomerDao(customerDAO());
        return customerService;
    }
}
