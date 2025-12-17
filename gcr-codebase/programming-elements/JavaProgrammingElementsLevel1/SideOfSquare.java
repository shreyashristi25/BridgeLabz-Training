import java.util.* ;
//create class SideOfSquare to compute side from perimeter of a sqaure
public class SideOfSquare {
   public static void main (String args[]) {
   Scanner input = new Scanner(System.in) ;
   
   //create variable to store perimeter and side of the square
   double perimeter ;
   double side;
   
   //Taking user input for perimeter
   System.out.println("Enter the perimeter of the square : ") ;
   perimeter = input.nextDouble() ;
   
   side = perimeter / 4 ;
   
   //Displaying side of the square
   System.out.println("Side of the square is " +side) ;
   
   
   }   

}