package edu.sbcc.cs105;

public class Program {

	public static void main(String[] args) {

		/*
		Logger fileLogger = new FileLogger("c:\\logs\\mylog.txt");		
		Logger databaseLogger = new DatabaseLogger("sql1.sbcc.edu", 2433, "EventLog");
		Logger twitterLogger = new TwitterLogger("myAccountKey", "myAccountSecret");
		
		Student s;
		s = new Student("Joe", "Octavius", "Gaucho", twitterLogger);
		s.setFirstName("Steve");

		Student s2 = new Student("Jane", "Ariana", "Gaucho", fileLogger);
		s2.setFirstName("Maria");

		*/
		
		
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
		
		//list.printList(new MailNameFormatter());
		
		System.out.println();
		
		list.printList(new NameListFormatter());
		
		//list.printList(new NameKeyFormatter());
	}
	
	public static void executeLog(Logger logger) {
		
	}

}
