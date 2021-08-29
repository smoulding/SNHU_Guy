package dog_license;

/*Define the missing method. licenseNum is created as: (100000 * customID) + licenseYear. 
* Sample output: Dog license: 77702014
*/

public class DogLicense 
{
	   private int licenseYear;		//current year
	   private int licenseNum;		// license number

	   public void setYear(int yearRegistered) //license year setter
	   {
	      licenseYear = yearRegistered;
	      return;
	   }

	   public void createLicenseNum(int customID) // create license number
	   {
		   licenseNum = 10000 * customID + licenseYear;
		   return;
	   }
	   
	   public int getLicenseNum() // license number getter
	   {
	      return licenseNum;
	   }
}
