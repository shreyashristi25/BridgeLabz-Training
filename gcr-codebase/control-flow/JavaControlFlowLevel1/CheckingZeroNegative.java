
import java.util.* ;
public class CheckingZeroNegative {
   public static void main (String args[]) {
      Scanner input = new Scanner (System.in) ;
	  
	  //creating variables total and assign 0.0, create variable value and take user input
	  double total = 0.0 ;
	  double value ;
	  System.out.println("Enter a value : ") ;
	  value = input.nextDouble() ;
	  
	  //computing total until user enters 0
	  
	     while(value > 0 ) {
	     total = total + value ;
	     System.out.println("Enter a value again") ;
		 value = input.nextDouble() ;
		 
		 }
		
	  System.out.println("Total sum of numbers : " +total) ;
	  
	  input.close();
   }
}
