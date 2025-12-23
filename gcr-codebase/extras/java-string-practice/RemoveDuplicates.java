
import java.util.* ;
public class RemoveDuplicates {
	
	//creating toRemoveDuplicates to remove duplicate from a string
	public static String toRemoveDuplicates(String s) {
		char[] chars = s.toCharArray();
        char[] removed = new char[s.length()];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            boolean found = false;
            for (int j = 0; j < index; j++) {
                if (chars[i] == removed[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                removed[index] = chars[i];
                index++;
            }
        }
		return new String(removed) ;
    }

	public static void main (String args []) {
		Scanner input = new Scanner(System.in) ;
		
		//getting user input and displaying the new string
		System.out.println("Enter a string") ;
		String string = input.next() ;
		
		System.out.println("The string without duplicates is : " +toRemoveDuplicates(string)) ;
		
		input.close() ;
	}
}