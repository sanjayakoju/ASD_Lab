package bank.factory;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.email.IEmailSender;

public interface MyFactory {
	public IAccountDAO getAccountDAO();
	public IEmailSender getEmailSender();
}
