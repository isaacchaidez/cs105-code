package edu.sbcc.cs105;

import java.io.PrintStream;
import java.util.ArrayList;

public class StudentList extends ArrayList<Student> {
	private PrintStream outputStream;
	public StudentList(PrintStream outputStream){		
		this.outputStream = outputStream;		
	}
	
	public void printList(NameFormatter formatter){		
		for (Student s :this){
			outputStream.println(s.getFormattedName(formatter));
		}
	}
	
}
