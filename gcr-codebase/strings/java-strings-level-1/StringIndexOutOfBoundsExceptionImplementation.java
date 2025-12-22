
import java.util.* ;
public class StringIndexOutOfBoundsExceptionImplementation {

	//creating methods generateException, handleException to generate and handle string index out of bond exception
	public static void generateException(String text) {
        
        System.out.println("Character at invalid index: " + text.charAt(text.length())) ;
    }

    public static void handleException(String text) {
        try {
            System.out.println("Character at invalid index: " + text.charAt(text.length())) ;
        } 
		catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException! ") ;
        }
    }

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        //creating variables, getting user input and calling the methods to generate and handle exception 
        System.out.println("Enter a string :") ;
        String userInput = input.next() ;
        System.out.println("Calling generateException()") ;
        try {
            generateException(userInput) ;
        } 
		catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException(): " + e) ;
        }
     
        System.out.println("Calling handleException()") ;
        handleException(userInput) ;

        input.close() ;

	}
}