## ICE-10 : Inheritance

## ICE 10-1 – Basic Inheritance (20 minutes)

1. The classes already exist so you don’t need to create them.
2. Add the inheritance relationships shown below. Use extends keyword to make a class inherit from the one it points to (e.g. class InterestAccount extends Account{ … }
3. Add the following statement to the  first line of each constructor of each **derived** class: `super(accountNumber, initialBalance);`
4. In the InterestAccount.postInterest method, 
   1. Get the periodic interest rate: divide the interest rate by 12 , 
   2. Calculate interest earned this period: multiply balance *periodic interest rate
   3. Add interest to balance
5. Use Savings Account in **Program.main**
   1. Declare an instance of Account, but initialize to new SavingsAccount (Account acct = new SavingsAccount(args…);)
   2. Debit and credit a couple of transactions
   3. Print the balance
   4. Attempt to post interest. What happens?
   5. Declare a variable of type SavingsAccount and set it equal / cast to your account reference variable (e.g. SavingsAccount savings = (SavingsAccount) acct; )
   6. Attempt to post interest again. Does it work?
   7. Call credit method on savings variable. What is printed out?

![account class diagram](images/account-class-diagram)
 

## ICE 10-2 – Inheritance Specialization (10 minutes)

 

**2.1 – Overriding behavior**

1. Add a debit method to SavingsAccount with the same signature as the one in Account. Be sure to annotate it with an @overrides (above the method)

2. In the method body, 

   1. Put in a rule that prevents debit below $50. if the debit would be valid, call super.debit and pass in the amount to debit
   2. Put in a print statement that says “In SavingsAccount.debit”
   3. Update your Program.main to test the SavingsAccount.debit

3. Declare a variable of type Account, but initialize it to a new SavingsAccount

   Call the debit method

   What is printed out?

   

**2.2 – Casting**

1. In Program.main, declare and initialize a variable of type CheckingAccount
2. Declare a variable of type Account and set it equal to your checking account variable
3.  Call debit and credit a few times
4. Declare a variable of type Savings Account and attempt to cast your Account variable to it. What happens? 

 

## ICE 10-3 – Abstract Class (10 minutes, if time, otherwise do on your own)

1. Modify your InterestAccount class to be abstract (i.e. abstract class InterestAccount extends Account {…})
2. Declare a variable of type InterestAccount and attempt to initialize it to a new InterestAccount. What happens?
3. Modify the statement in step 2 and initialize it to a new SavingsAccount. Does that work?

 