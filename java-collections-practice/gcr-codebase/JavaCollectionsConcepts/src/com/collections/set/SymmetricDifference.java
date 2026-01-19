package com.collections.set;
import java.util.* ;

public class SymmetricDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		Set<Integer> set1 = new HashSet<>() ;
		Set<Integer> set2 = new HashSet<>() ;
		
		//taking user input for number of elements in two sets and their elements
		System.out.println("Enter number of elements in set1 :") ;
		int n1 =sc.nextInt() ;
		sc.nextLine() ;
				
		System.out.println("Enter the elements of set1 : ") ;
		for( int i =0; i <n1; i++) {
			set1.add(sc.nextInt()) ;
		}
				
		System.out.println("Enter number of elements in set2 :") ;
		int n2 =sc.nextInt() ;
		sc.nextLine() ;
				
		System.out.println("Enter the elements of set2 : ") ;
		for( int i = 0; i <n2; i++) {
			set2.add(sc.nextInt()) ;
		}
		
		//finding insertion, union and symmetricDifference and displaying result

		Set<Integer> union = new HashSet<>(set1) ;
		union.addAll(set2) ;
				
		Set<Integer> intersection = new HashSet<>(set1) ;
		intersection.retainAll(set2) ;
		
		Set<Integer> symmetricDifference = new HashSet<>(union) ;
		symmetricDifference.removeAll(intersection) ;

		System.out.println("Set1 :" +set1) ;
		System.out.println("Set2 :" +set2) ;
		System.out.println("Symmetric Difference :" +symmetricDifference) ;


		sc.close();
	}

}
