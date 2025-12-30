package com.objectmodeling;

public class Composition {

	public static void main(String[] args) {
        // Create company, add departments and employees
        Company techCorp = new Company("TechCorp");
        Department devDept = techCorp.addDepartment("Development");
        Department hrDept = techCorp.addDepartment("Human Resources");

        devDept.addEmployee("Shreya", "Software Engineer");
        devDept.addEmployee("Arjun", "Senior Developer");
        hrDept.addEmployee("Meera", "HR Manager");

        // Display company structure, delete company and display again
        techCorp.displayCompany();

        techCorp.deleteCompany();

        techCorp.displayCompany();
    }

}
