package edu.sbcc.cs105.bankmodel;

import java.time.Year;

public class InterestRate{

	private double apr;
	private CompoundType compounded;
	private int numberOfCompoundIntervalsPerCalculation;

	public InterestRate(double apr, CompoundType compounded, int numberOfCompoundIntervalsPerCalculation){
		this.apr = apr;
		this.compounded = compounded;
		this.numberOfCompoundIntervalsPerCalculation = numberOfCompoundIntervalsPerCalculation;
	}
	
	public double calculateInterest(double averageDailyBalance){
		
		double compoundsPerYear = getNumberOfCompounds();
		double interest = averageDailyBalance 
				* Math.pow (1 + apr / compoundsPerYear, 
							compoundsPerYear / numberOfCompoundIntervalsPerCalculation);
		
		
		return interest;
	}

	private int getNumberOfCompounds() {

		int result;
		
		if (compounded == CompoundType.DAILY){
			Year thisYear = Year.now();
			result = thisYear.isLeap() ? 366 : 365;
		} else if (compounded == CompoundType.MONTHLY) {
			result = 12;
		} else {
			result = 1;
		}
		
		return result;
	}
}
