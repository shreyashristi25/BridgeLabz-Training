package com.junit.main.dateformatter;
import java.text.*; 
import java.util.Date;
public class DateFormatter {

	// method to convert yyyy-MM-dd to dd-MM-yyyy
    public String formatDate(String inputDate) throws ParseException {
        
    	if (inputDate == null || inputDate.isEmpty()) {
            throw new IllegalArgumentException("Input date cannot be null or empty");
        }

        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");

        Date date = inputFormat.parse(inputDate); 
        return outputFormat.format(date);
    }

}
