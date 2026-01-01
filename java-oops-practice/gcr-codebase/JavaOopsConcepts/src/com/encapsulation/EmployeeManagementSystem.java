package com.encapsulation;
import java.util.* ;
public class EmployeeManagementSystem {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

        FullTimeEmployeeWithDept e1 = new FullTimeEmployeeWithDept(101, "Alice", 50000);
        e1.assignDepartment("HR");

        PartTimeEmployeeWithDept e2 = new PartTimeEmployeeWithDept(102, "Bob", 500, 40);
        e2.assignDepartment("IT");

        employees.add(e1);
        employees.add(e2);

        // Polymorphism: process employees via Employee reference
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Calculated Salary: " + emp.calculateSalary());

            if (emp instanceof Department) {
                Department dept = (Department) emp;
                System.out.println(dept.getDepartmentDetails());
            }
            System.out.println("----------------------");
        }

	}

}
