package com.collections.queue;
import java.util.* ;

public class GenerateBinaryUsingQueue {

	//method to generate first n binary numbers 
	public static List<String> generateBinary(int n) {
		List<String> result = new ArrayList<>() ;
		Queue<String> queue = new LinkedList<>() ;
		
		queue.add("1") ;
		
		for( int i =0; i < n; i ++) {
			String current = queue.remove();
			result.add(current) ;
			
			queue.add(current +"0") ;
			queue.add(current +"1") ;
		}
		return result ;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input for number n 
		System.out.println("Enter a number (n) : ") ;
		int n = sc.nextInt() ;
		
		//generating and displaying the first n binary numbers
		List<String> result = generateBinary(n) ;
		
		System.out.println("First " +n +" binary numbers : " +result ) ;
		
		sc.close();

	}

}
