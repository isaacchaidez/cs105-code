package edu.sbcc.cs105;

public class Program {

	public static void main(String[] args) {

		byte a = 25;
		int b = 42;
		int c = 410;
		
		a = (byte)b;
		System.out.printf("The value of converting byte %d to an int is %d%n", b, a);

		a = (byte)c;
		System.out.printf("The value of converting byte %d to an int is %d%n",c, a);
	
		
		float d = 42f;
		double e = 1.0;
		double f = Double.MAX_VALUE;

		d = (float)e;
		System.out.printf("The value of converting double %f to a float is %f%n", e, d);
		
		d = (float)f;
		System.out.printf("The value of converting double %f to a float is %f%n", f, d);
		
	}

}
