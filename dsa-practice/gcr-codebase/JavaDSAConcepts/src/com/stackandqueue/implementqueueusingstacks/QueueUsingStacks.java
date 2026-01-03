package com.stackandqueue.implementqueueusingstacks;
import java.util.* ;
public class QueueUsingStacks {

	//private stacks 
	private Stack<Integer> stackEnqueue ;
	private Stack<Integer> stackDequeue ;
	
	public QueueUsingStacks() {
        stackEnqueue = new Stack<>();  
        stackDequeue = new Stack<>();   
    }

	//methods to perform different operations in a queue using stack
	public void enqueue(int x) {
		stackEnqueue.push(x) ;
		System.out.println("Enqueued: " + x);

	}
	
	public int dequeue() {
		if(stackDequeue.isEmpty()) {
			while(!stackEnqueue.isEmpty()) {
				stackDequeue.push(stackEnqueue.pop()) ;
			}
		}
		if (stackDequeue.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int value = stackDequeue.pop();
        System.out.println("Dequeued: " + value);
        return value;

	}
	
	public int peek() {
		if(stackDequeue.isEmpty()) {
			while(!stackEnqueue.isEmpty()) {
				stackDequeue.push(stackEnqueue.pop()) ;
			}
		}
		if (stackDequeue.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int value = stackDequeue.peek();
        System.out.println("Front element: " + value);
        return value;

	}
	public boolean isEmpty() {
		return stackEnqueue.isEmpty () && stackDequeue.isEmpty();
	}
}
