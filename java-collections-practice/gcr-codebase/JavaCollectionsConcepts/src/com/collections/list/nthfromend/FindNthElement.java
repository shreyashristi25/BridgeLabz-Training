package com.collections.list.nthfromend;
import java.util.* ;

public class FindNthElement {

	//method to get nth element from last in a linkedlist
	public static String findNthElementFromEnd(LinkedList<String> list, int n) {
		if(n <= 0 || n > list.size()) {
			return null ;
		}
		
		int first = n ;
		int second = 0 ;
		
		while(first < list.size()) {
			first++ ;
			second++ ;
		}
		
		return list.get(second) ;
	}
}
