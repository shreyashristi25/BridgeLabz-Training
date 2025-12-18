
import java.util.* ;
public class CheckingZero {
   public static void main (String args[]) {
      Scanner input = new Scanner (System.in) ;
	  
	  //creating variables total and assign 0.0, create variable value and take user input
	  double total = 0.0 ;
	  double value ;
	  System.out.println("Enter a value : ") ;
	  value = input.nextDouble() ;
	  
	  //computing total until user enters 0
	  if(value !=0.0)
	     while(value != 0) {
	        total = total + value ;
	        System.out.println("Enter a value again") ;
		    break ;
		}
		 
	  
	  System.out.println(total) ;
	  input.close() ;
   }
}