
import java.util.* ;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        Random random = new Random() ;
		
        int min = 1, max = 100 ;
        boolean found = false ;

        System.out.println("Think of a number between 1 and 100.") ;
        System.out.println("I will try to guess it!") ;

		//getting user input for checking my guess is correct, low or high
        while (!found && min <= max) {
            int guess = random.nextInt(max - min + 1) + min ;
            System.out.println("My guess is: " + guess) ;

            System.out.print("Is it high, low, or correct? ") ;
            String feedback = input.nextLine().trim().toLowerCase() ;

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed it!") ;
                found = true ;
            } 
			else if (feedback.equals("high")) {
                max = guess - 1 ;
            }
			else if (feedback.equals("low")) {
                min = guess + 1 ;
            }
        }
        input.close() ;
    }
}
