
import java.util.* ;
public class LongestWord {
	
	//creating a method longestWord to get the longest word in the text
	public static String longestWord(String s) {
        String [] words = s.split(" ");  
        String longest = "";
        
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		//getting user input and displaying the longest word
        System.out.println("Enter a string:");
        String string = input.nextLine();  
        
        String longest = longestWord(string);
        
        System.out.println("The longest word in the given text is: " + longest);
        

		input.close() ;
	}
}