package com.collections.list.rotateelements;
import java.util.* ;

public class RotateList {

	//method to left rotate a given list by k position
	public static List<Integer> rotateList(List<Integer> list, int k ) {
		
		int n =list.size();
		
		if(n == 0) {
			return list ;
		}
		
		k = k % n ;
		List<Integer> rotated = new ArrayList<> () ;
		rotated.addAll(list.subList(k,  n)) ;
		rotated.addAll(list.subList(0, k)) ;
		
		return rotated ;
	}
}
