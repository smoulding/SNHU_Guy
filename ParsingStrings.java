package parsing_strings;

import java.util.Scanner;

public class ParsingStrings 
{
	public static void main(String[] args) 
	{		  
		Scanner scnr = new Scanner(System.in);	//for keyboard user input
		Scanner parseName;						//for reading a string
		String string1;							//stores the string
		String firstWord;						//first word in string
		String secondWord;						//second word in string
		Boolean hasComma = false;				//checks for comma
		Boolean quit = false;					//for quit statement					
			
		while (!quit)							//while not quitting
		{
		System.out.println("Enter input string: ");	//prompt user
		string1 = scnr.nextLine();					//store user input in variable
		
		if (string1.equals("q"))					//check for quit statement
		{			
			quit = true;							//set to true if quitting
			System.out.println("Quitting program");
			break;									//break out of while loop
		}		
		
		//if not quitting, continue on 
		while (!hasComma)							//checks for a comma, loops till string has comma			
		{
			if (string1.contains(","))				//comma in string?
			{
				hasComma = true;					//set comma checker to true
			}
			
			//if there's no comma found, prompt user to enter a string with a comma
			else									
			{
				System.out.println("Error: No comma in string");
				System.out.println("Enter input string: ");
				string1 = scnr.nextLine();				
			}
		}
		
		//once string has comma 
		string1 = string1.replace("," , " ");					//replace comma with whitespace
		parseName = new Scanner(string1); 						//initiate scanner object for name parsing		
		
	      firstWord = parseName.next();							//place first word in variable
	      secondWord= parseName.next();	      					//place second word in variable
	      
	      System.out.println("First word: " +  firstWord);		//print out to user, first and second word
	      System.out.println("Second word: " + secondWord);	
	      
	      System.out.println();									//new line
	      System.out.println();									//new line
	      
	      hasComma = false;										//reset comma checker in case of re-loop
	      parseName.close();									//close scanner object
	      
		}
		scnr.close();											//close scanner object
		return;
    }
}
