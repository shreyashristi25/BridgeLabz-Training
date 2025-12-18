
import java.util.* ;
public class FactorsWhile {
   public static void main (String args[]) {
      Scanner input = new Scanner (System.in) ;
	  
	  //creating variable number and getting user input
	  int number ;
	  System.out.println("Enter a number : ") ;
	  number = input.nextInt() ;
	  int counter = 1 ;
	  
	  if(number > 0) {
		while(counter <= number) {
			if(number % counter == 0) {
				System.out.println(counter) ;
			}
			counter ++ ;
		}
	  }
	  else {
		System.out.println("Invalid Input : Please enter a positive number") ;
	  }
	  input.close() ;
   }
}