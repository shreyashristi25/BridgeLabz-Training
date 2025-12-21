
import java.util.*    ;
public class NumberChecker3 {

	//creating methods countDigits, getDigits, reverseArray, arraysEqual, isPalindrome, isDuckNumber
	// To count digits, store it into an array, reverse the array, check for equality of arrays, check for palindrome and check for duck number
	public static int countDigits(int number) {
		int count = 0 ;
		int temp = number ;
		while (temp > 0) {
			temp /= 10 ;   
			count++ ;
		}
		return count ;
    }
	
    public static int[] getDigits(int number) {
        String numStr = String.valueOf(number) ;
        int[] digits = new int[numStr.length()] ;
        for (int i = 0 ; i < numStr.length() ; i++) {
            digits[i] = numStr.charAt(i) - '0' ; 
        }
        return digits ;
    }

    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length] ;
        for (int i = 0 ; i < digits.length ; i++) {
            reversed[i] = digits[digits.length - i - 1] ;
        }
        return reversed ;
    }

    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false ;
        for (int i = 0 ; i < arr1.length ; i++) {
            if (arr1[i] != arr2[i]) return false ;
        }
        return true ;
    }
	
	public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits) ;
        return arraysEqual(digits, reversed) ;
    }
	
	public static boolean isDuckNumber(int[] digits) {
        for (int i = 1 ; i < digits.length ; i++) {
            if (digits[i] == 0) {
                return true ;
            }
        }
        return false ;
    }

	public static void main(String args []) {
		Scanner input = new Scanner(System.in) ;
		
		//getting number as user input calling the methods, computing and displaying the result
		System.out.println("Enter a number : ") ;
		int number = input.nextInt() ;
        
        int count = countDigits(number) ;
        System.out.println("Count of digits: " + count) ;

        int[] digits = getDigits(number) ;
        System.out.print("Digits array: ") ;
        for (int d : digits) {
            System.out.print(d + " ") ;
        }
        System.out.println() ;

        int[] reversed = reverseArray(digits) ;
        System.out.print("Reversed array: ") ;
        for (int d : reversed) {
            System.out.print(d + " ") ;
        }
        System.out.println() ;

        System.out.println("Are the original and reversed arrays equal? " + arraysEqual(digits, reversed)) ;
        System.out.println("Is Palindrome? " + isPalindrome(digits)) ;
        System.out.println("Is Duck Number? " + isDuckNumber(digits)) ;

        input.close() ;
    }
}