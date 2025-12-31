package com.inheritance;

public class Intern extends Employee {
	
	int durationMonths;

	//constructor
    Intern(String name, int id, double salary, int durationMonths) {
        super(name, id, salary);
        this.durationMonths = durationMonths;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship duration: " + durationMonths + " months");
    }

}
