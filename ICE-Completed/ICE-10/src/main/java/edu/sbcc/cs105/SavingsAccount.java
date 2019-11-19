package edu.sbcc.cs105;

/**
 * SavingsAccount
 */
public class SavingsAccount extends InterestAccount {

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance, interestRate);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void debit(double amount) throws Exception {

        System.out.println("In SavingsAccount");

        if (getBalance() - amount < 50){
            throw new Exception("Balance cannot fall below $50");
        }

        super.debit(amount);
    }
}