package edu.sbcc.cs105;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) throws FileNotFoundException  {

		
		StudentFileImporter fileImporter 
			= new StudentFileImporter();
			try {

			/*
			Path filePath = Paths.get(
				".\\StudentDataFile.txt");
			String fullPath = filePath.toAbsolutePath().toString();
			String fullPath =
				".\\StudentDataFile.txt";

*/
			String fullPath =
				".\\Demo\\Session08\\CS105-Session08-Ex-FileImporter\\StudentDataFile.txt";
						
			fileImporter.load(fullPath);


		} catch (FileNotFoundException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PrintWriter w = new PrintWriter("c:\\temp\\data.txt");

		ArrayList<Student> students = fileImporter.getStudents();
		for(Student s : students){
			w.printf("%s  %-40s  %.2f%n", 
			s.getId(), 
			s.getLastName() + ", " + s.getFirstName(), 
			s.getGpa().doubleValue() );
		}
		w.close();

		System.out.println("Done!");
	}

}
