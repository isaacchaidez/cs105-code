package edu.sbcc.cs105;

public class SavingsAccount extends Account {

	private double interestRate;
	
	public SavingsAccount(double balance) {
		super(balance);
	}
	public double getInterestRate() {
	  return interestRate;
	}
	public void setInterestRate(double interestRate) {
	  this.interestRate = interestRate;	  
	}
}
