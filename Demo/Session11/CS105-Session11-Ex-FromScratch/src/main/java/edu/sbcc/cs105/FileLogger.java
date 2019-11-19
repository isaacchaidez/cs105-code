package edu.sbcc.cs105;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * FileLogger
 */
public class FileLogger implements ILogger {

    private String fileName;

    public FileLogger(String fileName) {
       this.fileName = fileName;
    }
    @Override
    public void Log(String message) throws FileNotFoundException {
        try(PrintWriter pw = new PrintWriter(fileName)){
            pw.print(message);
            pw.close();
        }
    }

    
}