package edu.sbcc.cs105;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

import javax.sound.midi.SysexMessage;

/**
 * FileLogger
 */
public class ConsoleLogger implements ILogger {

    private PrintStream printStream;

    public ConsoleLogger(PrintStream ps) {
       this.printStream = ps;
    }
    @Override
    public void Log(String message) throws FileNotFoundException {
        printStream.print(message);
    }

    
}