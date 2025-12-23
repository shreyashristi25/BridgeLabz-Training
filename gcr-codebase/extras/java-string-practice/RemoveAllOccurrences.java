
import java.util.*   ;
public class RemoveAllOccurrences {
	
	//creating removeCharacter to remove all occurrences of a particular character from a string
	public static String removeCharacter(String s, char ch) {
        String string = "" ; 

        for (int i = 0 ; i < s.length() ; i++) {
            if (s.charAt(i) != ch) {
                string = string + s.charAt(i) ;  
            }
        }
        return string ;
    }

	public static void main (String args []) {
		Scanner input = new Scanner(System.in)  ;
		
		//getting user input and displaying the string with removed character
		System.out.println("Enter a string") ;
		String string = input.next() ;
		
		System.out.println("Enter the character to remove: ") ;
        char ch = input.next().charAt(0) ;
		String newString = removeCharacter(string, ch) ;

        System.out.println("String after removing " + ch + " is : " + newString) ;

		input.close() ;
	}
}