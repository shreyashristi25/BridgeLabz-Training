package com.collectors.employeesalarycategorization;
import java.util.* ;
import java.util.stream.Collectors;


public class EmployeeSalaryCategorization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking number of employees and their details as user input 
		List<Employee> employees = new ArrayList<>() ;
		System.out.println("Enter the number of Employees : ") ;
		int n = sc.nextInt();
		sc.nextLine() ;
		
		for( int i =0; i < n; i ++) {
			System.out.println("Enter details for employee " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Department: ");
            String department = sc.nextLine();
            
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            employees.add(new Employee(name, department, salary));

		}
		
		//grouping employees by department and calculating average salary for each department.
		Map<String, Double> avgSalaryByDept = employees.stream()
	            .collect(Collectors.groupingBy(
	                Employee::getDepartment,
	                Collectors.averagingDouble(Employee::getSalary)
	            ));

		System.out.println("\nAverage Salary by Department:");
		avgSalaryByDept.forEach((dept, avgSalary) ->
		System.out.println(dept + " -> " + avgSalary)
		);

		sc.close();

	}

}
