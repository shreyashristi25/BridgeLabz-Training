
import java.util.*;
public class PalindromeChecker {

   //creating method isPalindrome and displayResult
	//to check for palindrome and display result
    
    public static boolean isPalindrome(String str) {
        
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
	public static void displayResult(String string, boolean result) {
        if (result) {
            System.out.println( string + " is a palindrome.");
        } else {
            System.out.println( string + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		//getting user input and displaying result
        System.out.println("Enter a string : ") ;
		String input = new String() ;
        boolean result = isPalindrome(input);
        displayResult(input, result);

        sc.close();
    }
}
