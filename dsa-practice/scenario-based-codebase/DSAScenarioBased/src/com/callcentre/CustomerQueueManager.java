package com.callcentre;
import java.util. * ;

public class CustomerQueueManager {

	//collection frameworks to store different data in different frameworks
	Queue<Customer> normal = new LinkedList<> () ;
	PriorityQueue<Customer> vip =  new PriorityQueue <> ((a, b) -> b.priority - a.priority) ;
	HashMap<String, Integer> callHistory = new HashMap<>() ;
	
	//method to add and serve calls
	public void addCall(Customer c) {
		callHistory.put(c.customerID, callHistory.getOrDefault(c.customerID, 0) + 1);
		
		if(c.isVIP) {
			vip.add(c) ;
			System.out.println("VIP cuctomer added :" +c.name) ;
		}
		else {
			normal.add(c) ;
			System.out.println("Normal customer added :" +c.name) ;
		}		
	}
	
	public void serveCall() {
		Customer c ;
		if(!vip.isEmpty()) {
			c= vip.poll() ;
		}
		else {
			c= normal.poll();
		}
		if(c != null) {
			System.out.println("Serving customer : " +c.name) ;
		}
		else {
			System.out.println("No customer in queue" ) ;
		}
	}
}
