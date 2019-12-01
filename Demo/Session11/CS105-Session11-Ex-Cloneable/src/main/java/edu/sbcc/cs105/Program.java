package edu.sbcc.cs105;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) throws Exception {
	
		List<Student> stuList = new ArrayList<Student>();
		
		DegreeProgram prog = new DegreeProgram("COMPSCI", "Compouter Science");
		Student stu = new Student("123456", "Joe", prog);
		Student stu2 = (Student) stu.clone();
		
		System.out.println(stu2.getName());
		System.out.println(stu2.getProgram().getMajorName());

		//stu.setProgram(new DegreeProgram("ENGL", "English"));
		stu.getProgram().setMajorName("Englsih");

		System.out.println(stu2.getName());
		System.out.println(stu2.getProgram().getMajorName());
	}

	

}
