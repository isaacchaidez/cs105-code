package edu.sbcc.cs105;

import java.math.BigDecimal;
import java.util.Date;

public class Student {

	private int id;
	private String lastName;
	private String firstName;
	private Date birthDate;
	private BigDecimal gpa;
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public BigDecimal getGpa() {
		return gpa;
	}
	public void setGpa(BigDecimal gpa) {
		this.gpa = gpa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
