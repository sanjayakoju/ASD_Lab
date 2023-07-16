package bank.observer;

import bank.domain.Account;
import bank.service.AccountService;

public class EmailSender extends AccountObserver {
    public EmailSender(AccountService accountService) {
        super(accountService);
    }

    @Override
    public void update(Account account) {
        sendEmail(account);
    }

    private void sendEmail(Account account) {
        System.out.println("Email Send to ACC Num: "+account.getAccountnumber());
    }
}
