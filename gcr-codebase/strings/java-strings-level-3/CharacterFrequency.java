
import java.util.*;
public class CharacterFrequency {

    //creating methods findFrequency, 
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; 
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char) i); 
                result[index][1] = String.valueOf(freq[i]);  
                index++;
            }
        }
        return result;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // getting user input and displaying result
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String [][] frequencies = findFrequency(text);

        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i][0] + " : " + frequencies[i][1]);
        }
    }
}

