
import java.util.*;
public class FactorialUsingRecursion {
	
	//creating factorial and displayResult
	// To get find factorial and display result
    
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        } else {
            return n * factorial(n - 1); 
		}
    }

    public static void displayResult(int num, long result) {
        System.out.println("Factorial of " + num + " is : " + result);
    }
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		//getting user input and displaying result
        System.out.println("Enter a number") ;
		int num = input.nextInt() ;
        long result = factorial(num);
        displayResult(num, result);

        input.close();
    }
}

	