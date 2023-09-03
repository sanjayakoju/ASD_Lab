package bank.factory;

import bank.dao.IAccountDAO;

public interface MyFactory {

    IAccountDAO getAccountDAO();

    IEmailSender getEmailSenderDAO();

}
