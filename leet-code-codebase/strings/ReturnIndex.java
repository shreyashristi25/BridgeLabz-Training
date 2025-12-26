
import java.util.Scanner;
public class ReturnIndex {

	//creating method returnIndex to return the index of first occurence of a string in another string
    public static int returnIndex(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
		}
        else {
            return -1;
		}
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		//getting user input, calling function and displaying result
        System.out.print("Enter the haystack string: ");
        String haystack = sc.nextLine();

        System.out.print("Enter the needle string: ");
        String needle = sc.nextLine();

        int index = returnIndex(haystack, needle);

        if (index != -1) {
            System.out.println("The needle is found at index: " + index);
        } else {
            System.out.println("The needle is not found in the haystack.");
        }

        sc.close();
    }
}
