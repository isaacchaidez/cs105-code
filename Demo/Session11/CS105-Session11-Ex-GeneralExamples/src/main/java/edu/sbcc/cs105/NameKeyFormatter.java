package edu.sbcc.cs105;

public class NameKeyFormatter implements NameFormatter {

	@Override
	public String format(Student student) {
		// TODO Auto-generated method stub
		return student.getLastName().substring(0, 3) + student.getFirstName().substring(0, 2);
	}

}
