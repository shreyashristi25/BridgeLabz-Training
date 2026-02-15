package com.schoolsystem;

public class Student {

	String name;
    int rank;
    int age;
    int marks ;
    
    //constructor
    Student(String name, int rank, int age, int marks) {
        this.name = name;
        this.rank = rank;
        this.age = age;
        this.marks= marks ;
    }

    @Override
    public String toString() {
        return name + " - Rank: " + rank + " - Age: " + age;
    }

}
