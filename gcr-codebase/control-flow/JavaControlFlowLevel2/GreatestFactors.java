
import java.util.* ;
public class GreatestFactors {
   public static void main (String args[]) {
      Scanner input = new Scanner (System.in) ;
	  
	  //creating variable number and getting user input
	  int number ;
	  int greatestFactor = 1 ;
	  System.out.println("Enter a number : ") ;
	  number = input.nextInt() ;
	  
	  //Checking if the number is positive and finding the greatest factor
	  if(number > 0) {
		for(int i = number - 1; i >= 1; i--) {
			if(number % i == 0) {
				greatestFactor = i ;
				break ;
			}
		}
		System.out.println("Greatest factor of " +number +" is " +greatestFactor) ;
	  }
	  
	  else {
		System.out.println("Invalid Input : Please enter a positive number") ;
	  }
	  input.close() ;
   }
}