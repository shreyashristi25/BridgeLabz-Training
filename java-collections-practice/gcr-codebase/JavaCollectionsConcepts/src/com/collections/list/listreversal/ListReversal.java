package com.collections.list.listreversal;
import java.util.* ;

public class ListReversal {

	//method to reverse an rrayList
	public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> list) {
		ArrayList <Integer> reversedList =  new ArrayList<> () ;
		for( int i = list.size() - 1; i >= 0; i--  ) {
			reversedList.add(list.get(i)) ;
		}
		
		return reversedList ;
	}
	
	//method to reverse a LinkedList
	public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
		LinkedList<Integer> reversedList = new LinkedList<>() ;
		for(int i = list.size()-1; i >= 0; i--) {
			reversedList.add(list.get(i)) ;
		}
		
		return reversedList ;
	}
}
