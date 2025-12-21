
import java.util.*    ;
public class NumberChecker4 {

	//creating metodsisPrime, isNeon, isSpy, isAutomorphic, isBuzz
	//To check for prime, neon, spy, automorphic and buzz number

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

   public static boolean isAutomorphic(int number) {
    int square = number * number;
    int temp = number;
    while (temp > 0) {
        if ((temp % 10) != (square % 10)) {
            return false;
        }
        temp /= 10;
        square /= 10;
    }
    return true;
   }

    public static boolean isBuzz(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }

	public static void main(String args []) {
		Scanner input = new Scanner(System.in) ;
		
		//getting number as user input calling the methods, computing and displaying the result
		System.out.println("Enter a number : ") ;
		int number = input.nextInt() ;
		
        System.out.println("Number: " + number);
        System.out.println("Is Prime? " + isPrime(number));
        System.out.println("Is Neon? " + isNeon(number));
        System.out.println("Is Spy? " + isSpy(number));
        System.out.println("Is Automorphic? " + isAutomorphic(number));
        System.out.println("Is Buzz? " + isBuzz(number));

        input.close() ;
    }
}