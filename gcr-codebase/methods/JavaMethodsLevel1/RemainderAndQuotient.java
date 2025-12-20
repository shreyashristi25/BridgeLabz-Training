
import java.util.* ;
public class RemainderAndQuotient {

	//creating a method findRemainderAndQuotient to check for quotient and reminder
	public static int[] findRemainderAndQuotient(int number, int divisor) {
	 int [] arr = new int [2] ;
	 arr[0] = number / divisor ;
	 arr[1] = number % divisor ;
	 return arr ;
	}
	public static void main (String args []) {
		//creating variables number1 and number2 and taking user input
		Scanner input = new Scanner (System.in) ;
		int number1, number2 ;
		System.out.println ("Enter the first number : ") ;
		number1 = input.nextInt() ;
		System.out.println ("Enter the second number : ") ;
		number2 = input.nextInt() ;
		
		int [] array = findRemainderAndQuotient(number1, number2) ;
		System.out.println("The quotient of " + number1 +" divided by " +number2 +" is : " +array[0]) ;
		System.out.println("The reminder of " + number1 +" divided by " +number2 +" is : " +array[1]) ;
		
	}
}