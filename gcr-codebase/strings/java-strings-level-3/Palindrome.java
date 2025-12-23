
import java.util.*;
public class Palindrome {

	//Logic 1 : Using Iterative method
    public static boolean isPalindromeIterative(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Using Recursive comparison
    public static boolean isPalindromeRecursive(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(s, start + 1, end - 1);
    }
	
	//Logic 3 : Using Array
	public static boolean isPalindromeArray(String s) {
		char [] original = s.toCharArray();
		char [] reversed = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			reversed[i] = s.charAt(s.length() - i - 1);
		}
		for (int i = 0; i < original.length; i++) {
			if (original[i] != reversed[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter s to check palindrome: ");
        String s = sc.nextLine();
        
        System.out.println("Logic 1 (Using Iterative): " + (isPalindromeIterative(s) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Logic 2 (Using Recursive): " + (isPalindromeRecursive(s, 0, s.length() - 1) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Logic 3 (Using Array Comparison): " + (isPalindromeArray(s) ? "Palindrome" : "Not Palindrome"));

        sc.close();
    }
}
