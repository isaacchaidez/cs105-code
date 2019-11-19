package edu.sbcc.cs105;

public class Program {

	public static void main(String[] args) throws Exception {
	
		ILogger l1 = new FileLogger("c:\\temp\\output.txt");
		ILogger l2 = new ConsoleLogger(System.out);
		
		ILogger[] loggers = new ILogger[]{l1, l2};
		LogMessage(loggers, "hello and goodbye");
	}

	public static void LogMessage(ILogger[] loggers, String message) throws Exception {
		for (ILogger logger : loggers) {
			logger.Log(message);
		}
	}

}
