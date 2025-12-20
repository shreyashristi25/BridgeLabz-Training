
import java.util.*   ;
public class NumberChecker {

	//creating methods isPositive, isEven, compare for checking for positive and even number , and comparing numbers 
    public static boolean isPositive(int num) {
        return num >= 0;
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }


	public static void main(String args  []) {
		Scanner input = new Scanner(System.in)  ;
		
		//creating array of numbers, getting user input and displaying result
		int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println("Number " + numbers[i] + " is Positive and Even.");
                } else {
                    System.out.println("Number " + numbers[i] + " is Positive and Odd.");
                }
            } else {
                System.out.println("Number " + numbers[i] + " is Negative.");
            }
        }

        // Comparing first and last element of array and displaying result
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        if (first == last) {
            System.out.println("First and last elements are Equal.");
        } else if (first > last) {
            System.out.println("First element is Greater than last element.");
        } else {
            System.out.println("First element is Less than last element.");
        }


        input.close() ;
    }
}