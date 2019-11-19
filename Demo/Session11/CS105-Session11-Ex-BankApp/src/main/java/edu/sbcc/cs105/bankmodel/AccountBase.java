package edu.sbcc.cs105.bankmodel;

import java.util.ArrayList;
import java.util.List;

public abstract class AccountBase implements Account, Comparable<AccountBase> {

	private double balance;
	private double minimumRequiredBalance;
	private String accountName;
	private String accountNumber;
	protected ArrayList<Transaction> transactionHistory = new ArrayList<Transaction>();
	
	protected AccountBase(String accountNumber, String accountName, double initialBalance, double minimumRequiredBalance){
		
		setAccountName(accountName);
		setAccountNumber(accountNumber);
		this.balance = initialBalance;
		this.minimumRequiredBalance = minimumRequiredBalance;
	}
	
	public int compareTo(AccountBase otherObject){
		
		AccountBase other = (AccountBase)otherObject;		
		if (balance < other.getBalance()) {return -1;}
		if (balance > other.getBalance()) {return 1;}
		return 0;
	}

	@Override
	public double getBalance() {
		
		return this.balance;
	}

	protected void setBalance(double newBalance){
		this.balance = newBalance;
	}
	
	@Override
	public double getMinimumRequiredBalance() {
		return this.minimumRequiredBalance;
	}
	
	@Override
	public double getAverageDailyBalance() {

		// Should do a calculation using transaction history since last statement date. However,
		// this is extra work right now.
		return this.balance;
	}
	
	@Override
	public void setAccountName(String accountName) {

		this.accountName = accountName;
		
	}

	@Override
	public String getAccountName() {
		return this.accountName;
	}
	
	@Override
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	protected void setAccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
	}
	@Override
	public List<Transaction> getTransactionHistory() {
		// return a copy of the list, but not the actual list 
		// which would allow someone to potentially corrupt
		// the transaction history
		return (List<Transaction>) transactionHistory.clone();
	}
}
