package edu.sbcc.cs105;

public class Loan {

	private double amount;
	private double interestRate;
	private int numberOfPayments;
	
	public Loan(double amount, double interestRate, int numberOfPayments) {
		
		this.amount = amount;
		this.interestRate = interestRate;
		this.numberOfPayments = numberOfPayments;
	}
	
	public RepaymentSchedule calculateRepayment() {
		
		RepaymentSchedule result = new RepaymentSchedule();
		
		double periodicInterestRate = interestRate / 12;
		
		double periodicPayment = (periodicInterestRate * amount) / 
				(1 - Math.pow(1+ periodicInterestRate, -numberOfPayments));
		
		double remainingBalance = amount;
		for (int paymentNo = 0; paymentNo < numberOfPayments; paymentNo++) {
			
			double interestThisPayment = periodicInterestRate * remainingBalance;
			double principle = periodicPayment - interestThisPayment;
			remainingBalance -= principle;
			 
			
			Payment p = new Payment();
			p.setPaymentNo(paymentNo);
			p.setPaymentAmount(periodicPayment);
			p.setPrincipal(principle);
			p.setInterest(interestThisPayment);
			p.setRemainingBalance(remainingBalance);
			
			result.add(p);
		}
		return result;
	}
}
