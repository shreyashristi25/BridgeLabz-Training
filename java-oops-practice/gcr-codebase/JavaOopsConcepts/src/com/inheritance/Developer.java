package com.inheritance;

//creating Developer as subclass of Employee class
public class Developer extends Employee {
	
	String programmingLanguage;
	
	//constructor
    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Specializes in: " + programmingLanguage);
    }

}
