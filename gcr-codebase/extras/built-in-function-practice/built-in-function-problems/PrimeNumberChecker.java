
import java.util.*;
public class PrimeNumberChecker {

    // creating a method isPrime to check for prime number
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; 
        }
        if (n == 2) {
            return true; 
        }
        if (n % 2 == 0) {
            return false; 
        }
		
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		//getting user input and checking for primes
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        input.close();
    }
}

