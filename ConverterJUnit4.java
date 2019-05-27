
public class ConverterJUnit4 {

	public double poundsToKgs(double userInput) {

		return userInput * 0.4535923;
	}

	public double kgsToPounds(double userInput) {

		return userInput / 0.4535923;
	}

	public double inchesToCms(double userInput) {

		return userInput / 0.39370;
	}

	public double cmsToInches(double userInput) {

		return userInput * 0.39370;

	}
	
	public double fahrenheitToCelsius(double userInput) {
		
		return (userInput - 32) * 5 / 9;
		
	}
	
	public double celsiusToFahrenheit(double userInput) {
		
		return userInput * 9 / 5  + 32;
		
	}

}
