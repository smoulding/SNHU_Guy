package drawing_A_Half_Arrow;

import java.util.Scanner;

public class DrawingAHalfArrow 
{
	public static void main(String[] args) 
	{
	      Scanner scnr = new Scanner(System.in);	//scanner
	      int arrowBaseHeight = 0;					//arrow base height
	      int arrowBaseWidth  = 0;					//arrow base width
	      int arrowHeadWidth = 0;	      			//arrow head width
	      
	      // collect user input
	      System.out.println("Enter arrow base height: ");
	      arrowBaseHeight = scnr.nextInt();
	      
	      System.out.println("Enter arrow base width: ");
	      arrowBaseWidth = scnr.nextInt();
	      
	      System.out.println("Enter arrow head width: ");
	      arrowHeadWidth = scnr.nextInt();
	      
	      if(arrowHeadWidth <= arrowBaseWidth)			//check for suitable arrow head width
	      {
	    	  while(arrowHeadWidth <= arrowBaseWidth)	// loop until suitable arrow head width is input
		      {
		    	  
		    	  System.out.println("Enter arrow head width: ");
		    	  arrowHeadWidth = scnr.nextInt();
		      }
	      }
	      	      
	      for(int i = 1; i <= arrowBaseHeight; ++i)		//draw base height
	      {
	    	  for(int j = 1; j <= arrowBaseWidth; ++j)	//draw base width
	    	  {
	    		 System.out.print("*");
	    	  }
	    	  System.out.println();						//next line
	      }
	      
	      while(arrowHeadWidth >= 1)					//draw arrow head
	      {
	    	  for(int i = 1; i <= arrowHeadWidth; ++i)
	    	  {
	    		  System.out.print("*");
	    		  
	    	  }
	    	  System.out.println();
	    	  --arrowHeadWidth;
	      }
	      
	      return;
	   }
}
