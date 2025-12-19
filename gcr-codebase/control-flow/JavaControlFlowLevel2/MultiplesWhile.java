
import java.util.* ;
public class MultiplesWhile {
   public static void main (String args[]) {
      Scanner input = new Scanner (System.in) ;
	  
	  //creating variable number and getting user input
	  int number ;
	  System.out.println("Enter a number : ") ;
	  number = input.nextInt() ;
	 
	  
	  //Chceking if the number is positive and less than 100 and printing its multiples
	  if(number > 0 && number < 100) {
		int counter = number - 1 ;
		while(counter > 1) {
			if(number % counter == 0) {
				System.out.println(counter) ;
			    counter -- ;
				continue ;
			}
			counter -- ;	
		}
	  }
	  else {
		System.out.println("Invalid Input : Please enter a positive number and number below 100") ;
	  }
	  input.close() ;
   }
}