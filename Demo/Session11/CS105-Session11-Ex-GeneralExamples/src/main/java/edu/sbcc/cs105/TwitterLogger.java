package edu.sbcc.cs105;

public class TwitterLogger implements Logger {

	public TwitterLogger(String accountKey, String accountSecret) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Log(LogLevel level, String event) {

		// Code to send to twitter over their API here
		System.out.printf("Trump says '%s'%n", event);
	}

}
