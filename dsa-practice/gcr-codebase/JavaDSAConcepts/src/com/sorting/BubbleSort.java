package com.sorting;
import java.util. *;

public class BubbleSort {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in) ;
		
		System.out.println("Enter the size of the array :") ;
		int n = sc.nextInt() ;
		
		int [] marks = new int[n] ;
		
		System.out.println("Enter the elemnets :") ;
		for(int i = 0; i < n-1; i++) {
			marks[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n-i-1; i++) {
			boolean swap = false ;
			for(int j = 0; j < n-1; j++) {
				if(marks[j] > marks[j+1]) {
					int temp =  marks[j] ;
					marks[j] = marks[j+1] ;
					marks[j+1] = temp ;
					swap =  true ;
				}
			}
			if(!swap) {
				break ;
			}
		}	
			
		System.out.println("Sorted Marks : ") ;
		for(int x : marks) {
			System.out.println(x) ;
		}
		
	}
}
