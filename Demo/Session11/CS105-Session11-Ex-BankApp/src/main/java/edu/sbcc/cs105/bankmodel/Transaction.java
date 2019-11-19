package edu.sbcc.cs105.bankmodel;

import java.util.Date;

public class Transaction {
	private Date date;
	private double amount;
	private TransactionType type;
	private String description;
	
	public Transaction(TransactionType type, String description, Date date, double amount){
		this.type = type;
		this.description = description;
		this.date = date;
		this.amount = amount;
	}
	
	public TransactionType getTransactionType(){
		return type;
	}
	
	public String getDescription(){
		return description;
	}
	public Date getTransactionDate(){
		return date;
	}
	
	public double getAmount(){
		return amount;
	}
	
	
}
