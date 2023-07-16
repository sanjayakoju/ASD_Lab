package bank.observer;

import bank.domain.Account;
import bank.service.AccountService;

public class Logger extends AccountObserver{
    public Logger(AccountService accountService) {
        super(accountService);
    }

    @Override
    public void update(Account account) {
        log(account);
    }

    private void log(Account account) {
        System.out.println("Log ADD FOR ACC Num : "+account.getAccountnumber());
    }
}
