package com.functionalinterface.consumer;

public class Student {

	String name;
    int marks;
    
    //constructor
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    
    @Override
    public String toString() {
        return "Student: " + name + ", Marks: " + marks;
    }

}
