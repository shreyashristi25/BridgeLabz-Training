package com.junit.main.temperatureconverter;
import java.util.* ;

public class TempMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        TemperatureConverter converter = new TemperatureConverter();

        //taking temperature as user input and displaying result accordingly
        System.out.println("--- Temperature Converter ---");
        System.out.print("Enter temperature value: ");
        double value = sc.nextDouble();

        System.out.print("Convert to (F/C): ");
        char choice = sc.next().toUpperCase().charAt(0);

        if (choice == 'F') {
            System.out.println(value + "C = " + converter.celsiusToFahrenheit(value) + "F");
        } else if (choice == 'C') {
            System.out.println(value + "F = " + converter.fahrenheitToCelsius(value) + "C");
        } else {
            System.out.println("Invalid choice. Please enter F or C.");
        }

        sc.close();


	}

}
