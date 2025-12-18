
import java.util.* ;
public class FizzBuzzWhile {
   public static void main (String args[]) {
      Scanner input = new Scanner (System.in) ;
	  
	  //creating variable number and getting user input
	  int number ;
	  System.out.println("Enter a number : ") ;
	  number = input.nextInt() ;
	  int i = 1 ;
	  
	  //checking for positive number and printing the output accprdingly by checking dividiblity
	  if(number > 0) {
		while (i <= number) {
			
		    if(i % 3 ==0 && i % 5 == 0) {
				System.out.println("FizzBuzz") ;
			}
			else if(i % 3 == 0) {
				System.out.println("Fizz") ;
			}
			else if(i % 5 == 0) {
				System.out.println("Buzz") ;
			}
			
			else {
				System.out.println (i) ;
			}
			i++ ;
		}
	  }  
	  else {
		System.out.println("Invalid Input : Please enter a positive number :") ;
	  }
	  input.close() ;
   }
}