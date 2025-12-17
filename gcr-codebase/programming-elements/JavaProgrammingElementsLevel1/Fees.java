//create a class Fees to calculate the discounted fees
public class Fees {
   public static void main (String args[]) {
   
   //create variables to store fee, discount percent and discount  
   int fee = 125000 ;
   int discountPercent = 10 ;
   int discount = fee * (discountPercent/100) ;
   
   //Displaying the discount amount and discounted fees
   System.out.println("The discount amount is INR " +discount +" and final discounted fee is INR " +(fee - discount)) ;
   }
}