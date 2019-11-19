package edu.sbcc.cs105.bankmodel;

public class FeeSchedule {
	private double[][] scheduleData;

	public FeeSchedule(double[][] scheduleData){
		this.scheduleData = scheduleData;
	}
	
	public double getFee(double balance){
		
		
		double feeResult = 0;
		for (double[] balanceRow : scheduleData){
			if (balance < balanceRow[0]){
				feeResult = balanceRow[1];
				break;
			}
		}
		
		return feeResult;
		
	}
}
