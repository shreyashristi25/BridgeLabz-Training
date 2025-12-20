
import java.util.* ;
public class SimpleInterest {

	//creating a method computeSimpleInterest for calculating simple interest
	public double computeSimpleInterest (double p, double r, double t) {
		double simpleInterest = ( p * r * t ) / 100 ;
		return simpleInterest ;
	}
    public static void main (String args[]) {
		Scanner input = new Scanner(System.in) ;
		
		//getting user input for principal, rate and time and displaying the simple interest as result
		System.out.println("Enter the principal amount : ") ;
		double principal = input.nextDouble() ;
		System.out.println("Enter the rate of interest : ") ;
		double rate = input.nextDouble() ;
		System.out.println("Enter the time : ") ;
		double time = input.nextDouble() ;
		
		SimpleInterest si = new SimpleInterest() ;
		double simpleInterest = si.computeSimpleInterest (principal, rate, time) ;
		System.out.println("The simple Interest is " +simpleInterest +" for principal " +principal +", Rate of Interest " +rate +" and Time " +time) ;
	   
	  input.close() ;
	  
   }
}