
import java.util.* ;
public class VowelConsonant {

    //creating methods checkVowelConsonant, countVowelsConsonants
    public static String checkVowelConsonant(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32) ; 
        }
        if (ch >= 'a' && ch <= 'z') {
           
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel" ;
            } 
			else {
                return "Consonant" ;
            }
        } 
		else {
            return "Not a Letter" ;
        }
    }
	public static int [] countVowelsConsonants(String text) {
        int vowels = 0 ;
        int consonants = 0 ;

        for (int i = 0 ; i < text.length() ; i++) {
            char ch = text.charAt(i) ;
            String type = checkVowelConsonant(ch) ;

            if (type.equals("Vowel")) {
                vowels++ ;
            } else if (type.equals("Consonant")) {
                consonants++ ;
            }
        }

        return new int[]{vowels, consonants} ;
    }
	public static void main(String [] args) {
        Scanner sc = new Scanner(System.in) ;

		//getting user input, checking for vowels and consonants by calling functions and diaplaying result 
        System.out.println("Enter a string:") ;
        String input = sc.nextLine() ;

        int [] result = countVowelsConsonants(input) ;
 
        System.out.println("Count of Vowels: " + result[0]) ;
        System.out.println("Count of Consonants: " + result[1]) ;

        sc.close() ;
    }
}

