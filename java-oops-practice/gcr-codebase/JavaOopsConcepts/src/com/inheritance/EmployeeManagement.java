package com.inheritance;

//Driver class for all the classes
public class EmployeeManagement {
	
	 public static void main(String[] args) {
	        // Polymorphism in action
	        Employee e1 = new Manager("Alice", 101, 90000, 5);
	        Employee e2 = new Developer("Bob", 102, 70000, "Java");
	        Employee e3 = new Intern("Charlie", 103, 20000, 6);

	        // Each call resolves to the subclass implementation
	        e1.displayDetails();
	        System.out.println("-------------------");
	        e2.displayDetails();
	        System.out.println("-------------------");
	        e3.displayDetails();
	    }

}
