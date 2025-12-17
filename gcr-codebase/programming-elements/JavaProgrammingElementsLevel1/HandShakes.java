import java.util.* ;
//create Handshakes class to calculate maximum possible handshakes
public class HandShakes { 
   public static void main (String args[]) {
   Scanner input = new Scanner(System.in) ;
   
   //create variable n to store number of students
   int numberOfStudnets;
   int handShake ;
   
   //Taking user input for number of students
   System.out.println("Enter number of students : ") ;
   numberOfStudnets = input.nextInt() ;
   
   handShake = (numberOfStudnets * ( numberOfStudnets - 1 ) ) / 2 ;
   
   //Displaying the maximum number of handshakes
   System.out.println("Possible handshakes are " +handShake) ;
   }
}