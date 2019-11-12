package edu.sbcc.cs105;

import java.util.Scanner;

public class Program {

	public static void main(String[] args){
		
	 	String delimString = "ABCD";
		Scanner s = new Scanner(delimString);
		s.useDelimiter("");
		s.close();

		System.out.println(s.next());
		System.out.println(s.next());
		System.out.println(s.next());
		System.out.println(s.next());
		 

		
		String numString = "1234";
		String numString2 = "A1234";

		int number = -1;

		
		try{
			int a = 0;
			int b = 42/a;

			number = Integer.parseInt(numString2);
		}catch (NumberFormatException ex){

			System.out.println("That is not a valid numeric string");
		} catch (ArithmeticException ex){
			System.out.println(ex.getMessage());
		}

		System.out.printf("the number is %d", number);
	


	}
	

	
}
