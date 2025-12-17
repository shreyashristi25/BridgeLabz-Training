import java.util.*;
//create YardMileConverter class to take user input in feet and change it to miles and yards
public class YardMileConverter {
   public static void main (String args[]) {
      Scanner input = new Scanner(System.in) ;
	  
	  //create variables to store distance in feet
      double distance ;
	  double yard ;
	  double miles ;
     
	 //Taking user input in feet
	 System.out.println("Enter the distance in feet") ;
      distance = input.nextInt() ;
	  
	  yard = distance / 3 ;
	  miles = yard / 1760 ;
      
	  //Displaying distance in yards and miles 
	  System.out.println(" The distance in yards is " +yard +" yards" +" and in miles is " +miles +" miles") ;
   
   }
}