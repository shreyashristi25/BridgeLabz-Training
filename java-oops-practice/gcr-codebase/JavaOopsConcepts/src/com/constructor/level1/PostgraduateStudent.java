package com.constructor.level1;

public class PostgraduateStudent extends Student {
	String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Method to show access to protected member 'name'
    public void displayPostgraduateDetails() {
        System.out.println("PG Student Name: " + name + ", Roll Number: " + rollNumber +  ", Specialization: " + specialization +", CGPA: " + getCGPA()); 
    }

}
