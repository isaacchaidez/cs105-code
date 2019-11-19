package edu.sbcc.cs105;

public class Student {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private int id;
	
	public Student(String firstName, String middleName, String lastName, int id){
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
		setId(id);
	}
	

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	
}
