
import java.util.* ;
public class LeapYear {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in) ;
		
		//creating variable to store year
		System.out.println("Enter a year : ") ;
		int year = input.nextInt() ;
		
		//checking for leap year using multiple if-else
		if (year >= 1582) {
			if(year % 400 == 0) {
				System.out.println (year +" is a leap year" +"-using if-else") ;
			}
			else if (year % 100 ==0) {
				System.out.println (year +" is  not a leap year" +"-using if-else") ;
			}
			else if (year % 4 ==0) {
				System.out.println (year +" is a leap year" +"-using if-else") ;
			}
			else {
				System.out.println (year +" is  not a leap year" +"-using if-else") ;
			}
			
		//checking for leap year using only one if statement and multiple logical statements
		if( (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println (year +" is a leap year" +"-using single if ") ;
		}
		else {
			System.out.println (year +" is  not a leap year" +"-using single if") ;
		}
	    }
		else {
			System.out.println ("Invalid input : Please eneter a year >= 1582") ;
		}
		
		input.close() ;
		
	}
}