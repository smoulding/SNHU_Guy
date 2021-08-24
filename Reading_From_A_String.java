package reading_from_a_string;

import java.util.Scanner;

public class Reading_From_A_String 
{
	public static void main(String[] args) 
	{		
	      String userInput = "Aug 24 2021";
	      Scanner inSS = new Scanner(userInput);			//input string stream using userInput

	      String userMonth = "";					//declare variables
	      int userDate = 0;
	      int userYear = 0;

	      userMonth = inSS.next();					//update String variables from ISS
	      userDate = inSS.nextInt();
	      userYear = inSS.nextInt();

	      inSS.close();						//close scanner
	      
	      System.out.println("Month: " + userMonth);		//output to screen
	      System.out.println("Date: " + userDate);
	      System.out.println("Year: " + userYear);
	      return;
	 }	
}
