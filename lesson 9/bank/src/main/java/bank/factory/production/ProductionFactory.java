package bank.factory.production;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.factory.IEmailSender;
import bank.factory.MyFactory;

public class ProductionFactory implements MyFactory {
    @Override
    public IAccountDAO getAccountDAO() {
        return new AccountDAO();
    }

    @Override
    public IEmailSender getEmailSenderDAO() {
        return EmailSender.getEmailSender();
    }
}
