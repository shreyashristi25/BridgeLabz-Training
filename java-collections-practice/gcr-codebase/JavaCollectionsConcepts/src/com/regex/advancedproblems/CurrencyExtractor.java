package com.regex.advancedproblems;
import java.util.* ;
import java.util.regex.* ;

public class CurrencyExtractor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking text as user input, extracting currency values from the text using regex
		System.out.println("Enter text : ") ;
		String text = sc.nextLine();
		
		String regex = "\\$?\\d+(\\.\\d{2})?";
		Pattern pattern = Pattern.compile(regex) ;
		Matcher matcher = pattern.matcher(text) ;
		
		List<String> values= new ArrayList<>() ;
		while(matcher.find()) {
			values.add(matcher.group()) ;
		}
		
		if(values.isEmpty()) {
			System.out.println("No Currency values found!") ;
		}
		else {
			System.out.println("Extracted currency values are : " +String.join(", ", values)) ;
		}

		sc.close() ;
	}

}
