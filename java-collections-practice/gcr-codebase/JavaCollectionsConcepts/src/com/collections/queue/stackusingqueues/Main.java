package com.collections.queue.stackusingqueues;
import java.util.* ;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		StackUsingQueues stack = new StackUsingQueues() ;
		
		//taking user choice as input, performing operations and displaying result accordingly
		int choice ;
		
		do {
			System.out.println("1. Push" ) ;
			System.out.println("2. Pop" ) ;
			System.out.println("3. Peek" ) ;
			System.out.println("4. Exit" ) ;
			System.out.println("Enter your choice : " ) ;
			choice = sc.nextInt() ;
			
			switch(choice) {
			case 1:
				System.out.println("Enter value to push : ") ;
				int value = sc.nextInt() ;
				stack.push(value);
				System.out.println(value +" pushed onto stack!") ;
				break ;
				
			case 2 :
				int popped = stack.pop();
				if(popped != -1) {
					System.out.println("Popped : " +popped) ;
					
				}
				break ;
				
			case 3: 
				int topVal = stack.peek() ;
				if(topVal != -1) {
					System.out.println("Top element in stack : " +topVal) ;
					
				}
				break ;
				
			case 4 :
				System.out.println("Exiting......") ;
				return ;
			
			default : 
				System.out.println("Inavalid choice!") ;
			}
		}
		while(choice != 4) ;
		
		sc.close();

	}

}
