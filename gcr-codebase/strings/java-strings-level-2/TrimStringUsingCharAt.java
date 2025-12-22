
import java.util.* ;
public class TrimStringUsingCharAt {

    // creating methods findTrimPoints, getSubstring, compareStrings
	// to find the trime points to trim trailing and leading spaces, getting substring and comparing the strings
    public static int[] findTrimPoints(String text) {
        int start = 0 ;
        int end = text.length() - 1 ;

        while (start < text.length() && text.charAt(start) == ' ') {
            start++ ;
        }
        while (end >= 0 && text.charAt(end) == ' ') {
            end-- ;
        }
        return new int[]{start, end} ;
    }

    public static String getSubstring(String text, int start, int end) {
        String result = "" ;
        for (int i = start ; i <= end ; i++) {
            result += text.charAt(i) ;
        }
        return result ;
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
        Scanner sc = new Scanner(System.in) ;

		//taking user input, calling functions and displaying result
        System.out.println("Enter a string with leading/trailing spaces:") ;
        String input = sc.nextLine() ;

        int[] points = findTrimPoints(input) ;
		
        String trimmed = getSubstring(input, points[0], points[1]) ;
		
        String trimmedBuiltIn = input.trim() ;
		
        boolean isSame = compareStrings(trimmed, trimmedBuiltIn) ;

        System.out.println("Original String: [" + input + "]") ;
        System.out.println("Trimmed String: [" + trimmed + "]") ;
        System.out.println("Built-in Trimmed String: [" + trimmedBuiltIn + "]") ;
        System.out.println("Are both results same? " + isSame) ;

        sc.close() ;
    }
}
