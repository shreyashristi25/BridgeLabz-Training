package com.encapsulation;

//creating class FullTimeEmployeeWithDept as subclass of FullTimeEmployee and Department
public class FullTimeEmployeeWithDept extends FullTimeEmployee implements Department{

	private String department;

	//constructor
    public FullTimeEmployeeWithDept(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
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
