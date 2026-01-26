package com.regex.replacemodifystrings;
import java.util.* ;
import java.util.regex.* ;

public class CensorBadWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking sentence and bad words as user input 
		System.out.println("Enter a sentence : ") ;
		String sentence = sc.nextLine() ;
		
		System.out.println("Enter bad words seperated by commas : ") ;
		String[] badWords = sc.nextLine().split(",");

        for (int i = 0; i < badWords.length; i++) {
            badWords[i] = badWords[i].trim();
        }

        // Replacing each bad word with ****
        for (String bad : badWords) {
            sentence = sentence.replaceAll("(?i)\\b" + bad + "\\b", "****");
        }

        System.out.println("Censored Sentence: " + sentence);

        sc.close();


	}

}
