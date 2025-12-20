
import java.util.*;
public class Factors {

    // creating methods findFactors, sumOfFactors, productOFFactors and sumOfSquares
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int [] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
		return factors;
    }
    public static int sumOfFactors(int [] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }
    public static long productOfFactors(int [] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }
    public static int sumOfSquares(int [] factors) {
        int sumOfSquares = 0;
        for (int f : factors) {
            sumOfSquares += Math.pow(f, 2);
        }
        return sumOfSquares;
    }
	public static void main(String args []) {
        Scanner input = new Scanner(System.in);

       //creating variable number to get user input and display the sum, sum of square of factors and product of the factors 
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] factors = findFactors(number);

        System.out.print("Factors of " + number + " are: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        System.out.println("Sum of factors : " + sumOfFactors(factors));
        System.out.println("Product of factors : " + productOfFactors(factors));
        System.out.println("Sum of squares of factors : " + sumOfSquares(factors));

        input.close();
    }
}





