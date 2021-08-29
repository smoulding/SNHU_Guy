package kelvin_celsius;

public class KelvinCelcius 
{
	public static double celsiusToKelvin(double valueCelsius) //method converts Celcius to Kelvin
	   {
	      double valueKelvin = 0.0;

	      valueKelvin = valueCelsius + 273.15;

	      return valueKelvin;
	   }

	   public static double kelvinToCelsius(double valueKelvin) //method converts Kelvin to Celcius
	   {
	      double valueCelsius = 0.0;

	      valueCelsius = valueKelvin - 273.15;

	      return valueCelsius;
	   }



	   public static void main (String [] args) //main method calls methods for conversions
	   {
	      double valueC = 0.0;
	      double valueK = 0.0;

	      valueC = 10.0;
	      System.out.println(valueC + " C is " + celsiusToKelvin(valueC) + " K");

	      valueK = 283.15;
	      System.out.println(valueK + "  is " + kelvinToCelsius(valueK) + " C");

	      return;
	   }
}
