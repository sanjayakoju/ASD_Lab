package bank.service;

import bank.domain.Account;
import bank.dto.AccountDTO;

public class AccountAdaptor {

    private static AccountAdaptor accountAdaptor;

    synchronized public static AccountAdaptor getAccountAdaptor() {
        if (accountAdaptor != null) {
            return accountAdaptor;
        }
        return new AccountAdaptor();
    }

    public AccountDTO toAccountDTO(Account account) {
        return new AccountDTO(account.getAccountnumber(), account.getEntryList(), account.getCustomer());
    }

    public Account toAccount(AccountDTO accountDTO) {
        return new Account(accountDTO.getAccountnumber(), accountDTO.getEntryList(), accountDTO.getCustomer());
    }
}
