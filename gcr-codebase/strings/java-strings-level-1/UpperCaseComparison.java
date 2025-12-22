
import java.util.* ;
public class UpperCaseComparison {

    //creating methods manualToUpperCase, compareStrings to convert cahracters of string to upper case and comare the strings
    public static String manualToUpperCase(String text) {
        String result = new String() ;

        for (int i = 0 ; i < text.length() ; i++) {
            char ch = text.charAt(i) ;

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32) ;
            }
            result.append(ch) ;
        }
        return result.toString() ;
    }
	public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false ; 
        }
        for (int i = 0 ; i < s1.length() ; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false ;
            }
        }
        return true ; 
    }

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        // taking user input, converting into uppercase, comparing strings and dispalying result
        System.out.println("Enter a text:") ;
        String userInput = input.nextLine() ;

        String s1 = userInput.toUpperCase() ;

        String s2 = manualToUpperCase(userInput) ;

        boolean isEqual = compareStrings(s1, s2) ;
		
        System.out.println("Original Text: " + userInput) ;
        System.out.println("Built-in toUpperCase(): " + s1) ;
        System.out.println("Manual Conversion: " + s2) ;
        System.out.println("Are both results same? " + isEqual) ;

        input.close() ;
    }
}
