
import java.util.* ;
public class FrequencyOfCharacters {
    
	//creating a function findFrequency to calculate the frequency of each acharacter and store it into a 1D array
	public static String [] findFrequency(String text) {
        char [] characters = text.toCharArray() ;   
        int[] freq = new int[characters.length] ;   
        for (int i = 0 ; i < characters.length ; i++) {
            if (characters[i] == '0') continue ;   
            freq[i] = 1 ;                   
 
            for (int j = i + 1 ; j < characters.length ; j++) {
                if (characters[i] == characters[j]) {
                    freq[i]++ ;               
                    characters[j] = '0' ;          
                }
            }
        }
        String [] result = new String[characters.length] ;
        int index = 0 ;
        for (int i = 0 ; i < characters.length ; i++) {
            if (characters[i] != '0') {
                result[index++] = characters[i] + " : " + freq[i] ;
            }
        }
        String [] result = new String[index] ;
        System.arraycopy(result, 0, result, 0, index) ;

        return result ;
    }
	public static void main(String args []) {
        Scanner input = new Scanner(System.in) ;

		//getting user string and displaying result
        System.out.print("Enter a string: ") ;
        String string = sc.nextLine() ;

        String [] frequencies = findFrequency(string) ;

        System.out.println("Frequencies of characters:") ;
        for (String s : frequencies) {
            System.out.println(s) ;
        }

        input.close() ;
    }
}
