
import java.util.Scanner;
public class ShortestAndLongestWord {

    //creating functions splitWords, findLength, createWordLengthArray, findShortestLongest
	//To split text into words, handle exceptions, create word 2d array and finding the shortest and longest words in the sentence 
    
	public static String [] splitWords(String text) {
        String [] words = new String[text.length()]; 
        int wordCount = 0;
        String currentWord = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                currentWord += ch;
            } else {
                if (!currentWord.equals("")) {
                    words[wordCount++] = currentWord;
                    currentWord = "";
                }
            }
        } 
        if (!currentWord.equals("")) {
            words[wordCount++] = currentWord;
        }
        String [] result = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            result[i] = words[i];
        }
        return result;
    }
	public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); 
                count++;
            }
        }
		catch (Exception e) {
           
        }
        return count;
    }
	 public static String [][] createWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(findLength(words[i]));
        }
        return wordLengthArray;
    }
	public static String[] findShortestLongest(String [][] wordLengthArray) {
		String shortestWord = wordLengthArray[0][0];
		String longestWord = wordLengthArray[0][0];
		int shortest = Integer.parseInt(wordLengthArray[0][1]);
		int longest = Integer.parseInt(wordLengthArray[0][1]);

		for (int i = 1; i < wordLengthArray.length; i++) {
			int length = Integer.parseInt(wordLengthArray[i][1]);
			String word = wordLengthArray[i][0];

			if (length < shortest) {
				shortest = length;
				shortestWord = word;
			}
			if (length > longest) {
				longest = length;
				longestWord = word;
			}
		}

		return new String []{shortestWord, longestWord};
	}

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // taking user input, calling functions and displaying the word array and shortest and longest word in that array
    System.out.println("Enter a line of text:");
    String input = sc.nextLine();

    String [] words = splitWords(input);
    String [][] wordLengthArray = createWordLengthArray(words);

    System.out.println("Word\tLength");
    System.out.println("-----------------");
    for (int i = 0; i < wordLengthArray.length; i++) {
        String word = wordLengthArray[i][0];
        int length = Integer.parseInt(wordLengthArray[i][1]);
        System.out.println(word + "\t" + length);
    }
    String[] result = findShortestLongest(wordLengthArray);

    System.out.println("Shortest word: " + result[0] + " (Length: " + findLength(result[0]) + ")");
    System.out.println("Longest word: " + result[1] + " (Length: " + findLength(result[1]) + ")");

    sc.close();
	}
}

