package bank.dto;

import bank.domain.Account;
import bank.domain.AccountEntry;
import bank.domain.Customer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class AccountDTO {

    long accountnumber;
    Collection<AccountEntry> entryList = new ArrayList<AccountEntry>();
    Customer customer;


    public AccountDTO (long accountnr){
        this.accountnumber = accountnr;
    }

    public AccountDTO(long accountnumber, Collection<AccountEntry> entryList, Customer customer) {
        this.accountnumber =accountnumber;
        this.entryList = entryList;
        this.customer = customer;
    }

    public long getAccountnumber() {
        return accountnumber;
    }
    public void setAccountnumber(long accountnumber) {
        this.accountnumber = accountnumber;
    }
    public double getBalance() {
        double balance=0;
        for (AccountEntry entry : entryList) {
            balance+=entry.getAmount();
        }
        return balance;
    }
    public void deposit(double amount){
        AccountEntry entry = new AccountEntry(new Date(), amount, "deposit", "", "");
        entryList.add(entry);
    }
    public void withdraw(double amount){
        AccountEntry entry = new AccountEntry(new Date(), -amount, "withdraw", "", "");
        entryList.add(entry);
    }

    private void addEntry(AccountEntry entry){
        entryList.add(entry);
    }

    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Collection<AccountEntry> getEntryList() {
        return entryList;
    }
}
