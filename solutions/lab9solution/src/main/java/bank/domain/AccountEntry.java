package bank.domain;

import java.util.Date;


public class AccountEntry {
	private Date date;
	private double amount;
	private String description;
	private String fromAccountNumber;
	private String fromPersonName;
	
	public static class Builder{
		private Date date;
		private double amount;
		private String description;
		private String fromAccountNumber;
		private String fromPersonName;
		
		public Builder withDate(Date date) {
			this.date = date;
			return this;
		}
		public Builder withAmount(double amount) {
			this.amount = amount;
			return this;
		}
		public Builder withDescription(String description) {
			this.description = description;
			return this;
		}
		public Builder withFromAccountNumber(String fromAccountNumber) {
			this.fromAccountNumber = fromAccountNumber;
			return this;
		}
		public Builder withFromPersonName(String fromPersonName) {
			this.fromPersonName = fromPersonName;
			return this;
		}	
		
		public AccountEntry build() {
			return new AccountEntry(this);			
		}
	}
	


	public AccountEntry(Builder builder) {
		this.date = builder.date;
		this.amount = builder.amount;
		this.description = builder.description;
		this.fromAccountNumber = builder.fromAccountNumber;
		this.fromPersonName = builder.fromPersonName;
	}

	public double getAmount() {
		return amount;
	}


	public Date getDate() {
		return date;
	}


	public String getDescription() {
		return description;
	}

	public String getFromAccountNumber() {
		return fromAccountNumber;
	}


	public String getFromPersonName() {
		return fromPersonName;
	}

	
}
