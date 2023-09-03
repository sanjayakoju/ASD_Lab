package bank.factory.testing;

import bank.dao.IAccountDAO;
import bank.dao.MockAccountDAO;
import bank.factory.IEmailSender;
import bank.factory.MyFactory;

public class MockFactory implements MyFactory {
    @Override
    public IAccountDAO getAccountDAO() {
        return new MockAccountDAO();
    }

    @Override
    public IEmailSender getEmailSenderDAO() {
        return new MockEmailSender();
    }
}
