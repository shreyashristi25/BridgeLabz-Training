package com.collections.queue.circularbuffer;
import java.util.* ;

public class CircularBufferSimulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input for buffer size
		System.out.println("Enter size of the buffer : ") ;
		int n = sc.nextInt() ;
		
		CircularBuffer cb = new CircularBuffer(n) ;
		
		//getting user choice, calling methods and displaying result accordingly
		int choice ;
		
		do {
			System.out.println("1. Insert") ;
			System.out.println("2. Display Buffer") ;
			System.out.println("3. Exit") ;
			System.out.println("Enter your choice : ") ;
			choice = sc.nextInt() ;
			
			switch(choice) {
			case 1 :
				System.out.println("Enter value to insert into buffer  : ") ;
				int val = sc.nextInt() ;
				cb.insert(val) ;
				System.out.println(val + " Inserted !") ;
				break ;
				
			case 2 :
				cb.display();
				break ;
				
			case 3 :
				System.out.println("Exiting......") ;
				break ;
				
			default :
				System.out.println("Invalid Choice!") ;
			}
			
			
		}
		while(choice != 3) ;
		
		sc.close();

	}

}
