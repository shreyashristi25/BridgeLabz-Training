
import java.util.* ;
public class Palindrome {
	
	//creating isPalindrome to check for palindromic string
	public static boolean isPalindrome(String s) {
		char [] chars = s.toCharArray() ;
		for(int i = 0; i < s.length(); i++) {
			for(int j = s.length() - 1; j > 0; j--){
				if(chars[i] != chars[j]) {
					return false ;
				}
			}
		}
		return true ;
    }

	public static void main (String args []) {
		Scanner input = new Scanner(System.in) ;
		
		//getting user input, checking for palindromic string and displaying result
		System.out.println("Enter a string") ;
		String string = input.next() ;
		
		if(isPalindrome(string)) {
			System.out.println("The string is a Palindrome!") ;
		}
		else {
			System.out.println("The string is not a Palindrome!") ;
		}
		
		input.close() ;
	}
}