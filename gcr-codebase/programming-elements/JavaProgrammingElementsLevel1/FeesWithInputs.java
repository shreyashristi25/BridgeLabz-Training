import java.util.* ;
//create a class Fees to calculate the discounted fees
public class FeesWithInputs {
   public static void main (String args[]) {
   Scanner input = new Scanner(System.in) ;
   //create variables to store fee, discount percent and discount  
   int fee ;
   int discountPercent ;
   
   //taking user input for fee and discount
   System.out.println("Enter the fee") ;
   fee = input.nextInt() ;
   System.out.println("Enter the discountPercent") ;
   discountPercent = input.nextInt() ;
   int discount = fee * (discountPercent/100) ;
   
   //Displaying the discount amount and discounted fees
   System.out.println("The discount amount is INR " +discount +" and final discounted fee is INR " +(fee - discount)) ;
   }
}