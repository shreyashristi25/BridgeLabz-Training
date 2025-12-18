
import java.util.* ;
public class CheckSmallest {
   public static void main (String args[]) {
      Scanner input = new Scanner(System.in) ;
	  
	  //creating variables number1, number2, number3 and getting user input
	  int number1, number2, number3 ;
	  System.out.println("Enter first number : ") ;
	  number1 = input.nextInt() ;
	  System.out.println("Enter second number : ") ;
	  number2 = input.nextInt() ;
	  System.out.println("Enter third number : ") ;
	  number3 = input.nextInt() ;
	  
	  //Checking if the first number is smallest among the tree or not and displaying result
	  if (number1 < number2 && number1 < number3) {
	  System.out.println("Is the first number the smallest?" + " Yes") ;
	  }
	  else {
	  System.out.println("Is the first number the smallest?" + " No") ;
	  }
	 
	}
}