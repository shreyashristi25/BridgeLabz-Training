
import java.util.* ;
public class BasicCalculator {

    //creating methods add, subtract,multiply and divide to perform different arithmetic operations
    public static int add(int a, int b) {
        return a + b ;
    }

    public static int subtract(int a, int b) {
        return a - b ;
    }

    public static int multiply(int a, int b) {
        return a * b ;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!") ;
            return Double.NaN ; // Not a Number
        }
        return (double) a / b ;
    }
	
	public static void main(String args []) {
        Scanner input = new Scanner(System.in) ;

		//getting user input for choice and displaying result based on user input
        System.out.println("---Basic Calculator---") ;
        System.out.println("Choose an operation:") ;
        System.out.println("1. Addition") ;
        System.out.println("2. Subtraction") ;
        System.out.println("3. Multiplication") ;
        System.out.println("4. Division") ;

        System.out.print("Enter your choice (1-4): ") ;
        int choice = input.nextInt() ;

        System.out.print("Enter first number: ") ;
        int num1 = input.nextInt() ;

        System.out.print("Enter second number: ") ;
        int num2 = input.nextInt() ;

        switch (choice) {
            case 1:
                System.out.println("Result: " + add(num1, num2)) ;
                break ;
            case 2:
                System.out.println("Result: " + subtract(num1, num2)) ;
                break ;
            case 3:
                System.out.println("Result: " + multiply(num1, num2)) ;
                break ;
            case 4:
                System.out.println("Result: " + divide(num1, num2)) ;
                break ;
            default:
                System.out.println("Invalid choice!") ;
        }

        input.close() ;
    }
}
