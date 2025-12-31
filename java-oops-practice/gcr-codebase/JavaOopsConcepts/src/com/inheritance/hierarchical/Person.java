package com.inheritance.hierarchical;

public class Person {
	
	String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //  method to display person info and role
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void displayRole() {
        System.out.println("Generic Person in School");
    }

}
