
import java.util.* ;
public class SumOfNumbers {
	
	//creating methods named calculateSum to calculate the sum of n natural numbers
	public int calculateSum(int n) {
		int sum = 0 ;
		for(int i = 1; i <= n; i++) {
			sum += i ;
		}
		return sum ;
	}
	
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in) ;
		
		//getting number from the user and printing sum of n natural numbers
		System.out.println("Enter a number : ") ;
		int number = input.nextInt() ;
		
		SumOfNumbers sumOfNumbers = new SumOfNumbers() ;
		if(number < 0 ) {
			System.out.println ("Invalid input! : Please enter a positive natural number") ;
		}
		else {
		int summation = sumOfNumbers.calculateSum(number) ;
		System.out.println("The sum of " +number +" natural numbers is " +summation) ;
		}
		
    input.close() ;
	  
   }
}