
import java.util.*;
public class Anagram {

	//creating method isAnagram to check for anagram
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            freq1[ch]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            freq2[ch]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) return false;
        }

        return true;
    }

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		//getting user input and displaying result for anagram
        System.out.print("Enter first string : ");
        String s1 = sc.nextLine();
		System.out.print("Enter second string : ");
        String s2 = sc.nextLine();
		if(isAnagram(s1, s2)) {
			System.out.println("The strings are Anagram!") ;
		}
		else {
			System.out.println("The strings are not Anagram!") ;
		}
        
        input.close();
    }
}