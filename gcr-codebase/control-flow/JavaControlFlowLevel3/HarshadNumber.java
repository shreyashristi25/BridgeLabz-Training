
import java.util.* ;
public class HarshadNumber {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in) ;
		
		//creating variables number,sum and originalNumber
	    System.out.println("Enter a number : ") ;
		int number = input.nextInt() ;
		int sum = 0 ;
		int originalNumber = number ;
		
		//extracting digits, calculating the sum of digits and printing result
		while(originalNumber != 0) {
			int digit = originalNumber % 10 ;
			sum += digit ;
			originalNumber /= 10 ;
		}
		if(number % sum == 0) {
			System.out.println (number +" is an Harshad number") ;
		}
		else {
			System.out.println (number +" is not an Harshad number") ;
		}
		
		input.close() ;
		}
}