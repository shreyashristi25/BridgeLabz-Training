import java.util.* ;
//create ItemPrice class to calculate the total purchase price of item
public class ItemPrice {
   public static void main (String args[]) {
   Scanner input = new Scanner(System.in) ;
   
   //create variables to store ubit price and quantity of item
   double unitPrice ;
   int quantity ;
   
   //Taking user input for unit price and quantity
   System.out.println("Enter the unit price of item :") ;
   unitPrice = input.nextDouble() ;
   System.out.println("Enter the quantity of item :") ;
   quantity = input.nextInt() ;
   
   //Displaying the total purchase price, quntity and unit price of the item
   System.out.println("The total purchase price is INR " +(unitPrice*quantity)+" if the quantity "+quantity +" and the unit price is "+unitPrice) ;
   }
}