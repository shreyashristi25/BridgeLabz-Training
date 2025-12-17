import java.util.* ;
//create IntOperation class to perform integer operations
public class IntOperation {
   public static void main (String args[]) {
   Scanner input = new Scanner(System.in) ;
   
   //create variables
   int a, b, c ;
   int operation1, operation2, operation3, operation4 ;
   
   //Taking input from user
   System.out.println("Enter first number in integer") ;
   a = input.nextInt() ;
   System.out.println("Enter second number in integer") ;
   b = input.nextInt() ;
   System.out.println("Enter third number in integer") ;
   c = input.nextInt() ;
   
   operation1 = a + b *c ;
   operation2 =  a * b + c ;
   operation3 = c + a / b ;
   
   //Displaying the result of three operations a + b *c, a * b + c, c + a / b
   System.out.println("The results of Int Operations are " +operation1 +" ," +operation2 +" , and " +operation3) ;
   
   }

}