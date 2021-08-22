package simonSays;

public class SimonSays 
{
	public static void main(String[] args) 
	   {		   
		      String simonPattern = "";			//Simon's pattern
		      String userPattern = "";			//User's pattern
		      int userScore = 0;			//keep score
		      int i = 0;				//loop counter

		      userScore = 0;
		      simonPattern = "RRGBRYYBGY";				//preset Simon pattern
		      userPattern  = "RRGBBRYBGY";				//preset user's pattern

		      for(i = 0; i < simonPattern.length(); ++i)		//iteration is length of Simon's pattern
		      {
		    	  if(simonPattern.charAt(i) == userPattern.charAt(i))	//compare characters at index locations-enter of equal
		    	  {
		    		  userScore++;					//add 1 to score
		    	  }
		    	  else
		    	  {
		    		  break;					//break out of loop once mismatch is found
		    	  }
		      }

		      System.out.println("userScore: " + userScore);		//print score

		      return;
		   } 	
}
