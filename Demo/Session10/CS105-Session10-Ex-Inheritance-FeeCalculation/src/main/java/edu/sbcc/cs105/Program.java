package edu.sbcc.cs105;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<Student>();
		
		Student stu = new Student("012345678");
		studentList.add(stu);
		
		stu = new GraduateStudent("123456789", "2ND-BA");
		studentList.add(stu);
		
		stu = new GraduateStudent("234567890", "MS");
		studentList.add(stu);
		
		stu = new GraduateStudent("345678910", "PhD");
		studentList.add(stu);
		
		for(Student s: studentList){
			
			FeeCalculationMethod feeMethod = s.getFeeCalculationMethod();
			System.out.printf("Student %s pays %f per unit%n", 
					s.getStudentId(), feeMethod.getFeePerUnit());
			
		}
	}

}
