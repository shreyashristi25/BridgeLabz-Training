
import java.util.* ;
public class Equality {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in) ;
	
		//creating varibales string1 and string2 and getting user input
		System.out.println("Enter first String : ") ;
		String string1 = input.next() ;
		System.out.println("Enter second String : ") ;
		String string2 = input.next() ;
		boolean equal = true ;
	
		if(string1.length() != string2.length()) {
			System.out.println("The strings are not same .") ;
		}
		//comparing using charAt() method
		for (int i = 0 ; i < string1.length(); i++) {
			if(string1.charAt(i) != string2.charAt(i)) {
				equal = false ;
				break ;
			}
		}
		if(equal) {
			System.out.println("The strings are equal.(using charAt())") ;
		}
		else {
			System.out.println("The strings are not equal.(using charAt())") ;
		}
		if(string1.equals(string2)) {
			System.out.println("The strings are equal.(using equals())") ;
		}
		else {
			System.out.println("The strings are not equal.(using equals())") ;
		}
	
		input.close() ;
	}
	
}