package edu.sbcc.cs105;

import java.io.PrintStream;
import java.util.ArrayList;

public class RepaymentSchedule {

	private ArrayList<Payment> payments = new ArrayList<Payment>();
	
	public void print(PrintStream out) {
		
		for(Payment p : payments) {
			System.out.printf("PmtNo: %d, Amount: %.2f, Principal: %.2f, Interest: %.2f, Remain: %.2f%n", 
				p.getPaymentNo() + 1, p.getPaymentAmount(), p.getPrincipal(), p.getInterest(), p.getRemainingBalance());
			
		}
	}

	public void add(Payment p) {

		payments.add(p);
		
	}
}
