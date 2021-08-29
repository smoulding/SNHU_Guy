package person;

public class CallPersonInfo 
{
	public static void main (String [] args) 
		{
	      PersonInfo person1 = new PersonInfo();								//new object

	      person1.setNumKids(3);												//set number of kids to 3

	      System.out.println("Kids: " + person1.getNumKids());					//output to screen
	      person1.incNumKids();													//invoke incNumKids method
	      System.out.println("New baby, kids now: " + person1.getNumKids());	//output to terminal new kids number

	      return;
	   }
}
