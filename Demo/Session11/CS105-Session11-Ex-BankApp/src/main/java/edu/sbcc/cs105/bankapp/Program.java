package edu.sbcc.cs105.bankapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import edu.sbcc.cs105.bankmodel.*;

public class Program {

	public static void main(String[] args) throws TransactionException {

		InterestRate ir = new InterestRate(.12, CompoundType.MONTHLY, 12);
		OverdraftAccount sa = new SavingsAccount("234", "my savings", 500, 1, ir);
		CheckingAccount ca = new CheckingAccount("123","my account", 5, 5.00  );
		ca.AddOverdraftSource(sa);
		
		Overdraftable oa = (Overdraftable)ca;
		
		Account acct = (Account)oa;

		ca.debit(100);
		
//		@SuppressWarnings("unused")
//		SavingsAccount sa = (SavingsAccount)acct;
//		
//		
//		
//		
//		double[][] scheduleData = {{500, 10},{1000,5}};
//		FeeSchedule schedule = new FeeSchedule(scheduleData);
//		
	List<Account> myAccounts = new ArrayList<Account>();
		
		OverdraftAccount loc = new LineOfCredit(
				"123456789",
				"My LOC Account",
				301.32, 
				500.00, 
				new InterestRate(.12, CompoundType.DAILY, 12));
		
		SavingsAccount savings = new SavingsAccount(
				"234567890", 
				"My Savings Account", 
				150, 
				5, 
				new InterestRate(.0125, CompoundType.MONTHLY, 12));
		
		SavingsAccount savings2 = new SavingsAccount(
				"334567890", 
				"My Savings Account 2", 
				450, 
				5, 
				new InterestRate(.0125, CompoundType.MONTHLY, 12));
	
		
		Account checking = new CheckingAccount("987654321", "My Checking Account", 5.0, 0);
		
		myAccounts.add(loc);
		myAccounts.add(savings);
		myAccounts.add(savings2);
		myAccounts.add(checking);
		
		Collections.sort(myAccounts, null);
		
		for (Account a: myAccounts){
			System.out.printf("%s : %s%n", a.getAccountName(), a.getBalance());
		}
		/**
		System.out.printf("%s compared to %s = %d", 
				savings.getAccountName(), 
				savings2.getAccountName(), 
				savings.compareTo(savings2));
		**/
	}
	
//		// Because variable "checking" is of type Account, you will not see the Overdraftable methods on it.
//		// Therefore, you would need to cast either to Overdraftable or CheckingAccount
//		Overdraftable odAcct = (Overdraftable)checking;
//		odAcct.AddOverdraftSource(loc);
//		odAcct.AddOverdraftSource(savings);
//		
//		myAccounts.add(loc);
//		myAccounts.add(savings);
//		myAccounts.add(checking);
//		
//		// Print out initial balances
//		for (Account a : myAccounts){
//			System.out.printf("%s (%s)%nBalance: %f%nTransaction History%n", a.getAccountName(), a.getAccountNumber(), a.getBalance());
//			System.out.println();
//			System.out.println();
//		}
//		System.out.println("---------------------------------------------");
//		
//		checking.postTransaction(new Transaction(TransactionType.CHECK, "Check #451", new Date(), -300));
//		checking.postTransaction(new Transaction(TransactionType.DEPOSIT, "Deposit pay check", new Date(), 1000));			
//		checking.transferTo(savings, 300.00);
//		
//		AccountBase b = null;
//		for (Account a : myAccounts){
//			
//				
//			System.out.printf("%s (%s)%nBalance: %f%nTransaction History%n", a.getAccountName(), a.getAccountNumber(), a.getBalance());
//			for (Transaction tx : a.getTransactionHistory()){
//				System.out.printf("%tm/%<td/%<tY | %s - %s | %f%n", tx.getTransactionDate(), tx.getTransactionType(), tx.getDescription(), tx.getAmount());
//			}
//			
//			
//			System.out.println();
//			System.out.println();
//			
//			//b = (AccountBase)a;
//		}
	
}
