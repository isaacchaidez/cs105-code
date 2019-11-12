package edu.sbcc.cs105;

public class GraduateStudent extends Student {
	private String gradStudentType;
	//private String studentId;
	
	public GraduateStudent(String studentId, String gradStudentType) {
		
		
		super(studentId);
		
		
		this.gradStudentType = gradStudentType;	
	}

	@Override
	public FeeCalculationMethod getFeeCalculationMethod() {

		FeeCalculationMethod feeMethod = super.getFeeCalculationMethod();
		if (gradStudentType == "2ND-BA") {
			feeMethod.addAdditionalUnitCost(25);
		} else if (gradStudentType == "PhD"){
			feeMethod.addAdditionalUnitCost(50);
		} 

		return feeMethod;
	}
}
