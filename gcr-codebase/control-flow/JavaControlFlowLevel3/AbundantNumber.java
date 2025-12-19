
import java.util.* ;
public class AbundantNumber {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in) ;
		
		//creating variables number,sum and originalNumber
	    System.out.println("Enter a number : ") ;
		int number = input.nextInt() ;
		int sum = 0 ;
		
		//extracting digits, calculating the sum of digits and printing result
		for(int i = 1 ; i < number ; i ++) {
			if(number % i == 0) {
				sum += i ;
			}
		}
		if(sum > number) {
			System.out.println (number +" is an Abundant number") ;
		}
		else {
			System.out.println (number +" is not an Abundant number") ;
		}
		
		input.close() ;
		}
}