package com.encapsulation;

//creating PartTimeEmployee as subclass of Employee class
public class PartTimeEmployee extends Employee{
	
	 	private int hoursWorked;
	    private double hourlyRate;

	    //constructor
	    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
	        super(employeeId, name, 0); // baseSalary not used here
	        this.hourlyRate = hourlyRate;
	        this.hoursWorked = hoursWorked;
	    }

	    // Getters and Setters
	    public int getHoursWorked() { return hoursWorked; }
	    public void setHoursWorked(int hoursWorked) { this.hoursWorked = hoursWorked; }

	    public double getHourlyRate() { return hourlyRate; }
	    public void setHourlyRate(double hourlyRate) { this.hourlyRate = hourlyRate; }

	    @Override
	    public double calculateSalary() {
	        return hourlyRate * hoursWorked;
	    }
}
