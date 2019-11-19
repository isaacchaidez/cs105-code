package edu.sbcc.cs105.bankmodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SavingsAccount extends AccountBase implements OverdraftAccount {

	private InterestRate interestRate;
	
	
	public SavingsAccount(String accountNumber, String accountName, double currentBalance, double minimumRequiredBalance, InterestRate interestRate){
		
		super(accountNumber, accountName, currentBalance, minimumRequiredBalance);
		this.interestRate = interestRate;
	}

	@Override
	public void postFees(FeeSchedule feeSchedule) throws TransactionException {		

		double fee = feeSchedule.getFee(getBalance());
		if (fee > 0){
			setBalance(getBalance() - fee);
			Transaction tx = new Transaction(TransactionType.FEE, "Low Balance Fee", new Date(), fee);
			this.transactionHistory.add(tx);
		}	
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
				new Date(), -amount);

		this.postTransaction(txFrom);
		account.postTransaction(txTo);
	}
	
	
	@Override
	public void postTransaction(Transaction transaction) {

		this.transactionHistory.add(transaction);		
		setBalance(getBalance() + transaction.getAmount());		
	}

	@Override
	public List<Transaction> getTransactionHistory() {
		// return a copy of the list, but not the actual list 
		// which would allow someone to potentially corrupt
		// the transaction history
		return (List<Transaction>) transactionHistory.clone();
	}
	
	@Override
	public double getAvailableBalance() {
		
		double nominalBalance = getBalance();
		double nominalMinReqBalance = getMinimumRequiredBalance();
		return nominalBalance > nominalMinReqBalance ? nominalBalance - nominalMinReqBalance : 0;
	}

	@Override
	public double getLimit() {
		// TODO Auto-generated method stub
		return getAvailableBalance();
	}
}
