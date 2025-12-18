
import java.util.* ;
public class Factors {
   public static void main (String args[]) {
      Scanner input = new Scanner (System.in) ;
	  
	  //creating variable number and getting user input
	  int number ;
	  System.out.println("Enter a number : ") ;
	  number = input.nextInt() ;
	  
	  //Chceking if the number is positive and printing the factors
	  if(number > 0) {
		for(int i = 1 ; i <number ; i++) {
			if(number % i == 0) {
				System.out.println(i) ;
			}
		}
	  }
	  else {
		System.out.println("Invalid Input : Please enter a positive number") ;
	  }
	  input.close() ;
   }
}