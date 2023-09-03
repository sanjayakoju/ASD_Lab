package bank.dao;

import java.util.*;
import bank.domain.Account;

public class AccountDAO extends AccountDAOLogger implements IAccountDAO {
	Collection<Account> accountlist = new ArrayList<Account>();

	public void saveAccount(Account account) {
		accountlist.add(account); // add the new
		log("Account Created!");
	}

	public void updateAccount(Account account) {
		Account accountexist = loadAccount(account.getAccountnumber());
		if (accountexist != null) {
			accountlist.remove(accountexist); // remove the old
			accountlist.add(account); // add the new
			log("Account Updated!");
		}

	}

	public Account loadAccount(long accountnumber) {
		for (Account account : accountlist) {
			if (account.getAccountnumber() == accountnumber) {
				log("Account Loaded!");
				return account;
			}
		}
		return null;
	}

	public Collection<Account> getAccounts() {
		log("Account Loading...");
		return accountlist;
	}

}
