package bank.domain;

import java.util.Date;

public class CheckingAccount extends Account {

    public CheckingAccount(long accountnr, String accountType) {
        super(accountnr, accountType);
    }

    @Override
    public double addInterest() {
        double balance = getBalance();
        AccountEntry accountEntry = new AccountEntry();
        accountEntry.setDate(new Date());
        accountEntry.setDescription("Interest");
        if (getBalance() < 1000) {
            accountEntry.setAmount(balance * 0.01);
        } else if(getBalance() > 1000 && getBalance() < 5000) {
            accountEntry.setAmount(balance * 0.02);
        } else if(getBalance() > 5000) {
            accountEntry.setAmount(balance * 0.05);
        }
        this.entryList.add(accountEntry);
        return accountEntry.getAmount();
    }
}
