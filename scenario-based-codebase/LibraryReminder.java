/*Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class LibraryReminder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

		//creating variables to store fine and number of days
        long fine = 0;
        long days = 0;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		//checking for late fine and displaying result
		
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Due Date (dd/MM/yyyy):");
            String s1 = sc.nextLine();
            LocalDate dueDate = LocalDate.parse(s1, formatter);

            System.out.println("Enter Return Date (dd/MM/yyyy):");
            String s2 = sc.nextLine();
            LocalDate returnDate = LocalDate.parse(s2, formatter);

            if (returnDate.isAfter(dueDate)) {
                days = ChronoUnit.DAYS.between(dueDate, returnDate);
                fine = days * 5;
                System.out.println("Book returned late by " + days + " days. This inccurs fine :( ");
            } else {
                fine = 0;
                System.out.println("Book returned on time. No fine :) ");
            }

            System.out.println("Fine for book " + (i + 1) + " is ₹" + fine);
            System.out.println("-----------------------------------");
        }

		sc.close() ;
    }
}


