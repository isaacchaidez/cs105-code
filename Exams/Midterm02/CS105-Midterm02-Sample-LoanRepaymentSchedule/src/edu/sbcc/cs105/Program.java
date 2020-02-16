package edu.sbcc.cs105;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Loan loan = new Loan(1000, .12, 36); 

		RepaymentSchedule schedule = loan.calculateRepayment(); 

		schedule.print(System.out); 

		 
	}

}
