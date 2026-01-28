package com.junit.main.dateformatter;
import java.util.* ;
import java.text.* ;

public class DateFormatterMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        DateFormatter formatter = new DateFormatter();

        //taking date as user input, calling methods and displaying result accordingly
        System.out.print("Enter date in yyyy-MM-dd format: ");
        String inputDate = sc.nextLine();

        try {
            String formattedDate = formatter.formatDate(inputDate);
            System.out.println("Formatted date: " + formattedDate);
        } 
        catch (ParseException e) {
            System.out.println("❌ Invalid date format. Please use yyyy-MM-dd.");
        } 
        catch (IllegalArgumentException e) {
            System.out.println("❌ " + e.getMessage());
        }

        sc.close();


	}

}
