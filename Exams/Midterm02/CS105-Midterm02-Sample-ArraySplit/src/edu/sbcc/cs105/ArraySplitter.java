package edu.sbcc.cs105;

public class ArraySplitter {

	public int[][] splitOnEvenOddIndexes(int[] arrayToSplit){
		
		int[][] result = new int[2][];
		
		int origArrayLength = arrayToSplit.length;
		
		int lengthOddIndexArray = origArrayLength / 2;
		int lengthEvenIndexArray = origArrayLength - lengthOddIndexArray;
		
		result[0] = new int[lengthEvenIndexArray];
		result[1] = new int[lengthOddIndexArray];
		for (int arrayIdx = 0; arrayIdx < origArrayLength; arrayIdx++) {
			
			// We could use an if statement to determine which array to put it in, but this accomplishes the same thing
			int destArray = arrayIdx % 2;
			
			// Divide by 2 because each destination array is half or half+1 of original 
			int destArrayIdx = arrayIdx/2;				
			result[destArray][destArrayIdx] = arrayToSplit[arrayIdx];
			
		}
		return result;
		
	}
}
