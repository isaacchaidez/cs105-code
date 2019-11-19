package edu.sbcc.cs105.bankmodel;

import java.util.function.Predicate;

public class AccountNumberPredicate implements Predicate<Account> {

	private String accountNumber;
	
	public AccountNumberPredicate(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public boolean test(Account arg0) {

		return accountNumber == arg0.getAccountNumber();
	}

}
