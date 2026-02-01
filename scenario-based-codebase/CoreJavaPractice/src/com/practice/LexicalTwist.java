package com.practice;
import java.util.* ;

public class LexicalTwist {

	public static String reverse(String s) {
		String reversed = "" ;
		for(int i = s.length() -1 ; i >= 0; i--) {
			reversed += s.charAt(i) ;
		}
		return reversed ;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input for two words
		System.out.println("Enter a string : ") ;
		String word1 = sc.nextLine() ;
		//checking if the strings contains more than one word
		
		String  [] words1 = word1.split(" ") ;
		if(words1.length > 1) {
			System.out.println(word1 +" is an invalid word.") ;
			return  ;
		}
		System.out.println("Enter second string : ") ;
		String word2 = sc.nextLine() ;
		
		String [] words2 = word2.split(" ") ;

		//checking if the strings contains more than one word
		if(words2.length > 1) {
			System.out.println(word2 +" is an invalid word.") ;
			return  ;
		}
		
		String reversedWord2 = (LexicalTwist.reverse(word2) );
		
		String reversed = "" ;
		
		//checking for first condition(If the second word is the reversed version of the first word)
		//performing the instructed tasks
		if(reversedWord2.toLowerCase().equals(word1.toLowerCase())) {
			reversed = LexicalTwist.reverse(word1) ;
			String reversedLower =reversed.toLowerCase() ;
			
			char [] reversedWord = reversedLower.toCharArray() ;
			for(int i = 0; i < reversedWord.length; i++) {
				if(reversedLower.charAt(i) == 'a' ||reversedLower.charAt(i)== 'e'|| reversedLower.charAt(i)== 'i' || reversedLower.charAt(i)== 'o' || reversedLower.charAt(i)== 'u') {
					reversedWord[i] = '@' ;
				}
			}
			
			System.out.println(new String(reversedWord)) ;
				
		}
		
		//checking for second condition(//checking for second condition(If the second word is the reversed version of the first word)
		//performing the instructed tasks
		else {
			StringBuilder combinedString = new StringBuilder() ;
			combinedString.append(word1).append(word2) ;
			String combined = combinedString.toString().toUpperCase() ;
			Set<Character> chars = new LinkedHashSet<>() ;
			
			int vowel =0, consonant =0 ;
			for(int i =0; i < combined.length(); i++) {
				chars.add(combined.charAt(i)) ;
				if(combined.charAt(i) =='A' ||combined.charAt(i) =='E' ||combined.charAt(i) =='I' ||combined.charAt(i) =='O' ||combined.charAt(i) =='U' ) {
					vowel ++ ;
				}
				else {
					consonant ++ ;
				}
			}
	
			int count =0 ;
			if(vowel > consonant) {
				 
					for(char x : chars) {
						if(x=='A' || x == 'E' || x== 'I' || x == 'O' || x== 'U') {
							System.out.print(x) ;
							count++ ;
						}
						if(count == 2) break ;
					
				}
			}
			else if(consonant > vowel) {
				
					for(char x : chars) {
						if(x!='A' && x != 'E' && x!= 'I' && x != 'O' && x!= 'U') {
							System.out.print(x) ;
							count++ ;
						}
						if(count == 2) break ;
					}
				
			}
			else {
				System.out.println("Vowels and Consonants are equal.") ;
			}
		}
	}

}
