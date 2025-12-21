
import java.util.*      ;
public class Calender {

	// creating arrays of months and number of days in each month 
    public static final String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };
	
    public static final int[] daysInMonth = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

	//creating methods isLeapYear, getDaysInMonth, getMonthName, getFirstDayOfMonth and displayCalendar
	//To check for leap year, get number of days in month, get the month's name, get the first day of the month and display calender
	
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    public static String getMonthName(int month) {
        return months[month - 1];
    }

    public static int getFirstDayOfMonth(int month, int year) {
		int d = 1; 

		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = month + 12 * ((14 - month) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;

    return d0;
    }
	
    public static void displayCalendar(int month, int year) {
        int days = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.println("\n   " + getMonthName(month) + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
		
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= days; day++) {
            System.out.printf("%4d", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

	public static void main(String args []) {
		Scanner input = new Scanner(System.in);
		
		//getting user input and displaying result
		System.out.print("Enter month (1-12): ");
		int month = input.nextInt();
        System.out.print("Enter year: ");
        int year = input.nextInt();
        displayCalendar(month, year);
		
        input.close();
    }
}