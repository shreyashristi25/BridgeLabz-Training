
import java.util.* ;
public class Multiples {
   public static void main (String args[]) {
      Scanner input = new Scanner (System.in) ;
	  
	  //creating variable number and getting user input
	  int number ;
	  System.out.println("Enter a number : ") ;
	  number = input.nextInt() ;
	  
	  //Chceking if the number is positive and less than 100 and printing its multiples
	  if(number > 0 && number < 100) {
		for(int i = 100 ; i >= 1 ; i--) {
			if(i % number == 0) {
				System.out.println(i) ;
				continue ;
			}
		}
	  }
	  else {
		System.out.println("Invalid Input : Please enter a positive number and number below 100") ;
	  }
	  input.close() ;
   }
}