package edu.sbcc.cs105.bankmodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckingAccount extends AccountBase implements Overdraftable {

	private double balance;
	private double minimumRequiredBalance;
	private ArrayList<OverdraftAccount> overdraftAccountList = new ArrayList<OverdraftAccount>();
	private String accountName;
	private String accountNumber;
	
	public CheckingAccount(String accountNumber, String accountName, 
			double initialBalance, double minimumRequiredBalance){
		
		super(accountNumber, accountName, initialBalance, minimumRequiredBalance);
		
	}
	
	public void debit(double amount) throws TransactionException {
		
		if (amount > this.getAvailableBalance()) {
			performOverdraftProcedure(amount - getAvailableBalance());
		}
	}
	@Override
	public void postFees(FeeSchedule feeSchedule) throws TransactionException {
		
		double fee = feeSchedule.getFee(balance);
		if (fee > 0){
			postTransaction(new Transaction(TransactionType.FEE, "Low balance fee", new Date(), -fee));
		}
		
	}

	private void performOverdraftProcedure(double overdraftRequirement) throws TransactionException {
		
		double currentAmountNeeded = overdraftRequirement;
		for (OverdraftAccount overdraftAcct: this.overdraftAccountList){
			
			double available = overdraftAcct.getAvailableBalance();
			
			// The amount needed may exceed the available balance
			double overdraftTxAmount = available > currentAmountNeeded 
					? available - currentAmountNeeded 
					: available;
			
			if (overdraftTxAmount > 0){
				overdraftAcct.transferTo(this, overdraftTxAmount);
				currentAmountNeeded -= overdraftTxAmount;
			}
			
			if (currentAmountNeeded <= 0){
				break;
			}
		}
		
		
	}
	
	@Override
	public void postInterest() {
		// Do nothing as this account does not earn interest
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
	public void postTransaction(Transaction transaction) throws TransactionException {
		
		this.transactionHistory.add(transaction);		
		balance += transaction.getAmount();		
		if (transaction.getAmount() < 0 && balance < 0){
			performOverdraftProcedure(Math.abs(balance));
		}		
	}
	

	@Override
	public void AddOverdraftSource(OverdraftAccount overdraftAccount) {
		this.overdraftAccountList.add(overdraftAccount);		
	}

	@Override
	public void RemoveOverdraftSource(String accountNumber) {
		
		AccountNumberPredicate predicate = new AccountNumberPredicate(accountNumber);
		this.overdraftAccountList.removeIf(predicate);
				
	}
	@Override
	public double getAvailableBalance() {
		return balance > this.minimumRequiredBalance ? balance - this.minimumRequiredBalance : 0;
	}

	
	

}
