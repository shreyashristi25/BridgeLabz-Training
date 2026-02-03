package com.collectors.wordfrequancycounter;
import java.util.* ;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking paragraph as user input 
		System.out.println("Enter a paragraph : ") ;
		String paragraph = sc.nextLine() ;
		
		//converting into word array
		String[] words = paragraph.toLowerCase()
                .replaceAll("[^a-zA-Z ]", "")
                .split("\\s+");

		
		//counting frequencies
		Map<String, Integer> wordCount = Arrays.stream(words)
				.collect(Collectors.toMap(word-> word, word->1, Integer :: sum)) ;
		
		//displaying words with their frequencies 
		System.out.println("Word Occurrences : ") ;
		wordCount.forEach((word, count)-> System.out.println(word + "->" +count));
	}

}
