package edu.sbcc.cs105;

import java.util.Scanner;

public class Program {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	
		int y = 'A';

		//Uncomment / Comment out example calls
		//DoEx1();
		//DoEx2();
		DoEx3();
		
	}

	public static void DoEx1() {
		// Ex1 - Read in using next<type>
		Scanner s = new Scanner(System.in);

		/*
		System.out.println("Enter an integer");
		int i = s.nextInt();

		System.out.println("Enter an double");
		double f = s.nextDouble();
		*/

		System.out.println("Enter anything you want");
		String str = s.nextLine();

		//System.out.printf("int: %d; double: %f, string:%s", i, f, str);

		System.out.printf("You entered the value '%s', %d%n", str, 42);
		s.close();

	}

	public static void DoEx2() {

		// Ex2 - Read a string
		Scanner s2 = new Scanner("This is a sentence");
		s2.useDelimiter("");
		
		System.out.println(s2.next());
		System.out.println(s2.next());
		System.out.println(s2.next());
		System.out.println(s2.next());

		s2.close();
	}
	
	public static void DoEx3() {
		
		  int f = 42; float g = 15.771113f;
		  
		  System.out.printf("%4d%n", f); 
		  System.out.printf("%.2f%n", g);
		 
	}

}
