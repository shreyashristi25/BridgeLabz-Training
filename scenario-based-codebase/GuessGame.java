
import java.util.* ;
public class GuessGame {
	public static void main (String args []) {
		Scanner sc =  new Scanner(System.in) ;
		
		//creating attempt and guessed variables
		int attempt = 1 ;
		boolean guessed = false ;
		
		//guessing number using random method and displaying result accordingly
		
		do {
			System.out.println("Let's guess a number between 1 and 100") ;
			System.out.println() ;
			System.out.println("Enter a number between 1 and 100" ) ;
			int number = sc.nextInt() ;
			 
			Random random = new Random() ;
			int guessNumber =  random.nextInt(100) + 1 ;
			System.out.println("The number i guessed is :" +guessNumber) ;
		
			if(number == guessNumber) {
				guessed = true ;
				System.out.println() ;
				System.out.println("Yay! You guessed correct.") ;
			}
			else if(number < guessNumber){
				System.out.println() ;
				System.out.println("Too low!") ;
				System.out.println("Let's Try Again!") ;
			}
			else {
				System.out.println() ;
				System.out.println("Too High!") ;
				System.out.println("Let's Try Again!") ;
			}
			attempt++ ;
		}
		while(attempt <= 5 && !guessed) ;
		if(!guessed) {
			System.out.println("Was not able to guess in 5 attempts :( ") ;
			System.out.println("Better luck next time!") ;
		}
		
		sc.close() ;
	}
}