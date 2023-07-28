package bank.command;

import bank.service.AccountService;
import bank.service.IAccountService;

public class DepositCommand implements Command {

    private long accNum;
    private double amount;

    IAccountService accountService;

    public DepositCommand(long accNum, double amount, IAccountService accountService) {
        this.accNum = accNum;
        this.amount = amount;
        this.accountService = accountService;
    }

    @Override
    public void execute() {
        accountService.deposit(accNum, amount);
    }

    @Override
    public void unExecute() {
        accountService.withdraw(accNum, amount);
    }
}
