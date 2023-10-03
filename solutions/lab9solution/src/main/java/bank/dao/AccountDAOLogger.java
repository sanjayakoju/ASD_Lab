package bank.dao;

import java.util.Collection;

import bank.domain.Account;

public class AccountDAOLogger extends AccountDecorator {

	public AccountDAOLogger(IAccountDAO decoratedDAO) {
		super(decoratedDAO);
	}

	@Override
	public void saveAccount(Account account) {
		System.out.println("Logging: save account with accountnumber " + account.getAccountnumber());
		super.saveAccount(account);
	}

	@Override
	public void updateAccount(Account account) {
		System.out.println("Logging: update account with accountnumber " + account.getAccountnumber());
		super.updateAccount(account);
	}

	@Override
	public Account loadAccount(long accountnumber) {
		System.out.println("Logging: load account with accountnumber " + accountnumber);
		return super.loadAccount(accountnumber);
	}

	@Override
	public Collection<Account> getAccounts() {
		System.out.println("Logging: load all accounts ");
		return super.getAccounts();
	}

}
