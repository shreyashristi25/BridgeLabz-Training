package com.collections.queue.stackusingqueues;
import java.util.* ;

public class StackUsingQueues {

	Queue<Integer> q1 = new LinkedList<> () ;
	Queue<Integer> q2 = new LinkedList<> () ;
	
	//methods to push, pop, peek and check if the stack is empty
	public void push(int x) {
		q2.add(x) ;
		
		while(!q1.isEmpty()) {
			q2.add(q1.remove()) ;
		}
		
		Queue<Integer> temp = q1 ;
		
		q1 = q2 ;
		q2 = temp ;
	}
	
	public int pop() {
		if(q1.isEmpty()) {
			System.out.println("Stack is empty!") ;
			return -1;
		}
		return q1.remove();
	}
	
	public int peek() {
		if(q1.isEmpty()) {
			System.out.println("Stack is empty!") ;
			return -1;
		}
		return q1.peek();
	}
	
	public boolean isEmpty() {
		return q1.isEmpty() ;
	}
}
