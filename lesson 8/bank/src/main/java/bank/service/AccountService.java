package bank.service;

import java.util.Collection;
import java.util.stream.Collectors;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.domain.Account;
import bank.domain.Customer;
import bank.dto.AccountDTO;
import bank.proxy.Proxy;


public class AccountService implements IAccountService {
	private IAccountDAO accountDAO;
	private IAccountDAO stopWatchProxy;
	private final AccountAdaptor accountAdaptor = AccountAdaptor.getAccountAdaptor();

	
	public AccountService(){
		accountDAO=new AccountDAO();
		this.stopWatchProxy = new Proxy().getProxy(accountDAO);
	}

	public AccountDTO createAccount(long accountNumber, String customerName) {
		AccountDTO account = new AccountDTO(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		stopWatchProxy.saveAccount(accountAdaptor.toAccount(account));
		return account;
	}

	public void deposit(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		accountDAO.updateAccount(account);
	}

	public AccountDTO getAccount(long accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		AccountDTO accountDTO = accountAdaptor.toAccountDTO(account);
		return accountDTO;
	}

	public Collection<AccountDTO> getAllAccounts() {
		return accountDAO.getAccounts().stream()
				.map(account -> accountAdaptor.toAccountDTO(account))
				.collect(Collectors.toList());
	}

	public void withdraw(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
		accountDAO.updateAccount(account);
	}



	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
	}
}
