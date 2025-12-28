
import java.util.* ;
public class FirstUnique {

    public static int firstUniqueChar(String s) {
        int n = s.length();

        for (int i = 0; i < n; i++) {
            boolean isUnique = true;

            for (int j = 0; j < n; j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int index = firstUniqueChar(input);

        if (index == -1) {
            System.out.println("No unique character found");
        } else {
            System.out.println("First unique character index: " + index);
            System.out.println("Character: " + input.charAt(index));
        }

        sc.close();
    }
}
