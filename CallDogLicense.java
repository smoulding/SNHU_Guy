package dog_license;

public class CallDogLicense 
{
	public static void main (String [] args) 
	{
	      DogLicense dog1 = new DogLicense();	//new dog license object

	      dog1.setYear(2014);					//set current year
	      dog1.createLicenseNum(777);			//set custom id number
	      System.out.println("Dog license: " + dog1.getLicenseNum());//output license number to terminal

	      return;
	   }
}
