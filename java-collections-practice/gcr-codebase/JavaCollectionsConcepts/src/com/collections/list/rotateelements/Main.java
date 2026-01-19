package com.collections.list.rotateelements;
import java.util.* ;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking number of elemnts and elements of the list from user and displaying the rotated list
		List<Integer> list = new ArrayList<> () ;
		
		System.out.println("Enter the number of elements in the list : ") ;
		int n = sc.nextInt();
		sc.nextLine(); 
		
		System.out.println("Enter rotation point : ") ;
		int k = sc.nextInt();
		sc.nextLine() ;
		
		System.out.println("Enter the elements : ") ;
		for(int i =0; i < n; i++) {
			list.add(sc.nextInt()) ;
		}
		
		List<Integer> result = RotateList.rotateList(list, k);
		
		System.out.println("Original list : " +list) ;
		System.out.println("Rotated list by " +k +" position is : " +result) ;

	}

}
