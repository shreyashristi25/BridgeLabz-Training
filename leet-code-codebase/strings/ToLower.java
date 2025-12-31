
import java.util.*;
public class ToLower {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		
		//getting user input and converting the characters in upper case to lower case 
        System.out.println("Enter a string:");
        String input = sc.nextLine(); 
        String newString = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                newString += Character.toLowerCase(ch);
            } else {
                newString += ch;
            }
        }

        System.out.println("Converted string with only lower case characters: " + newString);
    }
}
