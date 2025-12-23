
import java.util.*;
public class FrequencyCounter {

    // creating method findFrequency to count the frequency of characters in a string 
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();  
        int[] freq = new int[chars.length];  

        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1; // initialize frequency

            if (chars[i] == '0') {
                continue;
            }

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
		}
	    String[] result = new String[chars.length];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') { 
                result[index++] = chars[i] + " : " + freq[i];
            }
        }

        String[] finalResult = new String[index];
        System.arraycopy(result, 0, finalResult, 0, index);

        return finalResult;
    }
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // getting user input and displaying result
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String [] frequencies = findFrequency(text);

        System.out.println("Character frequencies:");
        for (String s : frequencies) {
            System.out.println(s);
        }
    }
}

