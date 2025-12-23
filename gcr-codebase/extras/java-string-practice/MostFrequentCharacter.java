
import java.util.*  ;
public class MostFrequentCharacter {
	
	//creating findMostFrequentChar to count and get the most frequent character in a string
	public static char findMostFrequentChar(String s) {
        int [] freq = new int[256] ; 

        for (int i = 0 ; i < s.length() ; i++) {
            freq[s.charAt(i)]++ ;
        }
        int maxFreq = 0 ;
        char result = ' ' ;
        for (int i = 0 ; i < s.length() ; i++) {
            if (freq[s.charAt(i)] > maxFreq) {
                maxFreq = freq[s.charAt(i)] ;
                result = s.charAt(i) ;
            }
        }
        return result ;
    }

	public static void main (String args []) {
		Scanner input = new Scanner(System.in)  ;
		
		//getting user input and displaying the most frequent character of the string
		System.out.println("Enter a string")  ;
		String string = input.next()  ;
		
		char mostFrequent = findMostFrequentChar(string) ;
        System.out.println("The most frequent character in the given string is: " + mostFrequent ) ;

		input.close()  ;
	}
}