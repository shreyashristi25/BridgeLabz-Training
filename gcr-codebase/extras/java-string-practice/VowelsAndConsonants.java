
import java.util.* ;
public class VowelsAndConsonants {
	
	//creating checkVowelConsonant to check for vowels and consonants
	public static String checkVowelConsonant(char ch) {
        ch = Character.toLowerCase(ch); 
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel" ;
            } else {
                return "Consonant" ;
            }
        }
        return "" ; 
    }

	public static void main (String args []) {
		Scanner input = new Scanner(System.in) ;
		
		//getting user input, checking for vowels and consonants and displaying result
		System.out.println("Enter a string") ;
		String string = input.next() ;
		
		int vowel = 0 ;
		int consonant = 0 ;
		for (char ch : string.toCharArray()) {
            String result = checkVowelConsonant(ch) ;
            if (result.equals("Vowel")) {
                vowel++ ;
            } else if (result.equals("Consonant")) {
                consonant++ ;
            }
        }
		System.out.println("The number of vowels in the given string is " +vowel) ;
		System.out.println("The number of consonant in given string is " +consonant) ;
		
		input.close() ;
	}
}