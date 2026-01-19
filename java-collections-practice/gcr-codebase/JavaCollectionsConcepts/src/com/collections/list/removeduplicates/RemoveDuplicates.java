package com.collections.list.removeduplicates;
import java.util.* ;

public class RemoveDuplicates {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in) ;
		
		List<Integer> list = new ArrayList<>() ;
		
		//taking user input for number of elements in the list and the elements
		System.out.println("Enter the number of elements : ") ;
		int n = sc.nextInt() ;
		sc.nextLine() ;
		
		System.out.println("Enter elements of the list : ") ;
		for( int i = 0; i < n; i++) {
			list.add(sc.nextInt()) ;
		}
		
		Set<Integer> set = new LinkedHashSet<>(list) ;
		
		List <Integer> result = new ArrayList<>(set) ;
		
		//displaying original list and list without duplicates
		System.out.println("Original list : " +list) ;
		System.out.println("Output list(Without duplicates : " +result) ;
		
		sc.close();
	}
}
