
import java.util.* ;
public class FactorialWithFor {
   public static void main (String args[]) {
      Scanner input = new Scanner (System.in) ;
	  
	  //creating varibale number and getting user input
	  int number ;
	  System.out.println("Enter the number : ") ;
	  number = input.nextInt() ;
	  int factorial = 1 ;
	  int num = number ;

      //computing factorial of number
      if (number > 0) {
	     for(int i= num ; num >= 1 ; i--) {
		    factorial = factorial * num ;
		 }
		 System.out.println("The factorial of " +number +" is " +factorial) ;
	  }	 
      else {
	     System.out.println ("Invalid input ") ;
	  }	 
      input.close() ;	  
	 
   }
}