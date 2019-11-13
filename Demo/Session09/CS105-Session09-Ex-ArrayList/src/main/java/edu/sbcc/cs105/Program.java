package edu.sbcc.cs105;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.reflect.Field;

public class Program {

	public static void main(String[] args) throws Exception {
				
		//String[] items = "1,2,3,4,5".split(",");
		
		int[][] grades = { 
		{1, 80, 75, 89}, 
		{2, 90, 92, 97}, 
		{3, 76, 65, 45}
		};

		grades[0] = new int[] {1, 88, 99, 77, 66};
		System.out.println(grades[0].length);
		System.out.println(grades[1].length);

				
				
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(3);
		intList.add(4);
		intList.add(2);
		intList.add(1);

		Collections.sort(intList);
		
		for(int i: intList){
			System.out.println(i);
		}
		
		/*
		int upper = 10;
		int[] myInts = new int[upper];
		for (int i = 0; i < (new Random()).nextInt(200); i++){

		 System.out.println(i);
		 if (i == upper ){
		  upper *= 1.5;
		  myInts = Arrays.copyOf(myInts, upper);
		  System.out.printf("Increased array to a new capacity of %d elements%n", upper);
		 }
		}
		*/
		
		 ArrayList<Integer> myInts = new ArrayList<Integer>();
		 System.out.printf("The array list started with a capacity of %d elements",	
				 getCapacity(myInts));

		for (int i = 0; i < 100; i++){
			myInts.add(i + 1);
			System.out.printf("The array list now has a capacity of %d "
					+ "elements and contains %d items%n", 
				getCapacity(myInts), myInts.size());
		}

	}

	static int getCapacity(ArrayList<?> l) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(l)).length;
    }

}
