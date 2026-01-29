package com.csv.sortcsvfile;

public class Employee {

	String id, name, department;
    int salary;

    //constructor
    public Employee(String id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name +", Department: " + department + ", Salary: " + salary;
    }

}
