package com.collections.map.groupbyproperty;
import java.util.* ;

public class GroupByDepartment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking input for number of employees, and their details
		List<Employee> employees = new ArrayList<>() ;
		int n = sc.nextInt() ;
		sc.nextLine() ;
		
		for( int i =0; i < n; i ++) {
			System.out.println("Enter employee name : ") ;
			String name = sc.nextLine();
			
			System.out.println("Enter department name : ") ;
			String dept = sc.nextLine( ) ;
			
			employees.add(new Employee(name, dept)) ;
		}
		
		//grouping employees by their department and displaying result
		Map<String, List<Employee>> groupedByDept = new HashMap<>();
        for (Employee emp : employees) {
            groupedByDept.computeIfAbsent(emp.getDepartment(), k -> new ArrayList<>()).add(emp);
        }

        System.out.println("Grouped Employees by Department:");
        for (Map.Entry<String, List<Employee>> entry : groupedByDept.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        sc.close();

	}

}
