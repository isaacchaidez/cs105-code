package edu.sbcc.cs105.bankmodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LineOfCredit extends AccountBase implements OverdraftAccount {

	private InterestRate interestRate;
	private double limit;
	
	
	public LineOfCredit(String accountNumber, String accountName, double currentBalance, double limit, InterestRate interestRate){
		
		super(accountNumber, accountName, currentBalance, 0);
		this.limit = limit;
	}

	@Override
	public void postFees(FeeSchedule feeSchedule) throws TransactionException {		
		// Do nothing as line of credit account does not incur fees		
	}

	
	
	@Override
	public void postInterest() {		
		setBalance(getBalance() + interestRate.calculateInterest(getAverageDailyBalance()));
	}


	@Override
	public void transferTo(Account account, double amount) throws TransactionException {
		
		// Even if account is overdraftable, we are not going to allow 
		// transitive overdrafts because of the potential for 
		// circular references
		if (amount > this.getAvailableBalance()){
			throw new TransactionException("Requested transfer amount exceeds available balance");
		}
		
		Transaction txTo = new Transaction(
				TransactionType.TRANSFER, 
				String.format("Transfer from %s", this.getAccountNumber()), 
				new Date(), amount);
		
		Transaction txFrom = new Transaction(
				TransactionType.TRANSFER, 
				String.format("Transfer to %s", account.getAccountNumber()), 
				new Date(), amount);

		this.postTransaction(txFrom);
		account.postTransaction(txTo);
	}

		
	@Override
	public void postTransaction(Transaction transaction) {
		this.transactionHistory.add(transaction);		
		setBalance(getBalance() + transaction.getAmount());					
	}
	
	@Override
	public double getAvailableBalance() {
		
		double nominalBalance = getBalance();
		return nominalBalance >= limit ? 0 : limit - nominalBalance;
	}

	@Override
	public double getLimit() {
		return this.limit;
	}

	
	
}
