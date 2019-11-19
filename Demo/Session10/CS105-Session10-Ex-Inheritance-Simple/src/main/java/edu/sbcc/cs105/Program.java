package edu.sbcc.cs105;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
	
		
		Animal a1 = new Dog("Dog");
		Animal a2 = new Cat("Cat");
		Animal a3 = new Bird("Bird");

		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(a1);
		animalList.add(a2);
		animalList.add(a3);
		
		for(Animal a: animalList) {
			System.out.printf("The %s says %s%n", 
			a.getName(), a.speak());
		}
		
		

	}

}
