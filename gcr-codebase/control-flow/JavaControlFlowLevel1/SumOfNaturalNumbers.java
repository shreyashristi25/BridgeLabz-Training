
import java.util.* ;
public class SumOfNaturalNumbers {
   public static void main (String args[]) {
      Scanner input = new Scanner(System.in) ;
	  
	  //creating varibale number and getting input from user
	  int number ;
	  int sum=0 ;
	  System.out.println("Enter the number : ") ;
	  number = input.nextInt() ;
	  
	  //checking for natural number, computing the sum, and displaying the result
	  if(number >=1) {
	     sum = number * (number + 1) / 2 ;
		 System.out.println ("The sum of "+number +" natural numbers is " + sum) ;
	  }
	  else {
	     System.out.println("The number " +number +" is not a natural number") ;
	  }
   }
   input.close() ;

}