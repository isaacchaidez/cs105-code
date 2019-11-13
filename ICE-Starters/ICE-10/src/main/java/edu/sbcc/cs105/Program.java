package edu.sbcc.cs105;


/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        
        Account account = new Account("12345", 50.);
        System.out.printf("The balance is %.2f%n", account.getBalance());
    }
}