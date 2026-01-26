package com.regex.extractionproblems;
import java.util.* ;
import java.util.regex.* ;

public class LinkExtractor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking text as input and extracting links present in the text
		System.out.println("Enter text : ") ;
		String text = sc.nextLine() ;
				
		String regex = "https?://[\\w.-]+(?:\\.[\\w.-]+)+[/\\w._%+-]*";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);

		System.out.println("Extracted Links are:");
        boolean found = false;
        while (matcher.find()) {
        	System.out.println(matcher.group());
	        found = true;
	    }

		if (!found) {
			System.out.println("No links found!");
		}

        sc.close();

	}

}
