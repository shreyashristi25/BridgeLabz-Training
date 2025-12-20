
import java.util.* ;
public class LeapYear {
	//creating method isLeapYear to check for leap year
    public static boolean isLeapYear(int year) {
        boolean a = (year % 4 == 0) && (year % 100 != 0) ;
        boolean b = (year % 400 == 0) ;
		boolean leap = a || b ;
        return leap  ;
    }
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Enter a year : ") ;
        int year = input.nextInt() ;
        if (year < 1582) {
            System.out.println("Invalid input! : Please enter a year > 1582.") ;
        } else {
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.") ;
            } else {
                System.out.println(year + " is NOT a Leap Year.") ;
            }
        }
		
        input.close() ;
    }
}