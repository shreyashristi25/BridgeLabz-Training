package com.inheritance.hybrid;

public class Restaurant {

	public static void main(String[] args) {

	        // Polymorphism: both Chef and Waiter are Workers
	        Worker w1 = new Chef("Alice", 101, "Italian");
	        Worker w2 = new Waiter("Bob", 102, 5);

	        // Perform duties
	        w1.performDuties();
	        w2.performDuties();

	        System.out.println("-------------------");

	        // Access Person details
	        Person p1 = (Person) w1;
	        Person p2 = (Person) w2;

	        p1.displayInfo();
	        p2.displayInfo();


	}

}
