package edu.sbcc.cs105;

public class Program {

	public static void main(String[] args) {


		
		StudentRepository repo = new StudentRepositoryMock();
		
		Student s = new Student("Joe", "A", "Gaucho", 1);
		repo.saveStudent(s);
		
		Student s1 = repo.getStudent(1);
		System.out.printf("%s %s", s1.getFirstName(), s1.getLastName());

	}

}
