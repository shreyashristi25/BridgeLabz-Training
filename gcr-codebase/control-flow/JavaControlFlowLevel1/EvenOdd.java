
import java.util.* ;
public class EvenOdd {
   public static void main (String args[]) {
      Scanner input = new Scanner (System.in) ;
	  
	  //creating variable number to store number 
	  int number ;
	  System.out.println("Enter the number : ") ;
	  number = input.nextInt() ;
	  
	  if(number > 0) {
	     for(int i=1 ; i<=number ; i++ ) {
		    if(i % 2 == 0) {
			   System.out.println("The number " +i +" is even ") ;
			}
			else {
			   System.out.println("The number " +i +" is odd ") ;
			}
		 }
	  }
	  else {
	     System.out.println("Invalid Input") ;
	  }
	  input.close() ;
   }
}