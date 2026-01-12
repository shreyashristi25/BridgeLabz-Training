package com.callcentre;
import java.util.* ;
public class CallCenter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		//creating object of CustomerQueueManager class 
		CustomerQueueManager manager = new CustomerQueueManager();
		
		//taking user input for number of customers 
		System.out.println("Enter the number of customers : ") ;
		int n = sc.nextInt();
		sc.nextLine();
		
		//taking customer details as input
		for(int i = 0; i < n; i++) {
			System.out.println("Enter customer details : ") ;
			
			System.out.println( "Customer ID : ") ;
			String id = sc.nextLine();
			
			System.out.println("Enter Customer name : ") ;
			String name = sc.nextLine();
			
			System.out.println("Is VIP ? (true/false)? :") ;
			boolean isVIP = sc.nextBoolean();
			
			int priority = 0;
			if(isVIP) {
				System.out.println("Enter the priority (higher means more urgent and higher priority ) : ") ;
				priority = sc.nextInt();
			}
			sc.nextLine();
			
			Customer c = new Customer(name, id, isVIP, priority) ;
			manager.addCall(c) ;
			
 		}
		System.out.println("----Serving calls-----") ;
		for(int i =0; i < n; i++) {
			manager.serveCall() ;
		}
	}

}
