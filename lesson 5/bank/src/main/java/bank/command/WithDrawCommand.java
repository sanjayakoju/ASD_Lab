package bank.command;

import bank.service.AccountService;
import bank.service.IAccountService;

public class WithDrawCommand implements Command {

    private long accNum;
    private double amount;

    IAccountService accountService;

    public WithDrawCommand(long accNum, double amount, IAccountService accountService) {
        this.accNum = accNum;
        this.amount = amount;
        this.accountService = accountService;
    }

    @Override
    public void execute() {
        accountService.withdraw(accNum, amount);
    }

    @Override
    public void unExecute() {
        accountService.deposit(accNum, amount);
    }
}
