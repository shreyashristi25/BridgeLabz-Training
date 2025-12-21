
import java.util.*   ;
public class NumberChecker2 {

	//creating methods countDigits, getDigits, sumOfDigits, sumOfSquares, isHarshad, digitFrequency
	// To count digits, store it into an array, compute sum, compute sum of squares of digits, check for harshad number and count frequency of digits
	public static int countDigits(int number) {
		int count = 0;
		int temp = number;
		while (temp > 0) {
			temp /= 10;   
			count++;
		}
		return count;
    }
	
    public static int[] getDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0'; 
        }
        return digits;
    }

    public static int sumOfDigits(int [] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    public static int sumOfSquares(int [] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }
	
    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

	public static void main(String args []) {
		Scanner input = new Scanner(System.in)  ;
		
		System.out.println("Enter a number : ");
		int number = input.nextInt();
        
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        int[] digits = getDigits(number);
        System.out.print("Digits array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits is : " + sum);

        int sumSquares = sumOfSquares(digits);
        System.out.println("Sum of squares of digits is : " + sumSquares);
        System.out.println("Is Harshad Number? " + isHarshad(number, digits));
        int[][] freq = digitFrequency(digits);
        System.out.println("Digit frequencies are :");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " occurs " + freq[i][1] + " time(s)");
            }
        }

        input.close() ;
    }
}