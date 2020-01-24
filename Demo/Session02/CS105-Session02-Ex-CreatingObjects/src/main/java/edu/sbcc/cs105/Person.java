package edu.sbcc.cs105;
/**
 * This class represents a person
 * 
 * @author James Kinneavy
 *
 */
public class Person {

	private String firstName;
	private String lastName;

	// Static means shared across all Person objects
	private static int numberOfPeople = 0;
	
	/**
	 * Default constructor takes no args
	 */
	public Person(){
		
		firstName = "Uninitialized";
		lastName = "Uninitialized";
		numberOfPeople++;		
	}	
	
	public Person(String first, String last){
		
		firstName = first;
		lastName = last;
		numberOfPeople++;		
	}	
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Allows you to set the person's last name
	 * 
	 * @param lastName The last name of the person
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the numberOfPeople
	 */
	public static int getNumberOfPeople() {
		return numberOfPeople;
	}


	/**
	 * 
	 * @return Name of the person in First Last format
	 */
	public String getPrintName() {
		return firstName + " " + lastName;
	}

	
	
}
