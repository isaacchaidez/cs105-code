package edu.sbcc.cs105;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a FICO score (300 - 850");
    
    String scoreAsString = input.nextLine();

    int score = Integer.parseInt(scoreAsString);

    System.out.printf("The value was %d", score);
}

}
