package edu.sbcc.cs105;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySplitter splitter = new ArraySplitter();
		
		int[][] result = splitter.splitOnEvenOddIndexes(new int[] {1, 2, 3, 4, 5});
		
		for (int i = 0; i < result.length; i++) {
			System.out.printf("Array %d: {",i);
			
			for(int arrayIdx = 0; arrayIdx < result[i].length; arrayIdx++) {
				System.out.printf("%d, ", result[i][arrayIdx]);
			}
			
			System.out.println("}");
		}
	}

}
