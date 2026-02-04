package com.employee;
import java.util.* ;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		
		List<Employee> employees = List.of(

	            new Employee("E101", "Alice", 28, "Female", "HR", "2018", 45000),
	            new Employee("E102", "Bob", 32, "Male", "IT", "2016", 75000),
	            new Employee("E103", "Charlie", 25, "Male", "Finance", "2020", 50000),
	            new Employee("E104", "Diana", 30, "Female", "IT", "2017", 82000),
	            new Employee("E105", "Ethan", 35, "Male", "Sales", "2015", 60000),
	            new Employee("E106", "Fiona", 27, "Female", "HR", "2019", 47000),
	            new Employee("E107", "George", 40, "Male", "Management", "2012", 95000),
	            new Employee("E108", "Hannah", 29, "Female", "Finance", "2018", 52000),
	            new Employee("E109", "Ian", 31, "Male", "Sales", "2016", 61000),
	            new Employee("E110", "Julia", 26, "Female", "IT", "2021", 68000),
	            new Employee("E111", "Jia", 26, "Female", "ProductDevelopment", "2021", 68000),
	            new Employee("E112", "Joseph", 26, "Male", "ProductDevelopment", "2022", 60000)

	        );
		
		//1. How many male and female employees are there in the organization ?
		long female = employees.stream()
				.filter(e-> e.getGender().equalsIgnoreCase("female"))
				.count();
		
		long male = employees.stream()
				.filter(e-> e.getGender().equalsIgnoreCase("male"))
				.count();
		
		System.out.println("Number of male employees  : " +male) ;
		System.out.println("Number of male employees  : " +female) ;
		
		System.out.println() ;
		
		//2. printing all departments in the organization
		System.out.println("List of Departments in the organization : ") ;
		employees.stream().forEach(e-> System.out.println(e.getDepartment()));
		
		System.out.println() ;
		
		//3. What is the average age of male and female employees ?
		double avgAgeFemale = employees.stream()
				.filter(e-> e.getGender().equalsIgnoreCase("female"))
				.collect(Collectors.averagingInt(Employee :: getAge)) ;
		
		System.out.println("Average age of female employees : " +avgAgeFemale) ;
		System.out.println() ;
		double avgAgeMale = employees.stream()
				.filter(e -> e.getGender().equalsIgnoreCase("male"))
				.collect(Collectors.averagingDouble(Employee :: getAge)) ;
	
		System.out.println("Average age of male employees : " +avgAgeMale) ;
		System.out.println() ;
		
		//. Get the details of highest paid employee in the organization ?
		
		Optional<Employee> highestPaid = employees.stream()
				.max((a, b)-> Double.compare(a.getSalary(), b.getSalary()))  ;
		
		System.out.println("Employee details of employee with highest Salary : ");
		if(highestPaid.isPresent()) {
			System.out.println(highestPaid.get()) ;
		}
		System.out.println() ;
		
		//5. Get the names of all employees who have joined after 2015 ?
		System.out.println("List of employees who joined after 2015 : ") ;
		List<Employee> joinedLate = employees.stream()
				.filter(x-> Integer.parseInt(x.getYearOfJoining()) > 2015)
				.collect(Collectors.toList()) ;
		
		joinedLate.forEach(e-> System.out.println(e.getName()));
		System.out.println() ;
		
		//6. Count the number of employees in each department ?
		Map<String, Long> employeePerDepartment =  employees.stream()
				.collect(Collectors.groupingBy(Employee :: getDepartment, Collectors.counting()) );
		System.out.println("Number of employees in each department : ") ;
		employeePerDepartment.forEach((dept, count)-> System.out.println(dept +" : " +count));
		System.out.println() ;
		
		//7. What is the average salary of each department ?
		Map<String, Double> avgSalaryPerDepartment = employees.stream()
				.collect(Collectors.groupingBy(Employee :: getDepartment,
						Collectors.averagingDouble(Employee :: getSalary)
				));
		
		System.out.println("Average salary per department  : ") ;
		avgSalaryPerDepartment.forEach((a, b) -> System.out.println(a +" : " +b)) ;
		System.out.println() ;
		
		//8. Get the details of youngest male employee in the product development department ?
		Optional<Employee> youngest = employees.stream()
				.filter(e-> e.getDepartment().equalsIgnoreCase("productdevelopment") && e.getGender().equalsIgnoreCase("male"))
				.min((a, b) -> Integer.compare(a.getAge(), b.getAge())) ;
		if(youngest.isPresent()) {
			System.out.println("Youngest employee in Product Development department : " +youngest.get()) ;
		}
		System.out.println() ;
		
		//9. Who has the most working experience in the organization?
		Optional<Employee> mostExperienced = employees.stream()
				.min((a, b)->a.getYearOfJoining().compareTo(b.getYearOfJoining())) ;
		if(mostExperienced.isPresent()) {
			System.out.println("Most experienced employee : " +mostExperienced.get()) ;
		}
		System.out.println() ;
		
		//10. How many male and female employees are there in the Sales team?
		long maleSales = employees.stream()
				.filter(e-> e.getDepartment().equalsIgnoreCase("sales")&& e.getGender().equalsIgnoreCase("male"))
				.count();
		
		long femaleSales = employees.stream()
				.filter(e-> e.getDepartment().equalsIgnoreCase("sales")&&e.getGender().equalsIgnoreCase("female"))
				.count();
		
		
		System.out.println("Number of males in Sales department : " +maleSales) ;
		System.out.println("Number of females in Sales department : " +femaleSales) ;
		System.out.println() ;
		
		//11. What is the average salary of male and female employees ?
		Map<String, Double> avgSalaryGender = employees.stream()
		                 .collect(Collectors.groupingBy(Employee::getGender,
		                         Collectors.averagingDouble(Employee::getSalary)
		));
		
		avgSalaryGender.forEach((gender, avgSalary) ->
			System.out.println(gender + " -> " + avgSalary));

		System.out.println() ;
		
		
		//12. List down the names of all employees in each department ?
		System.out.println("Names of employees in the organization : ") ;		
		employees.stream().forEach(e-> System.out.println( e.getName()));
		
		System.out.println() ;
		
		//13. What is the average salary and total salary of the whole organization?
		double avgSalary = employees.stream().collect(Collectors.averagingDouble(Employee :: getSalary)) ;
		double totalSalary = employees.stream().mapToDouble(Employee :: getSalary).sum() ;
		
		System.out.println("Average Salary of employees in the organization  : " +avgSalary) ;
		System.out.println("Total Salary of the whole organization  : " +totalSalary ) ;
		System.out.println() ;
		
		
		//14. Get the employee whose salary are more than 25k.
		List<Employee> salaryGreater = employees.stream()
				.filter(e-> (e.getSalary() > 25000))
				.collect(Collectors.toList()) ;
		System.out.println("List of employees whose salary is greater than 25k : ") ;
		salaryGreater.forEach(System.out :: println) ;
		System.out.println() ;
		
		
		//15.Who is the highest paid employee in the organization?
		
		Optional<Employee> highestPaidEmp = employees.stream().max((a, b) -> Double.compare(a.getSalary(), b.getSalary())) ;
		if(highestPaidEmp.isPresent() ) {
			System.out.println("Highest paid employee of the organixzation : " +highestPaidEmp.get()) ;
		}
		System.out.println() ;
		
		
		//16.Who is the second highest paid employee in the organization?
		Optional<Employee> secondHighestSalary = employees.stream()
				.sorted(Comparator.comparing(Employee :: getSalary).reversed())
				.skip(1)
				.findFirst() ;
		if(secondHighestSalary.isPresent()) {
			System.out.println("Employee with second highest salary : " +secondHighestSalary.get()) ;
		}
		System.out.println() ;
		
		
		//17.Who is the third highest paid employee in the organization?
		Optional<Employee> thirdHighestSalary = employees.stream()
				.sorted(Comparator.comparing(Employee :: getSalary).reversed())
				.skip(2)
				.findFirst() ;
		if(thirdHighestSalary.isPresent()) {
			System.out.println("Employee with third highest salary : " +thirdHighestSalary.get()) ;
		} 
		System.out.println() ;
		
		
		//18.Who is the lowest paid employee in the organization?
		Optional<Employee> lowestSalary = employees.stream()
				.min((a, b)-> Double.compare(a.getSalary(), b.getSalary())) ;
		if(lowestSalary.isPresent()) {
			System.out.println("Employee with lowest salary : " +lowestSalary.get()) ;
		} 
		System.out.println() ;
		
		
		//19.Who is the second lowest paid employee in the organization?
		Optional<Employee> secondLowestSalary = employees.stream()
				.sorted(Comparator.comparing(Employee :: getSalary))
				.skip(1)
				.findFirst() ;
		if(secondLowestSalary.isPresent()) {
			System.out.println("Employee with second lowest salary : " +secondLowestSalary.get()) ;
		}
		System.out.println() ;
		
		
		//20.Get the first five lowest paid employee in the organization?
		List<Employee> firstFiveLowestSalary = employees.stream()
				.sorted(Comparator.comparing(Employee :: getSalary))
				.limit(5)
				.collect(Collectors.toList());
		System.out.println("Five lowest paid emplyees : ") ;
		firstFiveLowestSalary.forEach(System.out :: println);
		System.out.println() ;
		
		
		//21.Get the first five highest paid employee in the organization?
		List<Employee> firstFiveHighestSalary = employees.stream()
				.sorted(Comparator.comparing(Employee :: getSalary).reversed())
				.limit(5)
				.collect(Collectors.toList());
		System.out.println("Five highest paid emplyees : ") ;
		firstFiveHighestSalary.forEach(System.out :: println);
		
				
	}

}
