package com.regex.extractionproblems;
import java.util.* ;
import java.util.regex.* ;
public class CapitalizedWordsExtractor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in ) ;
		
		//taking sentence as user input and extracting capitalized words in the sentence
		System.out.println("Enter a sentence : ") ;
		String text = sc.nextLine() ;
		
		String regex = "\\b[A-Z][a-zA-Z]*\\b" ;
		Pattern pattern = Pattern.compile(regex) ;
		Matcher matcher = pattern.matcher(text) ;
		
		System.out.println("Extracted Capitalized words are : ") ;
		boolean found = false ;
		while(matcher.find()) {
			System.out.println(matcher.group() +" ") ;
			found = true ;
		}
		
		if (!found) {
            System.out.println("No capitalized words found!");
        }

        sc.close();


	}

}
