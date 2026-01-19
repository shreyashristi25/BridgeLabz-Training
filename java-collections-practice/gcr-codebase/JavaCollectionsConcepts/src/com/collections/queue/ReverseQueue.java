package com.collections.queue;
import java.util.* ;

public class ReverseQueue {

	//method to reverse a queue
	public static void reverseQueue(Queue<Integer> queue) {
		if(queue.isEmpty()) {
			return ;
		}
		
		int front = queue.remove() ;
		reverseQueue(queue) ;
		
		queue.add(front) ;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input for size and elements of the queue
		Queue<Integer> queue = new  LinkedList<>() ;
		System.out.println("Enter the number of elements in the queue : ") ;
		int n = sc.nextInt() ;
		sc.nextLine() ;
		
		System.out.println("Enter elements of the queue : ") ;
		for(int i = 0; i < n; i++) {
			queue.add(sc.nextInt()) ;
			
		}
		
		System.out.println("Original Queue : " +queue) ;
		
		//reverse a queue and display result
		reverseQueue(queue) ;
		System.out.println("Reverse Queue : " +queue) ;
		
		sc.close();

	}

}
