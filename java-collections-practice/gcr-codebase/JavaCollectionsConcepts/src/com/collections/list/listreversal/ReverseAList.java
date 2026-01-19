package com.collections.list.listreversal;
import java.util.* ;

public class ReverseAList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		ArrayList<Integer> list = new ArrayList<> () ;
		LinkedList<Integer> newList = new LinkedList<>() ;
		
		//taking user input for elements to reverse and displaying result
		System.out.println("Enter the number of elements : ") ;
		int n = sc.nextInt();
		System.out.println("Enter the elements of arraylist : ") ;
		
		for(int i = 0; i < n;i ++) {
			
			list.add(sc.nextInt()) ;
		}
		
		System.out.println("Enter the elements of linkedlist : ") ;
		for(int i =0; i < n; i++) {
			newList.add(sc.nextInt()) ;
			
		}

		System.out.println("Original ArrayList : " +list) ;
		System.out.println("Reversed ArrayList : " +ListReversal.reverseArrayList(list)) ;
		
		System.out.println("Original LinkedList : " +newList) ;
		System.out.println("Reversed LinkedList : " +ListReversal.reverseLinkedList(newList)) ;
		
	}
}
