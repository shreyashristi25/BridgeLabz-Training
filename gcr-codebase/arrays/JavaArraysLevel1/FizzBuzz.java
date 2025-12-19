
import java.util.* ;
public class FizzBuzz {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in) ;
        
		System.out.println("Enter a number : ") ;
		int number = input.nextInt() ;
		String [] result = new String[number] ;
		if(number > 0) {
			for(int i = 1; i <= number; i++){
				if(i % 3 == 0 && i % 5 == 0) {
					result[i-1] = "FizzBuzz" ;
				}
				else if(i % 3 == 0) {
					result[i-1] = "Fizz" ;
				}
				else if(i % 5 == 0) {
					result[i-1] = "Buzz" ;
				}
				else {
					result[i-1] = String.valueOf(i) ;
				}
			}
		}
		else {
			System.out.println("Invalid input : Please enter a positive number") ;
		}
		for(int i = 0; i < number; i++) {
			System.out.println("Position " +(i+1) +" = " +result[i]) ;
		}
		  
		input.close() ;
	}
}