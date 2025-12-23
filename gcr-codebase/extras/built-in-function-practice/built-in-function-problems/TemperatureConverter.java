
import java.util.* ;
public class TemperatureConverter {

    //creating functions toCelsius and toFahrenheit to convert celsius to fahrenheitand vice versa
    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 ;
    }

    public static double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32 ;
    }
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

		//getting user input for choice and displaying result accordingly
        System.out.println("Temperature Converter") ;
        System.out.println("1. Fahrenheit to Celsius") ;
        System.out.println("2. Celsius to Fahrenheit") ;
        System.out.print("Choose an option (1 or 2): ") ;
        int choice = input.nextInt() ;

        System.out.print("Enter temperature: ") ;
        double temp = input.nextDouble() ;

        if (choice == 1) {
            double result = toCelsius(temp) ;
            System.out.println(temp + "°F = " + result + "°C") ;
        } else if (choice == 2) {
            double result = toFahrenheit(temp) ;
            System.out.println(temp + "°C = " + result + "°F") ;
        } else {
            System.out.println("Invalid choice!") ;
        }

        input.close() ;
    }
}
