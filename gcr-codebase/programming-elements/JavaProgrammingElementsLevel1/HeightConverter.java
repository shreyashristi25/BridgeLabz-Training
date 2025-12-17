import java.util.* ;
//create a HiegitConverter class to convert height in inches and feet
public class HeightConverter {
   public static void main(String args[]) {
   Scanner input = new Scanner(System.in) ;
   
   //create variable to store height in centimeters, foot and inches
   double height ;
   double foot ;
   double inches ;
   
   //Taking user height as input
   System.out.println("Enter your height in centimeters") ;
   height = input.nextDouble() ;
   
   //computing height
<<<<<<< Updated upstream
   inches =  height / 2.54 ; 
=======
   inches = height / 2.54 ; 
>>>>>>> Stashed changes
   foot = inches / 12 ;
   
   //Displaying height in feet annd inches
   System.out.println(" Your Height in cm is " +height +" while in feet is " +foot +" and in inches is " +inches) ; 
   
   }
}
