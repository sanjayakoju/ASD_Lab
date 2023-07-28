package bank.command;

import bank.service.IAccountService;

public class TransferFundCommand implements Command {

    private long fromAccNum;
    private long toAccNum;
    private double amount;
    private String description;

    IAccountService accountService;

    public TransferFundCommand(long fromAccNum, long toAccNum, double amount, String description, IAccountService accountService) {
        this.fromAccNum = fromAccNum;
        this.toAccNum = toAccNum;
        this.amount = amount;
        this.description = description;
        this.accountService = accountService;
    }

    @Override
    public void execute() {
        accountService.transferFunds(fromAccNum, toAccNum, amount, description);
    }

    @Override
    public void unExecute() {
        accountService.deposit(fromAccNum, amount);
    }
}
