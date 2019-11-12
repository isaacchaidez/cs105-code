package main.java.edu.sbcc.cs105;

/**
 * Account
 */
public class Account {

    String accountNumber;
    double balance;
    
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void credit(double amount) throws Exception
    {

        if (amount < .01){
            throw new Exception("Credit amount must be at least $0.01");
        }
    }

    public void debit(double amount) throws Exception {
        if (amount > -.01){
            throw new Exception("Credit amount must be at least $0.01");
        }

        if (balance - amount < 0){
            throw new Exception("Balance cannot be less than zero");
        }
    }


    
}