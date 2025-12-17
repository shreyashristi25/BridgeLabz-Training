import java.util.* ;
//create a Division class to calculate the quotient and remindor of two numbers
public class Division {
   public static void main (String args[]) {
   Scanner input = new Scanner(System.in) ;
   
   //create variables to store two numbers, quoteint and reminder
   double number1, number2;
   double quotient, reminder ;
   
   //Taking input from user
   System.out.println("Enter the first number") ;
   number1 = input.nextDouble() ;
   System.out.println("Enter the second number") ;
   number2 = input.nextDouble() ;
   
   quotient = number1 / number2 ;
   reminder = number1 % number2 ;
   
   //Displaying quotient and reminder
   System.out.println("The Quotient is " +quotient +" and Reminder is " +reminder +" of two number " +number1 + " and" +number2) ;
   
   }

}