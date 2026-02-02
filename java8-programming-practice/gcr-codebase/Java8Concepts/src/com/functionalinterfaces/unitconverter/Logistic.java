package com.functionalinterfaces.unitconverter;
import java.util. * ;

public class Logistic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//taking user choice as input, performing conversions and displaying result accordingly
        
        System.out.println("Choose conversion type:");
        System.out.println("1. Kilometeres to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Kilograms to Lbs");
        System.out.println("4. Lbs to Kilograms");
        System.out.println("Enter your choice  : ") ;
        
        int choice = sc.nextInt();
        double input, result;

        switch (choice) {
            case 1:
                System.out.print("Enter distance in Km: ");
                input = sc.nextDouble();
                
                result = UnitConverter.kmToMile(input);
                System.out.println(input + " Km = " + result + " Miles");
                break;

            case 2:
                System.out.print("Enter distance in Miles: ");
                input = sc.nextDouble();
                
                result = UnitConverter.milesToKm(input);
                System.out.println(input + " Miles = " + result + " Km");
                break;

            case 3:
                System.out.print("Enter weight in Kg: ");
                input = sc.nextDouble();
                
                result = UnitConverter.kgToLbs(input);
                System.out.println(input + " Kg = " + result + " Lbs");
                break;

            case 4:
                System.out.print("Enter weight in Lbs: ");
                input = sc.nextDouble();
                
                result = UnitConverter.lbsToKg(input);
                System.out.println(input + " Lbs = " + result + " Kg");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();

	}

}
