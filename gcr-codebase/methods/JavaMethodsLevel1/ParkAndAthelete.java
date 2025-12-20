
import java.util.* ;
public class ParkAndAthelete {
	
	//creating methods named computePerimeter and computeRounds to calculate the perimeter of the traingle and the number of rounds athelete needs to complete 5km
	public double computePerimeter(double a, double b, double c) {
		double perimeter = a + b + c ;
		return perimeter ;
	}
	public double computeRounds ( double p ) {
	double rounds = 5 / p ;
		return rounds ;
	}
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in) ;
		
		//getting sides of the traingle from the user and computing the number of rounds required for the athelete to complete 5km
		System.out.println("Enter the first side of the traingle : ") ;
		double side1 = input.nextDouble() ;
		System.out.println("Enter the second side of the traingle : ") ;
		double side2 = input.nextDouble() ;
		System.out.println("Enter the third side of the traingle : ") ;
		double side3 = input.nextDouble() ;
		if(side1 < 0 || side2 < 0 || side3 < 0 ) {
			System.out.println ("Invalid input! : Please enter a positive number") ;
		}
		
		ParkAndAthelete pa = new ParkAndAthelete() ;
		double perimeter =  pa.computePerimeter(side1, side2, side3) ;
		double rounds = pa.computeRounds (perimeter) ;
		if(perimeter >= 5) {
		System.out.println("The number of rounds the athelete needs to complete 5 km are : " +rounds) ;
		}
		else {
			System.out.println("The number of rounds the athelete needs to complete 5 km are : " +(rounds+1)) ;
		}
    input.close() ;
	  
   }
}