import java.util.* ;
public class CountDownFor {
   public static void main (String args[]) {
      Scanner input = new Scanner (System.in) ;
	  
	  //creating variable number and getting user input
	  int number ;
	  System.out.println("Enter the number : ") ;
	  number = input.nextInt() ;
	  
	  // Counting number from number to 1
	  for(int i = number ; number >=1 ; number --)
	  {
	     System.out.println(number) ;
	  }
      input.close() ;
   }
}