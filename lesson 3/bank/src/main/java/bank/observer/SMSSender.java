package bank.observer;

import bank.domain.Account;
import bank.service.AccountService;

public class SMSSender extends AccountObserver {
    public SMSSender(AccountService accountService) {
        super(accountService);
    }

    @Override
    public void update(Account account) {
        sendSMS(account);
    }

    private void sendSMS(Account account) {
        System.out.println("Send SMS TO ACC Num : "+account.getAccountnumber());
    }
}
