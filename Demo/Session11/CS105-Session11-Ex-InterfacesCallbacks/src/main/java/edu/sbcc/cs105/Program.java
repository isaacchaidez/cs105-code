package edu.sbcc.cs105;

public class Program {

	public static void main(String[] args) {
	
		StudentList list = new StudentList(System.out);
		
		Student s;
		s = new Student("Joe", "Octavius", "Gaucho");
		list.add(s);
		
		s = new Student("Jane", "Ariana", "Gaucho");
		list.add(s);
		
		s = new Student("Billy", "Bob", "Smith");
		list.add(s);
		
		s = new Student("Arturo", "Ignatius", "Cruz");
		list.add(s);
		
		list.printList(new MailNameFormatter());
		
		System.out.println();
		
		list.printList(new NameListFormatter());
	}

}
