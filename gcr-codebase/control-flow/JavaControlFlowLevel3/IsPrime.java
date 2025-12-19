
import java.util.* ;
public class IsPrime {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in) ;
		
		//creating variable number and getting user input and creating a boolen variable
	    System.out.println("Enter a number : ") ;
		int number = input.nextInt() ;
		boolean isPrime = true ;
		
		//checking for prime
		if(number <= 1) {
			isPrime = false ;
		}
		else {
		for(int i = 2 ; i < number ; i++) {
			if(number % i == 0) {
				isPrime = false ;
				break ;
			}
		}
		}
		if(isPrime) {
			System.out.println("The number " +number +" is prime ") ;
		}
		else {
			System.out.println("The number " +number +" is not prime ") ;
		}
		input.close() ;
		}
}