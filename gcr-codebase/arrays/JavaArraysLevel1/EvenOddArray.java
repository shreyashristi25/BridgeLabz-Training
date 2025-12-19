
import java.util.* ;
public class EvenOddArray {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in) ;
		
		//creating varibale number and arrays named odd and even
		System.out.println("Enter a number : ") ;
		int number = input.nextInt() ;
		int [] odd = new int[number / 2 + 1] ;
		int [] even = new int[number / 2 + 1] ;
		int evenIndex = 0, oddIndex = 0 ;
		
		//checking for odd and even and storing in corresponding arrays and displaying result
		for(int i = 1; i <= number; i++) {
			if(i % 2 == 0) {
				even[evenIndex++] = i ;
			}
			else {
				odd[oddIndex++] = i ;
			}
		}
		System.out.println("Displaying the even numbers between 1 and the given number :") ;
		for(int i = 0; i < even.length; i++) {
			System.out.println(even[i]) ;
		}
		System.out.println("Displaying the odd numbers between 1 and the given number :") ;
		for(int i = 0; i < odd.length; i++) {
			System.out.println(odd[i]) ;
		}

		input.close() ;
	}
}