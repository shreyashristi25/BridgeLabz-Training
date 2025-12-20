
import java.util.* ;
public class SpringSeason  {
	
	//creating a method checkingForSpring for checking spring season
	public boolean checkingForSpring (int m, int d) {
		
		if(m == 3 && d >= 20) {
			return true ;
		}
		else if(m > 3 && m < 6) {
			return true ; 
		}
		else if(m == 6 && d <= 20) {
			return true ; 
		}
		else {
			return false ;
		}
	}
	public static void main (String args[]) {
      Scanner input = new Scanner (System.in) ;
	  
	  //creating variables month and day and getting user input
	  int month = Integer.parseInt(args[0]);
	  int day = Integer.parseInt(args[1]) ;
	  SpringSeason springSeason =  new SpringSeason() ;
	  boolean spring = springSeason.checkingForSpring(month, day) ; 
	  if(spring){
		System.out.println("Its a spring season") ;
	  }
	  else {
		System.out.println("Not a spring season") ;
	  }
	  
	  input.close() ;
	
   }
}