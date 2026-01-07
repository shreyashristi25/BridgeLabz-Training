package com.searching.linearsearch;
import java.util.* ;

public class WordInSentence {
	
		
	//method to check if the sentences contain the given word 
		public static String findWord(String [] sentences, String word) {
			
			for(String sentence : sentences) {
				if(sentence.contains(word)) {
					return "Found" ;
				}
				
			}
			return "Not Found" ;
		}
		
		public static void main(String args []) {
			Scanner sc = new Scanner (System.in) ;
		
			//Taking user input and displaying result
			System.out.println("Enter the number of sentences :") ;
			int size = sc.nextInt();
			
			String [] sentences =  new String [size] ;
			
 			System.out.println("Enter sentences :") ;
			for(int i = 0; i < size; i++) {
				sentences[i] = sc.nextLine();
			}
			
			System.out.println("Enter the word to check :") ;
			String word = sc.nextLine();
			
			String result = findWord(sentences, word) ;
			System.out.println("Word found in the sentences ? " +result) ;
			
			sc.close();
	}
}
