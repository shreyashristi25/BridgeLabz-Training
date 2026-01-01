package com.encapsulation;

//creating FullTimeEmployee as subclass of Employee class 
public class FullTimeEmployee extends Employee{
	
	//constructor
	public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary(); 
    }
}
