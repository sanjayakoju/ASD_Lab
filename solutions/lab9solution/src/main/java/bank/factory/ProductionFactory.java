package bank.factory;

import bank.dao.AccountDAO;
import bank.dao.AccountDAOLogger;
import bank.dao.IAccountDAO;
import bank.email.EmailSender;
import bank.email.IEmailSender;

public class ProductionFactory implements MyFactory{

	public IAccountDAO getAccountDAO() {
		IAccountDAO accountDao = new AccountDAO();
		accountDao = new AccountDAOLogger(accountDao);
		return accountDao;
	}

	public IEmailSender getEmailSender() {
		return EmailSender.getEmailSender();
	}

}
