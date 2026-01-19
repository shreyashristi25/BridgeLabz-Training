package com.collections.list.frequencycounter;
import java.util.* ;

//driver class for Frequency counter
public class Driver {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking number of items and items as user input and displaying the frequency of each item
		List<String> items = new ArrayList<>() ;
		System.out.println("Enter number of items : ") ;
		int n = sc.nextInt();
		sc.nextLine() ;
		
		System.out.println("Enter the items : ") ;
		for(int i = 0; i < n ; i++) {
			items.add(sc.nextLine()) ;
		}
		
		Map<String, Integer> result = FrequencyCounter.findFrequency(items) ;
		
		System.out.println("Input items : " + items) ;
		System.out.println("Frequency of each item : " +result) ;
		
	}
}
