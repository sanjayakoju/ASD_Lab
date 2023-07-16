package bank.subject;

import bank.domain.Account;
import bank.observer.AccountObserver;

import java.util.ArrayList;
import java.util.Collection;

public class AccountSubject {

    Collection<AccountObserver> accountObservers = new ArrayList<>();

    public void addObserver(AccountObserver accountObserver) {
        accountObservers.add(accountObserver);
    }

    public void doNotify(Account account) {
        for (AccountObserver accountObserver: accountObservers) {
            accountObserver.update(account);
        }
    }
}
