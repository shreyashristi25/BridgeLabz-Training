
import java.util.* ;

public class NumberFormatExceptionImplementation {

    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }
	
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } 
		catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        }
		catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking user input and dispalying the implementation of  NumberFormatException
        System.out.println("Enter a string:");
        String userInput = input.next();

        System.out.println("Calling generateException()");
        try {
            generateException(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("Calling handleException()");
        handleException(userInput);

        input.close();
    }
}
