package edu.sbcc.cs105;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double area = calculateRiemannSum(20, 0, 10);
		System.out.println(area);
		
		area = calculateRiemannSum2(20, 0, 10);
		System.out.println(area);
		
		area = calculateRiemannSum3(20, 0, 10);
		System.out.println(area);
	}
	
	public static double calculateRiemannSum(int intervals, int startX, int endX) {
		
		double result = 0;
		
		double rectWidth = ((double)(endX - startX)) / intervals;
		
		for (double i = startX; i < endX; i+= rectWidth) {
			
			double height = Math.pow(i, 2) + 2 * i - 1;
			double area = height * rectWidth;
			result += area;
		}
		
		return result;
	}
	
	public static double calculateRiemannSum2(int intervals, int startX, int endX) {
		
		double result = 0;
		
		double rectWidth = ((double)(endX - startX)) / intervals;
		
		double sumOfY = 0;
		for (double i = startX; i < endX; i+= rectWidth) {
			
			sumOfY += Math.pow(i, 2) + 2 * i - 1;
			
		}
		
		result = sumOfY * rectWidth;
		return result;
	}
	
	public static double calculateRiemannSum3(int intervals, int startX, int endX) {
				
		double rectWidth = ((double)(endX - startX)) / intervals;
		
		double sum = 0;
		for (double k = 0; k < intervals; k++) {
			
			double a = k * rectWidth + startX;
			sum += Math.pow(a, 2);
			sum += 2*a;
			sum--;
		}
		
		sum *= rectWidth;
		return sum;
	}

}
