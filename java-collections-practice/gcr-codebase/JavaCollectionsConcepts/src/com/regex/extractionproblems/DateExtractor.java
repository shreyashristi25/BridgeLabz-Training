package com.regex.extractionproblems;
import java.util.* ;
import java.util.regex.* ;

public class DateExtractor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		

		//taking text as input and extracting dates present in the text
		System.out.println("Enter text : ") ;
		String text = sc.nextLine() ;
				
		String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);

		System.out.println("Extracted Dates are:");
        boolean found = false;
        while (matcher.find()) {
        	System.out.println(matcher.group());
	        found = true;
	    }

		if (!found) {
			System.out.println("No dates found!");
		}

        sc.close();
	}

}
