package person;

public class PersonInfo 
{
	private int numKids; 						//store number of kids

	   public void setNumKids(int personsKids) 			//number of kids setter
	   {	
	      numKids = personsKids;
	      return;
	   }

	   public void incNumKids() 					//method adds 1 to number of kids
	   {
	      numKids = numKids + 1;
	      return;
	   }

	   public int getNumKids() 					//number of kids getter
	   {
	      return numKids;
	   }
}
