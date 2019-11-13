package edu.sbcc.cs105;

/**
 * InterestAccount
 */
public class InterestAccount extends Account {

    private double interestRate;

    public InterestAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void postInterest() throws Exception {

        double periodicInterestRate = interestRate / 12;

        double interestEarned = periodicInterestRate * getBalance();

        super.credit(interestEarned);
    }

    
}