package com.collections.set;
import java.util.* ;

public class SetToSortedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		Set<Integer> set = new HashSet<>() ;
		
		//taking user input for number of elements in set and its elements
		System.out.println("Enter number of elements in set :") ;
		int n =sc.nextInt() ;
		sc.nextLine() ;
				
		System.out.println("Enter the elements of set : ") ;
		for( int i =0; i <n; i++) {
			set.add(sc.nextInt()) ;
		}
		
		List<Integer> list = new ArrayList(set) ;
		
		//sorting the given set into a list and displaying result
		Collections.sort(list);
		
		System.out.println("Original Set : " +set) ;
		System.out.println("Sorted List : " +list) ;
		
		sc.close();

	}

}
