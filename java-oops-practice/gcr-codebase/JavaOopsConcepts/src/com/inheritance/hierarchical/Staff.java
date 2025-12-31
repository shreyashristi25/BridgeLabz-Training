package com.inheritance.hierarchical;

//creating Staff as a subclass of Person class
public class Staff extends Person{
	
	String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }

}
