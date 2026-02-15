package com.officesystem;
import java.util.* ;

public class OfficeSystem {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input employees from user 
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.print("Experience (years): ");
            int exp = sc.nextInt();
            sc.nextLine();
            employees.add(new Employee(name, salary, exp));
        }


        // Bonus calculation
        Bonus bonus = (salary) -> salary > 30000 ? salary * 0.10 : 0.0;
        System.out.println("\n--- Employee Bonuses ---");
        employees.forEach(e -> System.out.println(e.name + " Bonus: " + bonus.calculate(e.salary)));

        // Sort by salary
        System.out.println("\n--- Employees Sorted by Salary ---");
        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));
        employees.forEach(System.out::println);

        // Promotion eligibility
        Promotion promotion = (exp) -> exp > 3 ? "Eligible for Promotion" : "Not Eligible";
        System.out.println("\n--- Promotion Eligibility ---");
        employees.forEach(e -> System.out.println(e.name + ": " + promotion.check(e.experience)));

        // Print employee details
        System.out.println("\n--- Employee Details ---");
        employees.forEach(System.out::println);

        // Compare two employees’ salaries
        if (employees.size() >= 2) {
            CompareSalary compare = (emp1, emp2) ->
                emp1.salary > emp2.salary ? emp1.name + " has higher salary" :
                emp1.salary < emp2.salary ? emp2.name + " has higher salary" :
                "Both have equal salary";

            System.out.println("\n--- Salary Comparison ---");
            System.out.println(compare.compare(employees.get(0), employees.get(1)));
        }

        sc.close();
	
	}
}
