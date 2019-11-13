package edu.sbcc.cs105;

public class FeeCalculationMethod {

	private double costPerUnit;

	public FeeCalculationMethod(double costPerUnit) {

		this.costPerUnit = costPerUnit;
	}

	public double getFeePerUnit() {
		// TODO Auto-generated method stub
		return costPerUnit;
	}

	void addAdditionalUnitCost(double additionalUnitCost){
		this.costPerUnit += additionalUnitCost;
	}

}
