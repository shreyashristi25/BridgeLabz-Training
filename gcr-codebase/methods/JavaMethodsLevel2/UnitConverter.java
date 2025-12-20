
import java.util.*  ;
public class UnitConverter {

	// creating methods convertKmToMiles, convertMilesToKm, convertMetersToFeet, convertFeetToMeters  
	public static double convertKmToMiles(double km) {
        double km2miles = 0.621371 ;
        return km * km2miles ;
    }
	public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934 ;
        return miles * miles2km ;
    }
	public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084 ;
        return meters * meters2feet ;
    }
	public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048 ;
        return feet * feet2meters ;
    }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		//creating variables km, miles, meters and feet and getting user input and displaying the result
		System.out.println("Enter distance in km : ") ;
		double km = input.nextDouble() ;
        System.out.println("Enter distance in miles : ") ;
		double miles = input.nextDouble() ;
        System.out.println("Enter distance in meters : ") ;
		double meters = input.nextDouble() ;
        System.out.println("Enter distance in feet : ") ;
        double feet = input.nextDouble() ;
        
        System.out.println(km + " km in miles is : " + convertKmToMiles(km) + " miles") ;
        System.out.println(miles + " miles in km is " + convertMilesToKm(miles) + " km") ;
        System.out.println(meters + " meters in feet is " + convertMetersToFeet(meters) + " feet") ;
        System.out.println(feet + " feet in meters is " + convertFeetToMeters(feet) + " meters") ;
		
        input.close()  ;
    }
}