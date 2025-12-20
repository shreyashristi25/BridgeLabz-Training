
import java.util.*   ;
public class MeasurementConverter {

	// creating methods convertFahrenheitToCelsius, convertCelsiusToFahrenheit, convertPoundsToKilograms, convertKilogramsToPounds, convertGallonsToLiters and convertLitersToGallons 
	public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5.0 / 9.0;
        return fahrenheit2celsius;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9.0 / 5.0) + 32;
        return celsius2fahrenheit;
    }
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

	public static void main(String args  []) {
		Scanner input = new Scanner(System.in)  ;
		
		//creating variables fahrenheit, celsius, pounds, kilograms, gallons and liters and getting user input and displaying the result
		
		System.out.println("Enter temperature in fahrenheit : ")  ;
		double fahrenheit = input.nextDouble()  ;
        System.out.println("Enter temperature in celsius : ")  ;
		double celsius = input.nextDouble()  ;
        System.out.println("Enter weight in pounds : ")  ;
		double pounds = input.nextDouble()  ;
        System.out.println("Enter weight in kilograms : ")  ;
        double kilograms = input.nextDouble()  ;
		System.out.println("Enter volume in gallons : ")  ;
        double gallons = input.nextDouble()  ;
		System.out.println("Enter volume in liters : ")  ;
        double liters = input.nextDouble()  ;
        
        System.out.println(fahrenheit + "°F in celsius is : " + convertFahrenheitToCelsius(fahrenheit) + "°C");
        System.out.println(celsius + "°C in fahrenheit is : " + convertCelsiusToFahrenheit(celsius) + "°F");
        System.out.println(pounds + " pounds in kilograms is :" + convertPoundsToKilograms(pounds) + " kilograms");
        System.out.println(kilograms + " kilograms in pounds is : " + convertKilogramsToPounds(kilograms) + " pounds");
        System.out.println(gallons + " gallons in litres is : " + convertGallonsToLiters(gallons) + " liters");
        System.out.println(liters + " liters in gallons is : " + convertLitersToGallons(liters) + " gallons");


        input.close() ;
    }
}