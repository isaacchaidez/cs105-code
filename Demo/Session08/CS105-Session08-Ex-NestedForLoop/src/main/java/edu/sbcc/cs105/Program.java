package edu.sbcc.cs105;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		
		// Create students
		Student s1 = new Student("12345", "Joe Gaucho");
		Student s2 = new Student("12346", "Jane Vaquero");
		Student s3 = new Student("12347", "Jose Gaucho");
		Student s4 = new Student("34567", "Julia Gaucho");
		Student s5 = new Student("98765", "Inigo Montoya");
		Student s6 = new Student("87654", "Fezzig");
		Student s7 = new Student("65432", "Prince Humperdink");
		
		Student[] ss;
		
		ArrayList<Student> students = new ArrayList<Student>() {{
			add(s1);
			add(s2);
			add(s3);
			add(s4);
			add(s5);
			add(s6);
			add(s7);
			
		}};
		
		
		
		ArrayList<CourseOffering> offerings = new ArrayList<>();
		CourseOffering o1 = new CourseOffering("S19", "62500", "CS105", "Theory and Practice I", 24);
		o1.enroll(s1);
		o1.enroll(s2);
		o1.enroll(s3);
		
		CourseOffering o2 = new CourseOffering("S19", "62496", "CS104", "Introduction to Programming", 24);
		o2.enroll(s2);
		o2.enroll(s1);
		o2.enroll(s4);
		o2.enroll(s5);
		
		CourseOffering o3 = new CourseOffering("S19", "62502", "CS104", "Theory and Practice II", 2);
		o3.enroll(s5);
		o3.enroll(s6);
		o3.enroll(s7);
		
		
		offerings.add(o1);
		offerings.add(o2);
		offerings.add(o3);
		
		System.out.println("Enrollments By Course Offering and Student");
		// Print by course and then enrolled student
		for (CourseOffering o : offerings) {
			
			System.out.printf("%s: %s%n", o.getTermCode(), o.getTitle());
			
			for(Student s : o.getEnrolledStudents()) {
				
				System.out.println(s.getName());
			}
			System.out.println();
		}
		System.out.println();
		
		//Print by student then course offering
		System.out.println("Enrollments by Student and then Course Offering");
		for(Student s : students) {
						
			System.out.println(s.getName());
			for (CourseOffering o : s.getEnrollments()) {
				
				System.out.printf("%s: %s%n", o.getTermCode(), o.getTitle());
			}
			System.out.println();
		}
		
	}
}
