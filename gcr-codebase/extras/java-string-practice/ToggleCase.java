
import java.util.* ;
public class ToggleCase {
	
	//creating toToggleCase to convert string to toggle case
	public static String toToggleCase(String s) {
		String toggle = "" ;
		char [] chars = s.toCharArray() ;
		 for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch >= 'a' && ch <= 'z') {
                chars[i] = Character.toUpperCase(ch);
            } else if (ch >= 'A' && ch <= 'Z') {
                chars[i] = Character.toLowerCase(ch);
            }
        }
		return new String(chars) ;
    }

	public static void main (String args []) {
		Scanner input = new Scanner(System.in) ;
		
		//getting user input and displaying the string as toggle string
		System.out.println("Enter a string") ;
		String string = input.next() ;
		
		String s1 = toToggleCase(string) ;
		System.out.println("The string in toggle case is  : " +s1) ;
		
		input.close() ;
	}
}