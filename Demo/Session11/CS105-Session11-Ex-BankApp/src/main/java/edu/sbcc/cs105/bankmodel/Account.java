package edu.sbcc.cs105.bankmodel;

import java.util.List;

public interface Account {
	void postFees(FeeSchedule feeSchedule) throws TransactionException;
	void postInterest();
	void postTransaction(Transaction transaction) throws TransactionException;
	void transferTo(Account account, double amount) throws TransactionException;
	double getBalance();
	double getMinimumRequiredBalance();
	double getAvailableBalance();
	double getAverageDailyBalance();
	List<Transaction> getTransactionHistory();
	void setAccountName(String accountName);
	String getAccountName();
	String getAccountNumber();
	void debit(double amount) throws TransactionException;
}
