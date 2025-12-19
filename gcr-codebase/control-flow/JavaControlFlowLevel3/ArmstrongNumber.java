
import java.util.* ;
public class ArmstrongNumber {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in) ;
		
		//creating variables number,sum and originalNumber
	    System.out.println("Enter a number : ") ;
		int number = input.nextInt() ;
		int sum = 0 ;
		int originalNumber = number ;
		
		//extracting digits, calculating the sum of cubes of digits and printing result
		while(originalNumber != 0) {
			int digit = originalNumber % 10 ;
			sum += digit * digit * digit ;
			originalNumber /= 10 ;
		}
		if(sum == number) {
			System.out.println (number +" is an armstrong number") ;
		}
		else {
			System.out.println (number +" is not an armstrong number") ;
		}
		
		input.close() ;
		}
}