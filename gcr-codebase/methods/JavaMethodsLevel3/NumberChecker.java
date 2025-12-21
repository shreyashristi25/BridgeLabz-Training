
import java.util.*   ;
public class NumberChecker {

	//creating methods countDigits, getDigits, isDuckNumber, isArmstrong, findLargestTwo, findSmallestTwo
    //To count digits, store it into an array, check for duck number, check for Armstrong number, finding largets two numbers and finding smallest two numbers 
	public static int countDigits(int number) {
        int count = 0;
    int temp = number;
    while (temp > 0) {
        temp /= 10;   
        count++;
    }
    return count;
    }
    public static int [] getDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) { 
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean isArmstrong(int[] digits, int number) {
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return sum == number;
    }
    public static int[] findLargestTwo(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
		int [] arr = new int[2];
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
		arr[0] = largest;
		arr[1] = secondLargest;
        return arr;
    }
    public static int[] findSmallestTwo(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
		int [] arr = new int [2];
        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
		arr[0] = smallest;
		arr[1] = secondSmallest;
        return arr;
    }

	public static void main(String args []) {
		Scanner input = new Scanner(System.in)  ;
		
		System.out.println("Enter a number : ");
		int number = input.nextInt();
        
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        int [] digits = getDigits(number);
		int [] array1 = NumberChecker.findLargestTwo(digits);
		int [] array2 = NumberChecker.findSmallestTwo(digits);
        System.out.print("Digits array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Is Duck Number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number? " + isArmstrong(digits, number));

        int[] largestTwo = findLargestTwo(digits);
        System.out.println("Largest number is : " + array1[0] + ", Second Largest number is : " + array1[1]);

        int[] smallestTwo = findSmallestTwo(digits);
        System.out.println("Smallest number is : " + array2[0] + ", Second Smallest number is : " + array2[1]);


        input.close() ;
    }
}