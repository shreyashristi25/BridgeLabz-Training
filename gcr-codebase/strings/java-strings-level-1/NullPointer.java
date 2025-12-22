
public class NullPointer {

	//creating methods generateException and handleException to generate and handle null pointer exception 
    public static void generateException() {
        String text = null; 
        System.out.println("Length of text: " + text.length());
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } 
		catch (NullPointerException e) {
            System.out.println("Encountered NullPointerException! ");
        }
    }

    public static void main(String[] args) {
   
		//calling the methods and displaying output
        System.out.println("Calling generateException()...");
        try {
            generateException();
        } 
		catch (NullPointerException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("Calling handleException()...");
        handleException();
	}
}