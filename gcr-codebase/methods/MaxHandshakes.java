
import java.util.* ;
public class MaxHandshakes {
	
	//creating method named computeHandshakes to calculate the maximum possible handshakes
	public int computeHandshakes(int number) {
		int maxHandshakes = (number * (number - 1)) / 2 ;
		return maxHandshakes ;
	}
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in) ;
		
		System.out.println("Enter the number of students : ") ;
		int numberOfStudents = input.nextInt() ;
		if(numberOfStudents < 0 ) {
			System.out.println ("Invalid input! : Please enter a positive number") ;
		}
		
		MaxHandshakes mx = new MaxHandshakes() ;
		int maxHandshakes =  mx.computeHandshakes(numberOfStudents) ;
		System.out.println("The maximum possible handshakes for " +numberOfStudents +" is " +maxHandshakes) ;
	
    input.close() ;
	  
   }
}