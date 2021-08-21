// section 3:15, text message expander
// Scott Moulding 8/21/21

package textMessageExpander;

import java.util.Scanner;

public class TextMessageExpander 
{
   public static void main(String[] args) 
   {
	   Scanner scnr = new Scanner(System.in);
	   
	   String userInput;
	   String abbr;
	   String IDK = "I don't know";
	   String BFF = "best friend forever";
	   String JK = "just kidding";
	   String TMI = "too much information";
	   String TTYL = "talk to you later";
	   
	   System.out.println("Enter text");
	   userInput = scnr.nextLine();
	   scnr.close();
	   
	   System.out.println("You entered: " + userInput);
	   
	   if (userInput.contains("IDK"))
	   {
		abbr = "IDK";   
		userInput = userInput.replace("IDK", "I don't know");   
		System.out.println("Replaced " + abbr + " with " + IDK);	
		}
	   
	   if (userInput.contains("BFF"))
	   {
		abbr = "BFF";   
		userInput = userInput.replace("BFF", "best friend forever");   
		System.out.println("Replaced " + abbr + " with " + BFF);   
	   }
	   
	   if (userInput.contains("JK"))
	   {
		abbr = "JK";   
		userInput = userInput.replace("JK", "just kidding");   
		System.out.println("Replaced " + abbr + " with " + JK);   
	   }
	   
	   if (userInput.contains("TMI"))
	   {
		abbr = "TMI";   
		userInput = userInput.replace("TMI", "too much information");   
		System.out.println("Replaced " + abbr + " with " + TMI);   
	   }
	   
	   if (userInput.contains("TTYL"))
	   {
		abbr = "TTYL";   
		userInput = userInput.replace("TTYL", "talk to you later");   
		System.out.println("Replaced " + abbr + " with " + TTYL);   
	   }	   
	   
	   System.out.println("Expanded: " + userInput);
	 }
   }
