package output_using_string_stream;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.StringWriter;

public class OutputUsingStringStream 
{
	public static void main(String[] args) 
	{		
		  Scanner scnr = new Scanner(System.in);
	      String userItem = "";

	      StringWriter itemCharStream = new StringWriter();
	      PrintWriter itemsOSS = new PrintWriter(itemCharStream);

	      System.out.println("Enter items (type Exit to quit):");
	      userItem = scnr.next();

	      while (!userItem.equals("Exit")) 	    	  
	      {
	    	 itemsOSS.print(userItem + " ");
	         userItem = scnr.next();
	      }

	      userItem = itemCharStream.toString();
	      System.out.println(userItem);
	      scnr.close();	      
    }	
}
