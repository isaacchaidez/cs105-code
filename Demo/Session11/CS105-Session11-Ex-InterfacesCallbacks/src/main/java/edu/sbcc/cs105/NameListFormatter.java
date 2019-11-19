package edu.sbcc.cs105;

public class NameListFormatter implements NameFormatter {

	@Override
	public String format(Student student) {

		String result = student.getLastName() + ", " + student.getFirstName() + ", ";		
		String middleName = student.getMiddleName();
		result += (middleName != null && !middleName.isEmpty() ? middleName : "NMI");
		
		return result;
	}

}
