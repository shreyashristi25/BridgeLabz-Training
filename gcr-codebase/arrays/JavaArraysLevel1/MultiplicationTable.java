
import java.util.* ;
public class MultiplicationTable {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in) ;
		
		//creating varibale number to get user input and an array named multiplication to store multiplication table of the given number
		System.out.println("Enter a number : ") ;
		int number = input.nextInt() ;
		int [] multiplication = new int[10] ;
		
		//printing the multiplication table
		
		for(int i = 0; i < multiplication.length ; i++) {
			multiplication[i] = (i+1) * number ;
			System.out.println( "number * " +(i+1) +" = " +multiplication[i]) ;
		}
		input.close() ;
	}
}