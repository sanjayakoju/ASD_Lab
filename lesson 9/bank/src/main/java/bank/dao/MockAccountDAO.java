package bank.dao;

import bank.domain.Account;

import java.util.ArrayList;
import java.util.Collection;

public class MockAccountDAO implements IAccountDAO {

    Collection<Account> accounts = new ArrayList<>();
    @Override
    public void saveAccount(Account account) {
        accounts.add(account);
    }

    @Override
    public void updateAccount(Account account) {
        Account accountExist = loadAccount(account.getAccountnumber());
        if (accountExist != null) {
            accounts.remove(accountExist);
            accounts.add(account);
        }
    }

    @Override
    public Account loadAccount(long accountnumber) {
        for (Account account: accounts) {
            if (account.getAccountnumber() == accountnumber) {
                return account;
            }
        }
        return null;
    }

    @Override
    public Collection<Account> getAccounts() {
        return accounts;
    }
}
