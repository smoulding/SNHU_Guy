package volume_of_a_pyramid;

public class VolumeOfAPyramid 
{
	public static double pyramidVolume(double baseLength, double baseWidth, double pyramidHeight) //returns pyramid volume
	{
		double baseArea = baseLength * baseWidth;
		double volume = baseArea * pyramidHeight * (1.0/3.0);
		return volume;
	}
	
	public static void main (String [] args)	
	{
		System.out.println("Volume for 1.0, 1.0, 1.0 is: " + pyramidVolume(1.0, 1.0, 1.0)); //preset values for pyramid, calls method
	    return;
	}	
}
