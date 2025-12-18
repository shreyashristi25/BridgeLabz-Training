
import java.util.* ;
public class DivisibleByFive {
   public static void main (String args[]) {
      Scanner input = new Scanner(System.in) ;
   
      //creating variable to store number and taking the value from user
      int number ;
      System.out.println("Enter your number") ;
      number = input.nextInt() ;
   
      //checking for divisibility and displaying the result
      if(number % 5 == 0) {
         System.out.println("Number " +number +" is divisible by 5") ;
      }
      else {
         System.out.println("Number " +number +" is not divisible by 5") ;
      }
   
      input.close() ;
   }
}