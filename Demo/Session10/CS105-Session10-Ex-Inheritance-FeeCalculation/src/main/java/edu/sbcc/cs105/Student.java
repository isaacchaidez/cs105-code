package edu.sbcc.cs105;

public class Student {

	protected String studentId;
	private static final double STANDARD_REGISTRATION_FEE  = 50;

	public Student(String studentId) {

		this.setStudentId(studentId);
	}

	public FeeCalculationMethod getFeeCalculationMethod() {
		return new FeeCalculationMethod(STANDARD_REGISTRATION_FEE);
	}

	public FeeCalculationMethod getFeeCalculationMethod(double discount) {
		return new FeeCalculationMethod(STANDARD_REGISTRATION_FEE - STANDARD_REGISTRATION_FEE *discount);
	}

	public String getStudentId() {
		return studentId;
	}

	protected void setStudentId(String studentId) {
		this.studentId = studentId;
	}
}
