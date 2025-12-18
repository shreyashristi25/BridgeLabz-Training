import java.util.* ;
public class SpringSeason  {
   public static void main (String args[]) {
      Scanner input = new Scanner (System.in) ;
	  
	  //creating two variables month and day and getting user input
	  
	  int month = Integer.parseInt(args[0]);
	  int day = Integer.parseInt(args[1]) ;
	  
	  //Checking for spring season
	  if(month == 3 && day >= 20) {
	     System.out.println ("Its a Spring Season ") ;
	  }
	  else if(month > 3 && month < 6) {
		 System.out.println ("Its a Spring Season ") ; 
	  }
	  else if(month == 6 && day <= 20) {
		 System.out.println ("Its a Spring Season ") ; 
	  }
	  else {
	     System.out.println ("Not a Spring Season ") ;
	  }
	  input.close() ;
	
   }
}