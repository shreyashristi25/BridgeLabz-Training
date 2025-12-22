
import java.util.* ;
public class StringLength {

   //creating method findLength and using exception handling to handle exceptions
    public static int findLength(String text) {
        int count = 0 ;
        try {
            while (true) { 
                text.charAt(count) ; 
                count++ ;            
            }
        }
		catch (StringIndexOutOfBoundsException e) {
            return count ;
        }
    }
	    public static void main(String [] args) {
        Scanner input = new Scanner(System.in) ;

       //taking user input, calling functions and displaying result
        System.out.println("Enter a string:") ;
        String string = input.next() ;
        int length1 = findLength(string) ;
        int length2 = string.length() ;
        System.out.println("String entered: " + string) ;
        System.out.println("Length (using user-defined method) : " + length1) ;
        System.out.println("Length (using built-in method) : " + length2) ;

        input.close() ;
    }
}
