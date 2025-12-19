
import java.util.* ;
public class DigitCounter {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in) ;
		
		//creating variables number,sum and originalNumber
	    System.out.println("Enter a number : ") ;
		int number = input.nextInt() ;
		int count = 0 ;
		int originalNumber = number ;
		
		//extracting and digits
		while(originalNumber != 0) {
			int digit = originalNumber % 10 ;
			count ++ ;
			originalNumber /= 10 ;
			
		}
		System.out.println ("The number of digits in " +number +" is " +count) ;
		
		input.close() ;
		}
}