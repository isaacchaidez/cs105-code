package edu.sbcc.cs105;

import org.apache.commons.lang3.StringUtils;

public class Program {

	public static void main(String[] args) {

		System.out.println(padString("12345", 'Z', 9));

	}
	
	/**
	 * Pads a provided string on the left side with a specified character to specified total length
	 *  
	 * @param stringToPad  The string to pad
	 * @param padCharacter The character we want to use to pad the string
	 * @param paddedLength The padded string length
	 * @return A string padded to the left with the specified character to a specified length 
	 */
	public static String padString(String stringToPad, char padCharacter, int paddedLength) {
		
		// Change this value to 1, 2, or 3 to use the different pad methods below
		int method = 1;
		
		int length = stringToPad.length();
		
		// Obviously, we don't need to pad something that already meets or exceeds required length
		if (length >= paddedLength) {
			return stringToPad;
		}
		
		
		// Determine how many characters we have to pad the original string with
		int numberOfPadChars = paddedLength - length;
		
		// Initialize padString to empty so it can be used in any of the three methods 
		String padString = "";
				
		// There are multiple methods to do this, some more elegant than others
		// Method 1: Primitive
		if (method == 1) {
			// Convert pad char to a single character string, so we don't have to repeat ourselves later
			String padCharAsString =new String(new char[] {padCharacter});
					
			// Initialize padString so we can build it with a loop
			for (int i = 0; i < numberOfPadChars; i++)
			{
				padString += padCharAsString;
			}
		}
		
		// Method 2: Simple, relies on the default value of a char being \0.
		if (method == 2) {
			padString = new String(new char[numberOfPadChars]).replace("\0", "Z");
		}
			
		// Method 3:  Simple, more intuitive, but requires adding an external library (JAR - Java Archive) reference to 
		// the Apache Commons Library commons-lang3-3.7.jar				
		if (method == 3) {
			padString = StringUtils.repeat(padCharacter, numberOfPadChars);
		}

		
		
		String result = padString.concat(stringToPad);		
		
		return result;
		
	}

}
