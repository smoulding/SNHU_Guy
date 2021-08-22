package nestedLoopsPrintSeats;

public class NestedLoopsPrintSeats 
{
	public static void main(String[] args) 
	   {		   
		      int i = 0;									//loop initializer
		      int j = 0;									//nested loop initializer
		      int numRows = 2;								//preset number of rows
		      int numCols = 3;								//preset number of columns
		      char column = 'A';							//column initializer

		      //print rows and columns
		      for(i = 1; i <= numRows; ++i)
		      {
		    	  for(j = 1; j <= numCols; ++j)
		    	  {
		    		  System.out.print(i);
		    		  System.out.print(column);
		    		  System.out.print(" ");
		    		  column++;
		    	  }
		    	  column = 'A';
		      }
		      System.out.println("");
	   	}	
}
