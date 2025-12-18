
import java.util.* ;
public class Largest {
   public static void main (String args[]) {
      Scanner input = new Scanner (System.in) ;
	  
	  //creating variables  number1, number2, number3 and getting user input
	  int number1, number2, number3 ;
	  System.out.println ("Enter the first number : ") ;
	  number1 = input.nextInt() ;
	  System.out.println ("Enter the second number : ") ;
	  number2 = input.nextInt() ;
	  System.out.println ("Enter the third number : ") ;
	  number3 = input.nextInt() ;
	  
      //checking for the largest number
	  if(number1 > number2 && number1 > number3) {
	     System.out.println("Is the first number the largest? " +"Yes") ;
	     System.out.println("Is the second number the largest? " +"No") ;
	     System.out.println("Is the third number the largest? " +"No") ;
	  }
	  else if(number2 > number1 && number2 > number3) {
	     System.out.println("Is the first number the largest? " +"No") ;
	     System.out.println("Is the second number the largest? " +"Yes") ;
	     System.out.println("Is the third number the largest? " +"No") ;
	  }
	  else {
	     System.out.println("Is the first number the largest? " +"No") ;
	     System.out.println("Is the second number the largest? " +"No") ;
	     System.out.println("Is the third number the largest? " +"Yes") ;
	  }
	  input.close() ;
   }
}