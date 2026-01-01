package com.encapsulation;

//creating class FullTimeEmployeeWithDept as subclass of FullTimeEmployee and Department
public class PartTimeEmployeeWithDept extends PartTimeEmployee implements Department{

	private String department;

	//constructor
    public PartTimeEmployeeWithDept(int employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, hourlyRate, hoursWorked);
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}
