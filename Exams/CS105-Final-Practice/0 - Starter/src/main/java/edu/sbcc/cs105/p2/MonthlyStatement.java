package edu.sbcc.cs105.p2;

public class MonthlyStatement extends Document {

	String message = "";
	public MonthlyStatement(double balance) {
		
		message = "Your balance is " + balance;
	}

	public String getMessage(){
		return message;
	}
}
