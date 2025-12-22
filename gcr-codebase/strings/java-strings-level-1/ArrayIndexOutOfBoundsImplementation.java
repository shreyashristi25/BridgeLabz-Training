
import java.util.*;

public class ArrayIndexOutOfBoundsImplementation {

    //creating methods generateException, handleException to generate and handle exceptions
    
	public static void generateException(int [] numbers) {
        System.out.println("Accessing invalid index: " + numbers[numbers.length]);
    }
	
    public static void handleException(int [] numbers) {
        try {
            System.out.println("Accessing invalid index: " + numbers[numbers.length]);
        } 
		catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } 
		catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking user input and dispalying the implementation of Array index out of bound exception
        System.out.println("Enter the size of array :");
        int size = input.nextInt();
        int [] numbers = new int[size];

        System.out.println("Enter the numbers :");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("Calling generateException()");
        try {
            generateException(numbers);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("Calling handleException()");
        handleException(numbers);

        input.close();
    }
}
