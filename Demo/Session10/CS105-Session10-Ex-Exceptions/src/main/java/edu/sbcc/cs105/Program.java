package edu.sbcc.cs105;

import java.io.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		processFile("data.txt");
	}
	
	public static void processFile(String fileName) {
		
		int recordSize = 0;
		
		try {
			getRecordCount(fileName, recordSize);			
			System.out.println("this code executed will not execute if error occured abov it in try block");
			
		} catch (FileNotFoundException ex) {
			System.out.println("File was not found");
		} catch (IOException ex) {
			System.out.println("Some other IOException: " + ex.getMessage());
		} finally {
			System.out.println("this code executed even if error occured");
		}
	}
	
	public static int getRecordCount(String fileName, int recordSize) throws IOException {
		
		int fileSize = getFileCharacterCount(fileName);		
		
		return fileSize / recordSize;
	}
	
	public static int getFileCharacterCount(String fileName) throws IOException {
		
		int fileChars = 0;
		try(FileReader fr = new FileReader(fileName)){
			BufferedReader bufferedReader = new BufferedReader(fr);

            String line;
            
			while((line = bufferedReader.readLine()) != null) {
               fileChars += line.length();
            }   
			
            // Always close files.
            bufferedReader.close();
            
            // Will cause an exception since reader has been closed
            //Uncomment this to get an IOException:  bufferedReader.readLine();
		}
		
		return fileChars; 
	}

}
