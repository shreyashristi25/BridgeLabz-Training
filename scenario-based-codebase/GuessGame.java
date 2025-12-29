
import java.util.* ;
public class GuessGame {
	public static void main (String args []) {
		Scanner sc =  new Scanner(System.in) ;
		
		int attempt = 1 ;
		boolean guessed = false ;
		
		do {
			System.out.println("Think of a number between 1 and 100") ;
		System.out.println("I will guess the number") ;
		
		Random random = new Random() ;
		int guessNumber =  random.nextInt(100) + 1 ;
		System.out.println("The number is :" +guessNumber) ;
		
		System.out.println("Was my guess correct/low/high ?") ;
		String feedback = sc.next() ;
		
		if(feedback.equalsIgnoreCase("Correct")) {
			guessed = true ;
			System.out.println("Yay! My guess was correct.") ;
		}
		else {
			System.out.println("Oh! Let's Try Again.") ;
		}
		attempt++ ;
		}
		while(attempt <= 5 && !guessed) ;
		if(!guessed) {
			System.out.println("Was not able to guess in 5 attempts :( ") ;
			System.out.println("I will try next time!") ;
		}
		
		sc.close() ;
	}
}