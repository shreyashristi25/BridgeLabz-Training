package com.regex.extractionproblems;
import java.util.* ;
import java.util.regex.*;

public class EmailExtractor {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		
		//taking text as input and extracting email addresses present in the text
		System.out.println("Enter text : ") ;
		String text = sc.nextLine() ;
		
		String regex = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Extracted Email Addresses are:");
        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("No email addresses found!");
        }

        sc.close();

	}

}
