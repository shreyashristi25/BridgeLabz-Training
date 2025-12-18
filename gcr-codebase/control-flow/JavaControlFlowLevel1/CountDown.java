import java.util.* ;
public class CountDown {
   public static void main (String args[]) {
      Scanner input = new Scanner (System.in) ;
	  
	  //creating variable number and getting user input
	  int number ;
	  System.out.println("Enter the number : ") ;
	  number = input.nextInt() ;
	  
	  // Counting number from number to 1
	  while(number >= 1)
	  {
	     System.out.println(number) ;
		 number -- ;
	  }
	  input.close() ;
   }
}