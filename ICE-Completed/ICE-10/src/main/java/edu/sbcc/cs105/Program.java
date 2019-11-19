package edu.sbcc.cs105;


/**
 * Program
 */
public class Program {

    public static void main(String[] args) throws Exception {
        
        Account account = new SavingsAccount("12345", 50, .12);
        System.out.printf("The balance is %.2f%n", account.getBalance());

        account.credit(10);
        account.debit(-5);

        //account.postInterest();

        SavingsAccount savings = (SavingsAccount)account;
        savings.postInterest();

        System.out.printf("The balance is %.2f%n", account.getBalance());

        CheckingAccount chkAcct = (CheckingAccount)account;

        
    }
}