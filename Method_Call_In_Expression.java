/* Assign to maxSum the max of (numA, numB) PLUS the max of (numY, numZ).*/ 

package method_call_in_expression;

public class Method_Call_In_Expression 
{
	public static double findMax(double num1, double num2) //returns the max number
	{
	      double maxVal = 0.0;
	      
	      if (num1 > num2) 
	      { 										// if num1 is greater than num2,
	         maxVal = num1;  						// then num1 is the maxVal.
	      }	      
	      else 
	      {             							// Otherwise,
	         maxVal = num2;  						// num2 is the maxVal.
	      }
	      return maxVal;
	}

	public static void main(String [] args) 
	{
	   // preset values
	   double numA = 5.0;
	   double numB = 10.0;
	   double numY = 3.0;
	   double numZ = 7.0;
	   double maxSum = 0.0;

	   maxSum = (findMax(numA, numB) + findMax(numY, numZ)); // call methods and assign to maxSum 


	   System.out.print("maxSum is: " + maxSum); //output result to screen
	}
}
