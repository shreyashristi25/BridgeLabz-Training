
import java.util.* ;
public class ReverseString {

	//creating a function reverseStringto reverse a string
    public static void reverseString(char [] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		//Taking user input and displaying result
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        char [] s = string.toCharArray();

        reverseString(s);

        System.out.print("Reversed String: ");
        System.out.println(new String(s));

        input.close();
    }
}
