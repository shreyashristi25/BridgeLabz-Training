
import java.util.* ;
public class Voters {
   public static void main (String args[]) {
      Scanner input = new Scanner(System.in) ;
	  
	  //craeting variable age and getting user input
	  int age ;
	  System.out.println ("Enter your age : ") ;
	  age = input.nextInt() ;
	  
	  //Checking if user can vote and displaying result
	  if(age >= 18) {
	     System.out.println ("The person's age is " +age +" and can vote.") ;
	  }
	  else {
	     System.out.println ("The person's age is " +age +" and cannot vote.") ;
	  }
	  input.close() ;
   
   }
}