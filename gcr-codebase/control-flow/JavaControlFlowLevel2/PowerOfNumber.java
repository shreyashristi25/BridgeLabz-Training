
import java.util.* ;
public class PowerOfNumber {
   public static void main (String args[]) {
      Scanner input = new Scanner (System.in) ;
	  
	  //creating variable number and getting user input
	  int number, power;
	  System.out.println("Enter a number : ") ;
	  number = input.nextInt() ;
	  System.out.println("Enter a power : ") ;
	  power = input.nextInt() ;
	  int result = 1 ;
	  
	  //checking for positive and computing power and printing result
		for(int i = 1 ; i <= power ; i++) {
			result =result * number ;
		}
		System.out.println("The result of " +number +" to the power " +power +" is " +result) ;
		
	  input.close() ;
   }
}