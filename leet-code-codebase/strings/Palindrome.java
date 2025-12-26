
import java.util.Scanner;
public class Palindrome {

	//creating isPalindrome to check for palindromic string
    public static boolean isPalindrome(String s) {
        
        String filtered = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                filtered += Character.toLowerCase(ch);
            }
        }

        int i = 0, j = filtered.length() - 1;
        while (i < j) {
            if (filtered.charAt(i) != filtered.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		//getting user input, calling function and displaying result
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
}

