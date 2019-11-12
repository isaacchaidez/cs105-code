package main.java.edu.sbcc.cs105;

/**
 * Account
 */
public class Account {

    String accountNumber;
    double balance;
    
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void credit(double amount){

        if (amount < .01){
            throw new Exception("Credit amount must be at least $0.01";
        }
    }

    public void debit(double amount){
        if (amount > -.01){
            throw new Exception("Credit amount must be at least $0.01";
        }
    }


    
}