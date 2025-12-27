package com.constructor.level1;

//creating a driver class for Employee class
public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee employee = new Employee(101, "HR", 40000.0);
        employee.displayEmployeeDetails();

        employee.updateSalary(45000.0);
        employee.displayEmployeeDetails();

        Manager manager = new Manager(201, "IT", 80000.0, "Development Team");
        manager.displayManagerDetails();

	}

}
