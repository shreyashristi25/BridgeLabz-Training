import java.util.* ;
//create class ArithmeticOperationsto perform arithmetic operations on two numbers
public class ArithmeticOperations {
   public static void main (String args []) {
   Scanner input = new Scanner(System.in) ;
   
   //create variables to store two numbers and the operation's output
   double number1 ;
   double number2 ;
   double addition ;
   double subtraction ;
   double multiplication ;
   double division ;
   
   //Taking user input for two numbers
   System.out.println("Enter the first number") ;
   number1 = input.nextDouble() ;
   System.out.println("Enter the second number") ;
   number2 = input.nextDouble() ;
   
   //Computing arithmetic operarions
   addition = number1 + number2 ;
   subtraction = number1 - number2 ;
   multiplication = number1 * number2 ;
   division = number1 / number2 ;
   
   //Displaying the result of arithmetic operations
   System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " +number1 +" and " +number2 +" is " +addition +", "+subtraction+ ", " +multiplication +", and "+division) ;
  }
}