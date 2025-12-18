
import java.util.* ;
public class PositiveNegativeZero {
   public static void main (String args[]) {
      Scanner input = new Scanner (System.in) ;
	  
	  int number ;
	  System.out.println("Enter the number : ") ;
	  number = input.nextInt() ;
	  
	  // Checking for positive, negative, or zero and displaying output
	  if(number > 0) {
	     System.out.println("Positive ") ;
	  }
	  else if (number == 0) {
	     System.out.println("Zero ") ;
	  }
	  else {
	     System.out.println("Negative ") ;
	  }
	  input.close() ;
   
   }
}