package com.inheritance.hybrid;

//creating class chef extends Person and implements Worker
public class Chef extends Person implements Worker{

	String specialty;

	//constructor
    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Chef) prepares " + specialty + " dishes.");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Chef, Specialty: " + specialty);
    }

}
