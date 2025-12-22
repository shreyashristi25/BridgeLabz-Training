
import java.util.* ;
public class EqualityOfArrays {

		//creating methods toArray and isEqual to convert string to array and check if the results are equal 
		public static char [] toArray(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    public static boolean isEqual(char [] arr1, char [] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

		
		public static void main(String args[]) {
			Scanner input = new Scanner(System.in) ;
		
			//getting user input and displaying the comarision result of user defined function and displaying result 
			System.out.println("Enter a string:");
			String string1 = input.next();

			char[] array1 = toArray(string1);
			System.out.println("The characters of array1 (using user-defined method) are:");
			for (char c : array1) {
				System.out.println(c);
			}

			char[] array2 = string1.toCharArray();
			System.out.println("The characters of array2 (using built-in toCharArray()) are:");
			for (char c : array2) {
				System.out.println(c);
			}
			
			if (isEqual(array1, array2)) {
				System.out.println("Both the arrays are same.");
			}
			else {
            System.out.println("Both the arrays are not same.");
			}

			input.close() ;
		}
	
}