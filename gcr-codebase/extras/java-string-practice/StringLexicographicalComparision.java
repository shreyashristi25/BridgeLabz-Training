
import java.util.*  ;
public class StringLexicographicalComparision {

    //creating method compareStrings to compare the strings lexicographicaly and return 0 of equals, -1 if smaller and 1 if greater
    public static int compareStrings(String s1, String s2) {
        int i = 0 ;
        while (i < s1.length() && i < s2.length()) {
            char char1 = s1.charAt(i) ;
            char char2 = s2.charAt(i) ;

            if (char1 != char2) {
                return char1 - char2 ; 
            }
            i++ ;
        }
        if (s1.length() == s2.length()) {
            return 0 ; 
        } else if (s1.length() < s2.length()) {
            return -1 ; 
        } else {
            return 1 ; 
        }
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

		//getting user input and displaying the result
        System.out.print("Enter first string: ") ;
        String s1 = sc.nextLine() ;

        System.out.print("Enter second string: ") ;
        String s2 = sc.nextLine() ;

        int result = compareStrings(s1, s2) ;

        if (result == 0) {
            System.out.println(s1 + " is equal to " + s2 ) ;
        } else if (result < 0) {
            System.out.println( s1 + " comes before " + s2 + " in lexicographical order") ;
        } else {
            System.out.println( s1 + " comes after " + s2 + " in lexicographical order") ;
        }



        sc.close() ;
    }
}
