
import java.util.* ;
public class SmallestAndLargest {
	
	//creating a method findSmallestAndLargest to find smallest and largest among three numbers
	public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
	 int [] arr = new int[2] ;
	 if(number1 > number2 && number1 > number3) {
	     arr[0] = number1 ;
	  }
	  else if(number2 > number1 && number2 > number3) {
	     arr[0] = number2 ;
	  }
	  else {
	     arr[0] = number3 ;
	  }
	  if(number1 < number2 && number1 < number3) {
	     arr[1] = number1 ;
	  }
	  else if(number2 < number1 && number2 < number3) {
	     arr[1] = number2 ;
	  }
	  else {
	     arr[1] = number3 ;
	  }
	  return arr  ;
	}
	public static void main (String args []) {
		
		//creating varibale number1, number2 and number3 and getting user input and printing the largest and second largest
		Scanner input = new Scanner (System.in) ;
		int number1, number2, number3 ;
		System.out.println ("Enter the first number : ") ;
		number1 = input.nextInt() ;
		System.out.println ("Enter the second number : ") ;
		number2 = input.nextInt() ;
		System.out.println ("Enter the third number : ") ;
		number3 = input.nextInt() ;
		int [] array = findSmallestAndLargest(number1, number2, number3) ;
		System.out.println("The largest number among the three is : " +array[0]) ;
		System.out.println("The smallest number among the three is : " +array[1]) ;
		
	}
}