package bank.dao;

import java.util.Collection;

import bank.domain.Account;

public abstract class AccountDecorator implements IAccountDAO{

	protected IAccountDAO decoratedDAO;

	public AccountDecorator(IAccountDAO decoratedDAO) {
		super();
		this.decoratedDAO = decoratedDAO;
	}

	public  void saveAccount(Account account) {
		decoratedDAO.saveAccount(account);
	};
	public  void updateAccount(Account account) {
		decoratedDAO.updateAccount(account);
	}
	public  Account loadAccount(long accountnumber) {
		return decoratedDAO.loadAccount(accountnumber);
	};
	public  Collection<Account> getAccounts() {
		return decoratedDAO.getAccounts();
	}

}
