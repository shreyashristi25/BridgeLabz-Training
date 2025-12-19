import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //creating a variable number an get user input and creating a variable count
		System.out.println("Enter a number : ") ;
		int number = input.nextInt() ;
		int count = 0 ;
		int num = number ;
		int index = 0 ; 
		if(number < 0) {
			System.out.println ("Invalid Input! : Please eneter a positive number") ;
		}
		
		//extracting digits and storing it into digit array and printing the array in reverse order
		while(num > 0) {
			int lastDigit = num % 10 ;
			count ++ ;
			num = num / 10 ;
		}
		int [] digits = new int[count] ;
		num = number ;
		while(num > 0) {
			int lastDigit = num % 10 ;
			digits[index++] = lastDigit ;
			num = num / 10 ;
		}
		int[] reversedDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - i - 1];
        }
		System.out.println("The number in reverse order is : ") ;
		for(int i = 0 ; i < count; i++) {
			System.out.println(digits[i]) ;
		}
		
        input.close();
    }
}
