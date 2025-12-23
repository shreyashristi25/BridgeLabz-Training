
import java.util.Scanner ;
public class UniqueCharacterFrequency {

    // creating methods uniqueCharacters and findFrequency to check for unique character s and find the frequency
    public static char [] uniqueCharacters(String text) {
        int len = text.length() ;
        char[] unique = new char[len] ;
        int index = 0 ;

        for (int i = 0 ; i < len ; i++) {
            char ch = text.charAt(i) ;
            boolean isDuplicate = false ;

            for (int j = 0 ; j < index ; j++) {
                if (unique[j] == ch) {
                    isDuplicate = true ;
                    break ;
                }
            }
            if (!isDuplicate) {
                unique[index++] = ch ;
            }
        }
        char [] result = new char[index] ;
        System.arraycopy(unique, 0, result, 0, index) ;
        return result ;
    }
	public static String [][] findFrequency(String text) {
        int [] freq = new int[256] ; 
        for (int i = 0 ; i < text.length() ; i++) {
            freq[text.charAt(i)]++ ;
        }
        char [] unique = uniqueCharacters(text) ;

        String [][] result = new String[unique.length][2] ;
        for (int i = 0 ; i < unique.length ; i++) {
            result[i][0] = String.valueOf(unique[i]) ;
            result[i][1] = String.valueOf(freq[unique[i]]) ;
        }
        return result ;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

       //getting user input and displaying result
        System.out.print("Enter a string: ") ;
        String text = sc.nextLine() ;

        String[][] frequencies = findFrequency(text) ;

        System.out.println("Character frequencies:") ;
        for (int i = 0 ; i < frequencies.length ; i++) {
            System.out.println(frequencies[i][0] + " : " + frequencies[i][1]) ;
        }
    }
}
