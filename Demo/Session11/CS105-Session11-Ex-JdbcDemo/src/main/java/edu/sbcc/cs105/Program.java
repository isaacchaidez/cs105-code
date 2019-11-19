package edu.sbcc.cs105;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException {
		
		String connectionString = "jdbc:mysql://localhost/tracker?user=AppServiceUser&password=kangaroo1";
		
		StudentRepository repo = new StudentRepository(connectionString);
		
		do{
			
			boolean exit = false;
			
			System.out.println("Enter a command for Student: C - Create; F - Find; Q - Quit");
			
			Scanner s = new Scanner(System.in);
			String command = s.nextLine();
			
			
			switch(command){
			case "C":
				System.out.println("Create Student");
				break;
			case "F":
				System.out.println("Find Student");
				break;
			case "Q":
				System.out.println("Quitting");
				exit = true;
				break;
			default:
				System.out.println("No such command");
				break;
			}
			
			s.close();
			
			if (exit){ break;}
			
		}while (true);

	}
	
	 

}
