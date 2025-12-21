
import java.util.*     ;
public class NumberChecker5 {

	//creating methods sumOfDivisors,factorial, isPerfect, isAbundant, isDeficient, isStrong
	//To check for perfect, abundant, deficient, and strong number

    public static int sumOfDivisors(int n) {
        int sum = 1 ; 
        for (int i = 2 ; i <= n / 2 ; i++) {
            if (n % i == 0) {
                sum += i ;
            }
        }
        return sum ;
    }

    public static boolean isPerfect(int n) {
        return sumOfDivisors(n) == n ;
    }

    public static boolean isAbundant(int n) {
        return sumOfDivisors(n) > n ;
    }

    public static boolean isDeficient(int n) {
        return sumOfDivisors(n) < n ;
    }
	public static int factorial(int d) {
        int fact = 1;
        for (int i = 2; i <= d; i++) fact *= i;
        return fact;
    }

    public static boolean isStrong(int n) {
        int sum = 0, temp = n ;
        while (temp > 0) {
            int digit = temp % 10 ;
            sum += factorial(digit) ;
            temp /= 10 ;
        }
        return sum == n ;
    }

	public static void main(String args []) {
		Scanner input = new Scanner(System.in) ;
		
		//getting number as user input calling the methods, computing and displaying the result
		System.out.println("Enter a number : ")  ;
		int number = input.nextInt()  ;
		
        System.out.println("Perfect? " + isPerfect(number)) ;
        System.out.println("Abundant? " + isAbundant(number)) ;
        System.out.println("Deficient? " + isDeficient(number)) ;
        System.out.println("Strong? " + isStrong(number)) ;
        
        input.close() ;
    }
}