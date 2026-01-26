package com.regex.advancedproblems;
import java.util.* ;
import java.util.regex.* ;

public class LanguageExtractor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//taking text as user input, defining a string array consisting of programming languages
		System.out.println("Enter text : " ) ;
		String text = sc.nextLine();
		
		String []  languages = {"Java", "Python", "JavaScript", "C++", "C", "Go", "C#", "Ruby", "PHP", "Swift", "Kotlin"} ;
		
		List<String> found = new ArrayList<> () ;
		
		//creating regex with word boundaries, case sensitive and extracting programming languages from the text
		for (String lang : languages) {
            
            String regex = "\\b" + lang + "\\b";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                found.add(matcher.group());
            }
        }

        if (found.isEmpty()) {
            System.out.println("No programming languages found!");
        } 
        else {
            System.out.println("Extracted Languages are : " + String.join(", ", found));
        }

        sc.close();


	}

}
