package com.objectmodeling;
import java.util.ArrayList;

public class Department {

	private String name;
    private ArrayList<Employee> employees;

    // Constructor for Department class 
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // methods to Add employee to department and display department details
    public void addEmployee(String empName, String role) {
        Employee emp = new Employee(empName, role);
        employees.add(emp);
    }

    public void displayDepartment() {
        System.out.println("Department: " + name);
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
        System.out.println();
    }

}
