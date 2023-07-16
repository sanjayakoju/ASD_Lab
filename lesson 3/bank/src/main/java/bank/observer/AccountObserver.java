package bank.observer;

import bank.domain.Account;
import bank.service.AccountService;

public abstract class AccountObserver {

    private AccountService accountService;

    public AccountObserver(AccountService accountService) {
        this.accountService = accountService;
    }

    public abstract void update(Account account);
}
