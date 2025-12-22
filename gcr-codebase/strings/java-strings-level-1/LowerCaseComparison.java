
import java.util.Scanner;
public class LowerCaseComparison {
	
	//creating methods manualToLowerCase and comapreStrings to convert to lower case and compare strings
    public static String manualToLowerCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); 
            }
            result = result + ch; 
        }
        return result;
    }
	 public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false; 
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false; 
            }
        }
        return true; 
    }
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		//getting user input, calling funtions and displaying result
        System.out.println("Enter a text:");
        String userInput = input.nextLine();
        String s1 = userInput.toLowerCase();
        String s2 = manualToLowerCase(userInput);
        boolean isEqual	= compareStrings(builtInLower, manualLower);

        System.out.println("Original Text: " + userInput);
        System.out.println("Built-in toLowerCase(): " + s1);
        System.out.println("Manual Conversion: " + s2);
        System.out.println("Are both results same? " + isEqual);

        input.close();
    }
}
