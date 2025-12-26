
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {

	//creating method isAnagram to check for anagrams
    public static boolean isAnagram(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();

        if (n1 != n2) {
            return false;
        }

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		//Taking user input, checking for anagrams by calling function and displaying result
		
        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        if (isAnagram(s, t)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        sc.close();
    }
}
