
import java.time.LocalDate;
import java.util.*;

public class DateComparison {
    public static void main(String args []) {
        Scanner input = new Scanner(System.in);

		//getting two dates as user input, comparing and displaying result
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String input1 = input.nextLine();
        LocalDate date1 = LocalDate.parse(input1);

        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String input2 = input.nextLine();
        LocalDate date2 = LocalDate.parse(input2);

        if (date1.isBefore(date2)) {
            System.out.println("The first date is before the second date.");
        } 
		else if (date1.isAfter(date2)) {
            System.out.println("The first date is after the second date.");
        }
		else if (date1.isEqual(date2)) {
            System.out.println("Both dates are the same.");
        }

        input.close();
    }
}
