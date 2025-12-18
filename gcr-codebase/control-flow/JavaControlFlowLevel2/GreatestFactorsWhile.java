
import java.util.* ;
public class GreatestFactorsWhile {
   public static void main (String args[]) {
      Scanner input = new Scanner (System.in) ;
	  
	  //creating variable number and getting user input
	  int number ;
	  int greatestFactor = 1 ;
	  System.out.println("Enter a number : ") ;
	  number = input.nextInt() ;
	  int counter = number - 1 ;
	  
	  //Chceking if the number is positive and printing the greatestfactor
	  if(number > 0) {
		while(counter >=1 ) {
			if(number % counter == 0) {
				greatestFactor = counter ;
				break ;
			}
			counter -- ;
		}
		System.out.println("Greatest factor of " +number +" is " +greatestFactor) ;
	  }
	  
	  else {
		System.out.println("Invalid Input : Please enter a positive number") ;
	  }
	  input.close() ;
   }
}