
import java.util.* ;
public class ReplaceWord {
	
	//creating replaceWord to replace the word with new word in the sentence
	public static String replaceWord(String sentence, String oldWord, String newWord) {
        String [] words = sentence.split(" ") ; 
        String result = "" ;

        for (int i = 0 ; i < words.length ; i++) {
            if (words[i].equals(oldWord)) {
                result = result + newWord ;
            } 
			else {
                result = result + words[i] ;
            }
            if (i < words.length - 1) {
                result = result + " " ;  
            }
        }
        return result ;
    }

	public static void main (String args []) {
		Scanner input = new Scanner(System.in) ;
		
		//getting user input and displaying the string with old word replaced by old word
		System.out.print("Enter a sentence: ") ;
        String sentence = input.nextLine() ;

        System.out.print("Enter the word to replace: ") ;
        String oldWord = input.next() ;

        System.out.print("Enter the new word: ") ;
        String newWord = input.next() ;

        String newSentence = replaceWord(sentence, oldWord, newWord) ;

        System.out.println("Sentence after replacement: " + newSentence) ;

		input.close() ;
	}
}