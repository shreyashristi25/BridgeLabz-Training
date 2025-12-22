
import java.util.Scanner ;
public class Words2DArray {

   //creating methods splitWords, createWordLengthArray to split text into words and store them into a 2d array with their lengths
    public static String [] splitWords(String text) {
        String[] words = new String[text.length()] ;
        int wordCount = 0 ;
        String currentWord = "" ;

        for (int i = 0 ; i < text.length() ; i++) {
            char ch = text.charAt(i) ;

            if (ch != ' ') {
                currentWord += ch ;  
            } else {
                if (!currentWord.equals("")) {
                    words[wordCount++] = currentWord ;
                    currentWord = "" ;
                }
            }
        }
        if (!currentWord.equals("")) {
            words[wordCount++] = currentWord ;
        }
        String[] result = new String[wordCount] ;
        for (int i = 0 ; i < wordCount ; i++) {
            result[i] = words[i] ;
        }
        return result ;
    }
	public static int findLength(String str) {
		int count = 0 ;
		try {
			while (true) {
				str.charAt(count) ;
				count++ ;
			}
		}
		catch (Exception e) {
        
		}
		return count ;
	}

	public static String [][] createWordLengthArray(String [] words) {
        String[][] wordLengthArray = new String[words.length][2] ;

        for (int i = 0 ; i < words.length ; i++) {
            wordLengthArray[i][0] = words[i] ;
            wordLengthArray[i][1] = String.valueOf(findLength(words[i])) ;
        }
        return wordLengthArray ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
		
		//getting user input, calling functions and displaying result
        System.out.println("Enter a line of text:") ;
        String input = sc.nextLine() ;

        String [] words = splitWords(input) ;
        String [][] wordLengthArray = createWordLengthArray(words) ;

        System.out.println("Word\tLength") ;
        System.out.println("-----------------") ;
        for (int i = 0 ; i < wordLengthArray.length ; i++) {
            String word = wordLengthArray[i][0] ;
            int length = Integer.parseInt(wordLengthArray[i][1]) ; 
            System.out.println(word + "\t" + length) ;
        }
		sc.close()  ;
    }
}
