
import java.time.LocalDate;
import java.util.*;

public class DateManupulation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
	
		//getting user input, using the functions LocalDate, plusDays, plusMonths, plusYears and minusWeeks
		//to add 7 days, 1 month, and 2 years to it and then subtracts 3 weeks from the result.
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = sc.nextLine();
		
        LocalDate date = LocalDate.parse(input);
        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        System.out.println("Original date : " + date);
        System.out.println("Final date after operations : " + result);

        sc.close();
    }
}
