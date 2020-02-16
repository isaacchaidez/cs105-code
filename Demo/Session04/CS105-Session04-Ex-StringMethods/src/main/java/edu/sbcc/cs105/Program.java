package edu.sbcc.cs105;

public class Program {

	/**
	 * this this entry point
	 * @param args pass arguments from command line
	 */
	public static void main(String[] args) {

//		// Get the first n characters of string
//		String dataString = "Hello Java";
//		int start = 6;
//		int end = 7;
//		
//		String firstWord = dataString.substring(start);//, end);
//		System.out.println(firstWord);

		
		String dataString = "Hello The Java";

		// Get position of first space
		int indexOfSpace1 = dataString.indexOf(" ");

		// Starting at position after first space, get the position of the second space
		int indexOfSpace2 = dataString.indexOf(" ", indexOfSpace1 + 1);

		// Get the substring that starts in the next position after first space and ends at 
		// the position before the second space
		String secondWord = dataString.substring(indexOfSpace1 + 1, indexOfSpace2);
		System.out.println(secondWord);

		int length = secondWord.length();
		System.out.printf("The second word is %d characters long", length);

		int indexOfJ = dataString.lastIndexOf('e');
		System.out.printf("The last e occurs at index: %d", indexOfJ);

	}

}
