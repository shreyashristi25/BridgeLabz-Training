
import java.util.Scanner;
public class DetectCapital {

    public static boolean detectCapital(String word) {
        int n = word.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                count++;
            }
        }

        if (count == 0 || count == n || (count == 1 && Character.isUpperCase(word.charAt(0)))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        boolean result = detectCapital(word);

        System.out.println("Is capital usage correct? " + result);

        sc.close();
    }
}
