package com.collections.queue.circularbuffer;

public class CircularBuffer {

	private int [] buffer ;
	private int head ;
	private int tail ;
	private int size ;
	private int capacity ;
	
	//constructor
	public CircularBuffer(int capacity) {
		this.capacity = capacity ;
		buffer = new int[capacity] ;
		head =0; 
		tail = 0;
		size = 0;	
	}
	
	//method to insert elements into the buffer and display the buffer
	public void insert(int value) {
		buffer[tail] = value ;
		tail = (tail+ 1) % capacity ;
		
		if(size == capacity) {
			head = (head + 1) % capacity ;
		}
		else {
			size ++ ;
		}
	}
	
	public void display() {
		
		System.out.print("Buffer  : [ ") ;
		for(int i =0; i < size; i++) {
			int index = (head + i) % capacity ;
			System.out.print(buffer[index]) ;
			if(i < size -1) {
				System.out.print(", ") ;
			}
		}
		System.out.println("]") ;
	}
}
