
import java.util.* ;
public class EqualityOfSubstring {
		public static String substringUsingCharAt(String string, int start, int end) {
			String s = "" ;
			for(int i = start; i < end; i++) {
				s += string.charAt(i) ;
			}
			return s ;
		}
		
		public static boolean isEqual(String s1, String s2) {
			boolean equal = true ;
			for (int i = 0 ; i < s1.length(); i++) {
				if(s1.charAt(i) != s2.charAt(i)) {
					equal = false ;
					break ;
				}
			}
		return equal ;
		}
		
		public static void main(String args[]) {
			Scanner input = new Scanner(System.in) ;
		
			System.out.println("Enter a string") ;
			String string1 = input.next() ;
			System.out.println("Enter the start of the substring") ;
			int start = input.nextInt(); 
			System.out.println("Enter the end of the substring") ;
			int end = input.nextInt() ;
			String s1 = string1.substring(start, end) ;
			System.out.println("The substring (using subtring() method) :" +s1) ;
			String s2 = substringUsingCharAt(string1, start, end) ;
			System.out.println("The substring (using charAt() method) :" +s2) ;
			if(isEqual(s1, s2)) {
				System.out.println("The strings are equal.") ;
			}
			else {
				System.out.println("The strings are not equal.") ;
			}
	
			input.close() ;
		}
	
}