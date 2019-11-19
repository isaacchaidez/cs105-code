package edu.sbcc.cs105;

public class Animal {
	
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
	public String speak(){
		return	"I am some kind of animal";
	}
	
	public String getName() {
		return name;
	}
}
