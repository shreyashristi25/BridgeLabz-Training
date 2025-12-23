
import java.util.* ;
public class GCDAndLCMCalculator {

    // creating methods gcd, lcm, displayResult
	// to find gcd and lcm, and display result
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b ;
            b = a % b ;
            a = temp ;
        }
        return a ;
    }
	
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b) ;
    }
	public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("For numbers " + a + " and " + b + ":") ;
        System.out.println("GCD : " + gcd) ;
        System.out.println("LCM : " + lcm) ;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

		//getting user input and displaying result
        System.out.print("Enter first number: ") ;
        int num1 = input.nextInt() ;

        System.out.print("Enter second number: ") ;
        int num2 = input.nextInt() ;

        int gcdValue = gcd(num1, num2) ;
        int lcmValue = lcm(num1, num2) ;

        displayResult(num1, num2, gcdValue, lcmValue);

        input.close() ;
    }
}


