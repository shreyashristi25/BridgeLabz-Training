
import java.util.*   ;
public class UnitConverterUtility {

	// creating methods convertYardsToFeet, convertFeetToYards, convertMetersToInches, convertInchesToMeters, convertInchesToCentimeters  
	public static double convertYardsToFeet(double yards) {
        double yards2feet = 3 ;
        return yards * yards2feet ;
    }
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333 ;
        return feet * feet2yards ;
    }
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701 ;
        return meters * meters2inches ;
    }
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254 ;
        return inches * inches2meters ;
    }
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54 ;
        return inches * inches2cm ;
    }

	public static void main(String args  []) {
		Scanner input = new Scanner(System.in)  ;
		//creating variables yards, feet, meters and inches and getting user input and displaying the result
		System.out.println("Enter distance in yards : ")  ;
		double yards = input.nextDouble()  ;
        System.out.println("Enter distance in feet : ")  ;
		double feet = input.nextDouble()  ;
        System.out.println("Enter distance in meters : ")  ;
		double meters = input.nextDouble()  ;
        System.out.println("Enter distance in inches : ")  ;
        double inches = input.nextDouble()  ;
        
        System.out.println(yards + " yards in feet is : " + convertYardsToFeet(yards) + " feet") ;
        System.out.println(feet + " feet in yards is : " + convertFeetToYards(feet) + " yards") ;
        System.out.println(meters + " meters in inches is : " + convertMetersToInches(meters) + " inches") ;
        System.out.println(inches + " inches in meters is : " + convertInchesToMeters(inches) + " m") ;
        System.out.println(inches + " inches in centimeters is  " + convertInchesToCentimeters(inches) + " cm") ;

        input.close()   ;
    }
}