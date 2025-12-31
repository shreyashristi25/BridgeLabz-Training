package com.inheritance.single;

public class BookMain {

	public static void main(String[] args) {

				//creating object of author class and displaying result
		        Author a1 = new Author("Effective Java", 2018, 
		                               "Joshua Bloch", 
		                               "Renowned software engineer and author of Java best practices.");

		        // Polymorphism: Author object but method comes from subclass
		        a1.displayInfo();


	}

}
