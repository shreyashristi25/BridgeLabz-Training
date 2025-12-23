
import java.util.* ;
public class Reverse {
	
	//creating reverseString to reverse a string
	public static String reverseString(String s) {
		char [] chars = s.toCharArray() ;
		char [] reversed = new char[s.length()] ;
		
		for(int j = s.length() - 1; j > 0; j--){
				reversed [s.length()- 1 -j] = chars[j] ;
			}
		return new String(reversed) ;
    }

	public static void main (String args []) {
		Scanner input = new Scanner(System.in) ;
		
		//getting user input, checking for palindromic string and displaying result
		System.out.println("Enter a string") ;
		String string = input.next() ;
		
		System.out.println("The reversed string is : " +reverseString(string)) ;
		
		input.close() ;
	}
}