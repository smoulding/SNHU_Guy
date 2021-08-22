package nestedLoopsIndentText;

public class NestedLoopsIndentText 
{
	public static void main (String [] args) 
	{
	      //initialize variables
	      int userNum = 3;							//preset to 3
	      int i = 0;							//loop initializer
	      int j = 0;							//nested loop initializer
	      
	      //indent text
	      for (i = 0; i <= userNum; ++i)		
	      {
	    	  for(j=1; j <= i; ++j)
	    	  {
	    	     System.out.print(" ");
	    	  }	    	  
	    	  System.out.println(i);	    	  
	      }
	      return;
	}
}
