package com.constructor.level1;

public class Student {
    
	//declaring variables using different access specifiers
    public int rollNumber;

    protected String name;

    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public methods to access and modify CGPA 
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber +", Name: " + name +", CGPA: " + CGPA);
    }
}

