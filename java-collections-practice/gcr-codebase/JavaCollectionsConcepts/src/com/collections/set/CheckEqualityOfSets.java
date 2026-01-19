package com.collections.set;
import java.util.* ;

public class CheckEqualityOfSets {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		
		Set<Integer> set1 = new HashSet<>() ;
		Set<Integer> set2 =  new HashSet<>() ;
		
		//taking user input for number of elements in set1 and set2, and their elements
		System.out.println("Enter size of set1 : ") ;
		int n1 = sc.nextInt() ;
		sc.nextLine() ;
		
		System.out.println("Enter the elements of set1 : ") ;
		for( int i = 0; i < n1; i++) {
			set1.add(sc.nextInt()) ;
		}
		
		System.out.println("Enter size of set2 : ") ;
		int n2 = sc.nextInt() ;
		sc.nextLine() ;
		
		System.out.println("Enter the elements of set2 : ") ;
		for( int i = 0; i < n2; i++) {
			set2.add(sc.nextInt()) ;
		}
		
		//comparing both sets and displaying the result
		boolean areEqual = set1.equals(set2) ;
		
		System.out.println("Set1 : " +set1) ;
		System.out.println("Set2 : " +set2) ;
		System.out.println("Are set1 and set2 equal ? " +areEqual) ;
		
		
	}

}
