package com.inheritance;

//creating manager as subclass of Employee class
public class Manager extends Employee{

	int teamSize;

	//constructor
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Manages a team of size: " + teamSize);
    }

}
