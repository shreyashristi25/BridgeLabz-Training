
import java.util.* ;
public class Multiplication {
   public static void main (String args[]) {
      Scanner input = new Scanner (System.in) ;
	  
	  //creating variable number to store number 
	  int number ;
	  System.out.println("Enter the number : ") ;
	  number = input.nextInt() ;
	  
	  //Printing multiplication table of the entered number
	  if(number >= 6 && number <= 9)
	  {
	     for(int i = 1 ; i <= 10 ; i++) {
	        System.out.println ("Multipliaction table of " +number +" is:") ;
		    System.out.println (number * i) ; 
	   }
	  }
	  else {
		  System.out.println("Invalid Input") ;
	  }
	  input.close() ;
	  
   }
}