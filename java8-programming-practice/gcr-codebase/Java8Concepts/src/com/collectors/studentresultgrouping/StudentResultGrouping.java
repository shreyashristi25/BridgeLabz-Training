package com.collectors.studentresultgrouping;
import java.util.* ;
import java.util.stream.Collectors;

public class StudentResultGrouping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking number of students, their names and grade level as user input 
		List<Student> students = new ArrayList<> () ;
		System.out.println("Enter number od students : ") ;
		int n = sc.nextInt() ;
		sc.nextLine() ;
		
		for( int i =0; i < n; i++) {
			System.out.println("Enter name of student "+ (i+1) +" : ") ;
			String name = sc.nextLine() ;
			System.out.println("Enter student's grade level : ") ;
			String gradeLevel = sc.nextLine() ;
			
			students.add(new Student(name, gradeLevel)) ;
		}
		
		//grouping students by grade level and collecting names
		Map<String, List<String>> groupedByGrade = students.stream()
	            .collect(Collectors.groupingBy( Student::getGradeLevel,                
	                Collectors.mapping(Student::getName, Collectors.toList())
	            ));

		//displaying result
		System.out.println("Students with their grade levels : ") ;
		groupedByGrade.forEach((grade, names) -> {
            System.out.println(grade + " -> " + names);
        });
	}

}
