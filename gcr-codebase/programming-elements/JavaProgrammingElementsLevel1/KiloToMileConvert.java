import java.util.*;
//create KiloToMileConvert class to take user input in kilometers and change it to miles
public class KiloToMileConvert {
   public static void main (String args[]) {
      Scanner input = new Scanner(System.in) ;
	  
	  //create variables to store distance in kilometers and miles
      double km ;
      double miles ;
      km = input.nextInt() ;
      miles = km / 1.6 ;
	  
	  //Displaying distance in kilometers and miles 
	  System.out.println(" The total miles is " +miles +" mile for the given " +km+ " km") ;
   
   }
}