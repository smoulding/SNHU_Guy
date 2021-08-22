package enumerationsGroceryItems;

public class EnumerationsGroceryItems 
{
	public enum GroceryItem {GR_APPLES, GR_BANANAS, GR_JUICE, GR_WATER};					//assign outside Main method
	
	public static void main(String[] args) 
	   {
		   
			GroceryItem userItem = GroceryItem.GR_APPLES;									//preset to Green Apples

		      if(userItem == GroceryItem.GR_APPLES || userItem == GroceryItem.GR_BANANAS)	//is fruit?
		      {
		    	  System.out.println("Fruit");
		      }  
		      
		      
		      else if(userItem == GroceryItem.GR_JUICE || userItem == GroceryItem.GR_WATER)	//is drink?
		      {
		    	  System.out.println("Drink");
		      }
		      
		      else
		      {
		    	  System.out.println("error");												//not in enum
		      }   
		      
		      return;
		}
}
