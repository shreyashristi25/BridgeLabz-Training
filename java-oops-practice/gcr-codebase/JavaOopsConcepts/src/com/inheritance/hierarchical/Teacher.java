package com.inheritance.hierarchical;

//creating Teacher as subclass of Person class
public class Teacher extends Person {
	
	String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }

}
