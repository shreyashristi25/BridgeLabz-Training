package com.functionalinterfaces.dateformatutility;
import java.time.* ;
import java.time.format.* ;

public interface DateFormatUtility {

	//methods to format date in different formats
	static String formatDate(LocalDate date, String pattern) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern) ;
		return date.format(formatter) ;
	}
	
	static String formatAsISO(LocalDate date) {
		return date.format(DateTimeFormatter.ISO_DATE) ;
	}
	
	static String formatAsUS(LocalDate date) {
		return date.format(DateTimeFormatter.ofPattern("MM-dd-yyyy")) ;
	}
	
	static String formatAsEU(LocalDate date) {
		return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) ;
	}
	
}
