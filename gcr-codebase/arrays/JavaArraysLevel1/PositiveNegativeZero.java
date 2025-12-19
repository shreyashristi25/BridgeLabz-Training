
import java.util.* ;
public class PositiveNegativeZero {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in) ;
		
		//creating array named numbers to store 5 numbers and getting user input 
		int [] numbers = new int[5] ;
		System.out.println("Enter 5 numbers : ") ;
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt() ;
		}
		
		//checking if the number is positive, negative or zero 
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				System.out.println ("The number " +numbers[i] +" is a negative number.") ;
			}
			else if (numbers[i] > 0){
				System.out.println("The number " +numbers[i] +" is a positive number.") ;
			}
			else {
					System.out.println("The number " +numbers[i] +" is zero.") ;	
			}
		}
		
		input.close() ;
	}
}