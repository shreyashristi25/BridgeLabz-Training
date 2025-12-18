import java.util.* ;

//create class AreaOfTriange to calculate volume of earth
public class AreaOfTriangle {
   public static void main (String args []) {
   Scanner input = new Scanner(System.in) ;
   
   
   //create variable base and height 
   double base ;
   double height ;
   double areaInCentimeters ;
   double areaInInches ;
   
   //Taking user input for base and height
   System.out.println("Enter the base of the triangle") ;
   base = input.nextDouble() ;
   System.out.println("Enter the height of the triangle") ;
   height = input.nextDouble() ;
   
   // calculating area of triangle
<<<<<<< Updated upstream
   areaInInches = 0.5 * base * height * 2.54 * 2.54 ;
=======
   areaInInches = 0.5 * base * height * 2.54 *2.54 ;
>>>>>>> Stashed changes
   areaInCentimeters = 0.5 * base * height ;
   
   //Displaying the area of triangle in inches and centimeters
   System.out.println("Area of triangle in square inches is " +areaInInches+" and in square centimeters is " +areaInCentimeters) ;
   
   
   }
}
