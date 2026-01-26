package com.regex.advancedproblems;
import java.util.* ;
import java.util.regex.* ;

public class RepeatingWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking sentence as user input
		System.out.println("Enter a sentence : ") ;
		String sentence = sc.nextLine() ;
		
		// regex for repeating words
        String regex = "\\b(\\w+)\\b\\s+\\1\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sentence);

        //displaying repeated words
        System.out.println("Repeating Words are:");
        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group(1));
            found = true;
        }

        if (!found) {
            System.out.println("No repeating words found!");
        }

        sc.close();
    }

	

}
