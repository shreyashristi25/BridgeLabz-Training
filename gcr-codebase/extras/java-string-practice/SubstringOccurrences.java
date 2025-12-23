
import java.util.* ;
public class SubstringOccurrences {
    public static int countOccurrences(String string, String substring) {
        if (string == null || substring == null || substring.length() == 0) {
            return 0 ; 
        }
        int count = 0 ;
        int n = string.length() ;
        int m = substring.length() ;

        for (int i = 0 ; i <= n - m ; i++) {
            boolean match = true ;

            for (int j = 0 ; j < m ; j++) {
                if (string.charAt(i + j) != substring.charAt(j)) {
                    match = false ;
                    break ;
                }
            }
            if (match) {
                count++ ;
            }
        }

        return count ;
    }
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter the string: ") ;
        String string = input.nextLine() ;

        System.out.print("Enter the substring : ") ;
        String substring = input.nextLine() ;

        int result = countOccurrences(string, substring) ;
        System.out.println("Occurrences of " + substring + "are : " + result) ;

        input.close() ;
    }
}
