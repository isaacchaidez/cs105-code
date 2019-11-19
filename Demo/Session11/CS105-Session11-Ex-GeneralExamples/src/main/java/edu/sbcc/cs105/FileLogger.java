package edu.sbcc.cs105;

public class FileLogger implements Logger {

	private String path;
	
	public FileLogger(String path){
		this.path = path;
	}
	@Override
	public void Log(LogLevel level, String event) {
		
		// Code here to write to file
		System.out.println("Pretend we are logging to a file");
	}

}
