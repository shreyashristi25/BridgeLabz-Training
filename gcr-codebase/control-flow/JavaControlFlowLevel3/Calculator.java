
import java.util.* ;
public class Calculator {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in) ;
		
		//creating variables number1, number2 and op
	    System.out.println("Enter first number : ") ;
		double number1 = input.nextDouble() ;
		System.out.println("Enter second number : ") ;
		double number2 = input.nextDouble() ;
		System.out.println("Enter an operator : (+, -, *, /) :") ;
		String op = input.next() ;
		
		//impelemnting calculator using switch cases
		switch (op) {
            case "+":
                System.out.println("Addition: " + (number1 + number2));
                break;
            case "-":
                System.out.println("Subtraction: " + (number1 - number2));
                break;
            case "*":
                System.out.println("Multiplication: " + (number1 * number2));
                break;
            case "/":
                if (number2 != 0) {
                    System.out.println("Division: " + (number1 / number2));
                } else {
                    System.out.println("Cannot divide by 0 ");
                }
                break;
            default:
                System.out.println("Invalid Operator! Please use +, -, *, or /.");
        }

		
		input.close() ;
		}
}