
import java.util.* ;
public class MultiplicationTableArray {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in) ;
		
		//creating varibale number to get user input and an array named multiplication to store multiplication table of the given number
		System.out.println("Enter a number : ") ;
		int number = input.nextInt() ;
		int [] multiplication = new int[10] ;
		
		//printing the multiplication table
		if(number >= 6 && number <= 9) {
			int initial = 0 ;
			for(int i = 0; i < multiplication.length ; i++) {
				multiplication[i] = ++initial * number ;
				System.out.println( "number * " +initial +" = " +multiplication[i]) ;
			}
		}
		else {
			System.out.println("Invalid input : Please enter a number between 6 and 9 ") ;
		}
		input.close() ;
	}
}