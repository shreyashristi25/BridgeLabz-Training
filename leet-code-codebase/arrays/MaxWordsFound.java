
import java.util.* ;
public class MaxWordsFound {

    //method to find max words in a sentence
    public static int maxWordsFound(String[] sentences) {
        int maxWords = 0;

        for (String sentence : sentences) {
            
            String [] words = sentence.split(" ");
            maxWords = Math.max(maxWords, words.length);
        }

        return maxWords;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

		//Taking user input and displaying result
        System.out.print("Enter number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String [] sentences = new String[n];

        System.out.println("Enter the sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }

        int result = maxWordsFound(sentences);
		
        System.out.println("Maximum number of words in a sentence: " + result);

        sc.close();

    }
}
