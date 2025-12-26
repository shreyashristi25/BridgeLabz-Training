
import java.util.*;
public class IllegalArgumentExceptionImplementation {

   //creating methods generateException, handleException to generate and handle exceptions
    public static void generateException(String text) {
        System.out.println("Substring with invalid indices: " + text.substring(5, 2));
    }
	
    public static void handleException(String text) {
        try {
            System.out.println("Substring with invalid indices: " + text.substring(5, 2));
        } 
		catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } 
		catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	
		//getting user input and dispalying the implementation of IllegalArgumentException
        System.out.println("Enter a string:");
        String userInput = input.next();

        System.out.println("Calling generateException()");
        try {
            generateException(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Encountered Exception in generateException(): " + e);
        }

        System.out.println("Calling handleException()");
        handleException(userInput);

        input.close();
    }
}
