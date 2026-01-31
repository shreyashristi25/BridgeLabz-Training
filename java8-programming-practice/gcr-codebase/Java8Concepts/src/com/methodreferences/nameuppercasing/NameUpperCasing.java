package com.methodreferences.nameuppercasing;
import java.util.* ;

public class NameUpperCasing {

	//helper method to convert name to upper case 
	public static void printUpperCase(Employee  e) {
		System.out.println(e.name.toUpperCase()) ;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		List<Employee> employees = new ArrayList<>() ;
		
		//taking number of employees, their name and their ids as user input 
		System.out.println("Enter the number of employees : " ) ;
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n;i++) {
			System.out.println("Enter the name of the employee : ") ;
			String name = sc.nextLine() ;
			
			System.out.println("Enter employee id : ") ;
			String id = sc.nextLine() ;
			
			employees.add(new Employee(name, id)) ;
		}
		
		//displaying employee names in upper case 
		System.out.println("Employee names in upper case : ") ;
		employees.forEach(NameUpperCasing :: printUpperCase) ;
 
	}

}
