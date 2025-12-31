package com.inheritance.hierarchical;

//driver class for all classes
public class SchoolSystem {

	public static void main(String[] args) {
		
		// Polymorphism: all stored as Person references
        Person p1 = new Teacher("Alice", 35, "Mathematics");
        Person p2 = new Student("Bob", 16, "10th Grade");
        Person p3 = new Staff("Charlie", 40, "Administration");

        p1.displayInfo();
        p1.displayRole();
        System.out.println("-------------------");

        p2.displayInfo();
        p2.displayRole();
        System.out.println("-------------------");

        p3.displayInfo();
        p3.displayRole();


	}

}
