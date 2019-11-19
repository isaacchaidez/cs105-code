package edu.sbcc.cs105;

public class MailNameFormatter implements NameFormatter {

	@Override
	public String format(Student student) {

		return student.getFirstName() + " " + student.getLastName();
		
	}

}
