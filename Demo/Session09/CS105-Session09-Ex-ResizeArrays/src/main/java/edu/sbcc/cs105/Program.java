package edu.sbcc.cs105;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Program {

	public static void main(String[] args) throws Exception {

		resizeArrayListEx1();
	}

	static void resizeArrayList() {

		int upper = 10;
		int[] myInts = new int[upper];
		int randomSize = (new Random()).nextInt(200);
		for (int i = 0; i < randomSize; i++) {

			
			System.out.println(i);
			if (i == upper) {
				upper *= 1.5;
				myInts = Arrays.copyOf(myInts, upper);
				System.out.printf("Increased array to a new capacity of %d elements%n", upper);
			} else{
				myInts[i] = i;
			}
		}

		System.out.printf("Final size of the array was %d", upper);

	}

	static void resizeArrayListEx1() throws Exception {

		ArrayList<Integer> myInts = new ArrayList<Integer>();
		System.out.printf("The array list started with a capacity of %d elements", getCapacity(myInts));

		for (int i = 0; i < 100; i++) {
			myInts.add(i + 1);
			System.out.printf("The array list now has a capacity of %d elements and contains %d items%n",
					getCapacity(myInts), myInts.size());
		}

	}

	static int getCapacity(ArrayList<?> l) throws Exception {
		Field dataField = ArrayList.class.getDeclaredField("elementData");
		dataField.setAccessible(true);
		return ((Object[]) dataField.get(l)).length;
	}

	static void resizeArrayEx2() {

		int upper = 10;
		int[] myInts = new int[upper];
		int[] intsCopy = myInts;

		Random r = new Random();
		for (int i = 0; i < 50; i++) {

			System.out.println(i);
			if (i == upper) {
				upper *= 1.5;
				myInts = Arrays.copyOf(myInts, upper);
				System.out.printf("Increased array to a new capacity of %d elements%n", upper);
			}

			myInts[i] = r.nextInt(25) + 1;

		}

	}

}
