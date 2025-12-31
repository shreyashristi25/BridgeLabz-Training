package com.inheritance.hybrid;

//creating Waiter class that extends Person and implements Worker
public class Waiter extends Person implements Worker {
	
	int tablesAssigned;

	//constructor
    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Waiter) serves customers at " + tablesAssigned + " tables.");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Waiter, Tables Assigned: " + tablesAssigned);
    }

}
