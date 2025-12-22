
import java.util.* ;
public class SplitText {

    // creating methods findLength, manualSplit, comapreArrays to find klength of string, split the text manually and comparing the strings
    public static int findLength(String text) {
        int count = 0 ;
        try {
            while (true) {
                text.charAt(count) ; 
                count++ ;
            }
        }
		catch (StringIndexOutOfBoundsException e) {
            return count ;
        }
    }
	 
   public static String[] manualSplit(String text) {
        int len = findLength(text) ;

        int wordCount = 1 ; 
        for (int i = 0 ; i < len ; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++ ;
            }
        }
        String[] words = new String[wordCount] ;
        int wordIndex = 0 ;
        int start = 0 ;
        for (int i = 0 ; i < len ; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(start, i) ;
                start = i + 1 ;
            }
        }
        words[wordIndex] = text.substring(start, len) ;

        return words ;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false ;
        }
        for (int i = 0 ; i < arr1.length ; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false ;
            }
        }
        return true ;
    }
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

       //taking user input, calling functions, comapring strings and displaying result
        System.out.println("Enter a text:") ;
        String string = input.nextLine() ;

        String [] builtInSplit = string.split(" ") ;

        String [] manualSplit = manualSplit(string) ;

        boolean isSame = compareArrays(builtInSplit, manualSplit) ;

        System.out.println("Original Text: " + string) ;

        System.out.println("result (using built-in split() method):") ;
        for (String word : builtInSplit) {
            System.out.println(word) ;
        }
	    System.out.println("result (using manual split ):") ;
        for (String word : manualSplit) {
            System.out.println(word) ;
        }

        System.out.println("Are both results same? " + isSame) ;

        input.close() ;
    }
}

