package com.stringbuilder;
import java.util.* ;

public class RemoveDuplicates {
	
		//method to remove duplicates from a string
		public static String removeDuplicates(String input) {
	        StringBuilder sb = new StringBuilder();
	        HashSet<Character> seen = new HashSet<>();

	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            if (!seen.contains(c)) {
	                sb.append(c);
	                seen.add(c);
	            }
	        }
	        return sb.toString();
	    }

		public static void main (String args[]) {
			Scanner sc = new Scanner(System.in);

			//Taking user input and displaying result
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        String result = removeDuplicates(str);

	        System.out.println("Original String: " + str);
	        System.out.println("String Without Duplicates: " + result);

	        sc.close();

	    }

}

