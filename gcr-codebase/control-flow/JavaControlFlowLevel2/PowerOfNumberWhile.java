
import java.util.* ;
public class PowerOfNumberWhile {
   public static void main (String args[]) {
      Scanner input = new Scanner (System.in) ;
	  
	  //creating variable number and getting user input
	  int number, power;
	  System.out.println("Enter a number : ") ;
	  number = input.nextInt() ;
	  System.out.println("Enter a power : ") ;
	  power = input.nextInt() ;
	  int result = 1 ;
	  int counter = 0 ;
	  
	  //checking for positive and computing power and printing result using while loop 
		while(counter != power) {
			result = result * number ;
			counter ++ ;
		}
		System.out.println("The result of " +number +" to the power " +power +" is " +result) ;
		
	  input.close() ;
   }
}