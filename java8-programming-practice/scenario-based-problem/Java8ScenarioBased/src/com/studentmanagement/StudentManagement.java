package com.studentmanagement;
import java.util.* ;
import java.util.stream.Collectors;

public class StudentManagement {

	public static void main(String[] args) {
		List<Student> students = List.of(

					    new Student("Sharma", "S101", "Amit", 21, "Male", "Delhi", "CSE", 5, 9876543210L),
					    new Student("Verma", "S102", "Neha", 22, "Female", "Mumbai", "IT", 12, 9123456789L),
					    new Student("Patel", "S103", "Rahul", 20, "Male", "Ahmedabad", "Mechanical", 8, 9988776655L),
					    new Student("Iyer", "S104", "Sneha", 23, "Female", "Chennai", "CSE", 3, 9876601234L),
					    new Student("Singh", "S105", "Arjun", 21, "Male", "Lucknow", "Civil", 15, 9001122334L),
					    new Student("Das", "S106", "Riya", 22, "Female", "Kolkata", "Electrical", 7, 8899776655L),
					    new Student("Mehta", "S107", "Karan", 24, "Male", "Jaipur", "IT", 20, 7766554433L),
					    new Student("Nair", "S108", "Ananya", 21, "Female", "Kochi", "CSE", 4, 9988001122L),
					    new Student("Yadav", "S109", "Pooja", 23, "Female", "Bhopal", "Mechanical", 55, 8899001122L),
					    new Student("Khan", "S110", "Imran", 22, "Male", "Hyderabad", "Civil", 68, 8877665544L),
					    new Student("Gupta", "S111", "Sakshi", 24, "Female", "Indore", "IT", 75, 9988771122L),
					    new Student("Reddy", "S112", "Vikram", 21, "Male", "Bangalore", "CSE", 90, 7766112233L),
					    new Student("Chatterjee", "S113", "Ankit", 23, "Male", "Kolkata", "Electrical", 60, 6655443322L),
					    new Student("Joshi", "S114", "Meera", 22, "Female", "Pune", "Civil", 82, 9988112233L)

					);
		
		//printing all students whose rank is less than 50
		
		System.out.println("List of students whose rank is less than 50 : ") ;
		students.stream().filter(e-> (e.getRank() < 50)).forEach(System.out :: println) ;
		System.out.println();
		
		//Print all students whose age is greater than 25
		System.out.println("List of students whose age is less than 25 : ") ;
		students.stream().filter(e-> e.getAge() < 25).forEach(System.out :: println) ;
		System.out.println();
		
		//Print the names of all students only
		System.out.println("List of Students (names only): ") ;
		students.stream().forEach(e-> System.out.println(e.getFirstName()));
		System.out.println();
		
		//Print all students belonging to Mechanical Engineering.
		System.out.println("List of students belonging to Mechanical Department : ") ;
		students.stream()
		.filter(e-> e.getDepartment().equalsIgnoreCase("mechanical"))
		.forEach(System.out :: println);
		System.out.println();
		
		
		//Print all students not from Mumbai
		System.out.println("List of students not belonging to mumbai : ") ;
		students.stream()
		.filter(e-> !(e.getCity().equalsIgnoreCase("mumbai")))
		.forEach(System.out :: println);
		System.out.println();
		
		//Sort students by rank (ascending)
		System.out.println("List of students by rank(ascending) : ") ;
		List<Student> sorted = students.stream()
				.sorted(Comparator.comparing(Student :: getRank))
				.collect(Collectors.toList());
		
		sorted.forEach(System.out :: println);
		System.out.println() ;
		
		
		//Sort students by age (descending)
		System.out.println("List of students sorted by age(descending) : ") ;
		students.stream()
		.sorted(Comparator.comparing(Student :: getAge).reversed())
		.forEach(System.out :: println);
		System.out.println();
		
		
		//Print top 5 students based on rank
		System.out.println("Top 5 students based on their rank : ") ;
		students.stream()
		.sorted(Comparator.comparing(Student :: getRank).reversed())
		.limit(5)
		.forEach(System.out :: println);
		
		System.out.println();
		
		
		//Print last 3 students based on rank
		System.out.println("Last 3 students based on rank : ") ;
		students.stream()
		.sorted(Comparator.comparing(Student :: getRank))
		.limit(3)
		.forEach(System.out :: println);
		
		System.out.println();
		
		//Print students sorted by name and then rank
		System.out.println("List of students sorted by their first names : ") ;
		students.stream()
		.sorted(Comparator.comparing(Student :: getFirstName))
		.forEach(System.out :: println);
		System.out.println();
		
		System.out.println("List of students sorted by their rank : ") ;
		students.stream()
		.sorted(Comparator.comparing(Student :: getRank))
		.forEach(System.out :: println);
		System.out.println();
		
		
		//Count the number of students in each department

		Map<String, Long> studentsPerDepartment  = students.stream().collect(Collectors.groupingBy(Student :: getDepartment, Collectors.counting()));
		
		System.out.println("Number of students per department : ") ;
		studentsPerDepartment.forEach((department, count) ->
        System.out.println(department + " -> " + count));
		System.out.println();
		
		//Count the number of students in each city
		Map<String, Long> studentsPerCity  = students.stream().collect(Collectors.groupingBy(Student :: getCity, Collectors.counting()));
		
		System.out.println("Number of students per city : ") ;
		studentsPerCity.forEach((city, count) ->
        System.out.println(city + " -> " + count));
		System.out.println();
		
		//Find the average age of students in each department
		
		System.out.println("Average Age of Students in each department  : ") ;
		Map<String, Double > avgAgePerDepartment = students.stream().collect(Collectors.groupingBy(Student :: getDepartment, Collectors.averagingDouble(Student :: getAge)) );
		
		avgAgePerDepartment.forEach((department, avg)-> System.out.println(department +" -> " +avg));
		System.out.println() ;
		
		//Find the average rank of students by gender
		System.out.println("Average rank of Students by gender  : ") ;
		Map<String, Double > avgAgeGender = students.stream().collect(Collectors.groupingBy(Student :: getGender, Collectors.averagingDouble(Student :: getRank)) );
		
		avgAgeGender.forEach((gender, avg)-> System.out.println(gender +" -> " +avg));
		System.out.println();
		
		//Find the total number of students in the organization
		
		long total = students.stream().count() ;
		System.out.println("Number of students in the organization : " +total) ;

		System.out.println();
		
		//Find the department with the highest average rank
		Map<String , Double> avgRanks = students.stream().collect(Collectors.groupingBy(Student :: getDepartment, Collectors.averagingDouble(Student :: getRank))) ;
		
		String topDepartments = avgRanks.entrySet().stream()
				.max(Map.Entry.comparingByValue())
				.get()
				.getKey() ;
		
		System.out.println("Department with highest average rank: " + topDepartments);
		System.out.println();
		
		//Find the student with the best (lowest) rank
		Optional<Student> bestRank = students.stream().min((a, b) -> Integer.compare(a.getRank(), b.getRank())) ;
		if(bestRank.isPresent()) {
			System.out.println("Student with best rank : " +bestRank.get()) ;
		}
		System.out.println();
		
		//Find the student with the worst (highest) rank.
		Optional<Student> worstRank = students.stream().max((a, b) -> Integer.compare(a.getRank(), b.getRank()));
		if(worstRank.isPresent()) {
			System.out.println("Student with worst rank : "+worstRank.get()) ;
		}
		
		System.out.println();
		
		//Find the second best rank holder.
		students.stream().sorted(Comparator.comparing(Student :: getRank)).skip(1).limit(1).forEach(System.out :: println) ;
		System.out.println();
		
		//Find the third best rank holder
		students.stream().sorted(Comparator.comparing(Student :: getRank)).skip(2).limit(1).forEach(System.out :: println) ;
		System.out.println();
		
		//Find the youngest student.
		Optional<Student> youngest = students.stream().min((a, b) -> Integer.compare(a.getAge(), b.getAge()) ) ;
		if(youngest.isPresent()) {
			System.out.println("Youngest Student : " +youngest.get()) ;
		}
		System.out.println();
		
		//Find the oldest student
		Optional<Student> oldest = students.stream().max((a, b) -> Integer.compare(a.getAge(), b.getAge())) ;
		if(youngest.isPresent()) {
			System.out.println("Oldest Student : " +oldest) ;
		}
		System.out.println() ;
		
		//Print all contact numbers of all students
		students.stream()
        .flatMap(student -> student.getContacts().stream()) 
        .forEach(System.out::println);
		System.out.println() ;
		
		//Count the total number of contact numbers.
		long count = students.stream()
		        .flatMap(s -> s.getContacts().stream())
		        .count();
		System.out.println("Total contact numbers: " + count);
		System.out.println();
		
		//Find students with more than one contact
		students.stream()
        .filter(s -> s.getContacts().size() > 1)
        .map(Student::getName)
        .forEach(System.out::println);
		System.out.println();
		
		//Print unique contact numbers
		students.stream()
        .flatMap(s -> s.getContacts().stream())
        .distinct()
        .forEach(System.out::println);
		System.out.println();
		
		//Check if any student belongs to Biotech Engineering.
		boolean hasBiotech = students.stream().anyMatch(s-> "Biotech".equalsIgnoreCase(s.getDepartment()) ) ;
		if (hasBiotech) {
		    System.out.println("There is at least one student in Biotech Engineering.");
		} else {
		    System.out.println("No student belongs to Biotech Engineering.");
		}
		
		System.out.println();
		
		//Check if all students are above age 20.
		
		boolean aboveTwenty = students.stream().allMatch(s->s.getAge()> 20) ;
		if(aboveTwenty) {
			System.out.println("All students are above 20.") ;
		}
		else {
			System.out.println("Not all students are above 20.") ;
		}
		System.out.println() ;
		
		//Check if no student belongs to Civil Engineering.
		boolean hasCivil = students.stream().anyMatch(s-> "Civil Engineering".equalsIgnoreCase(s.getDepartment()) ) ;
		if (hasBiotech) {
		    System.out.println("There is at least one student in Civil Engineering.");
		} else {
		    System.out.println("No student belongs to Civil Engineering.");
		}
		
		System.out.println();
		
		
		//Count male and female students.
		Map<String, Long> genderCount= students.stream()
				.collect(Collectors.groupingBy(Student :: getGender, Collectors.counting()));
		System.out.println(genderCount) ;
		
		System.out.println();
		
		//Find the average age of male students.
		double avgMaleAge = students.stream()
				.filter(e->e.getGender().equalsIgnoreCase("male"))
				.collect(Collectors.averagingDouble(s->s.getAge())) ;
		System.out.println("Average age of male students : " +avgMaleAge) ;
		System.out.println();
		
		//Find the average age of female students.
		double avgFemaleAge = students.stream()
				.filter(e->e.getGender().equalsIgnoreCase("female"))
				.collect(Collectors.averagingDouble(s->s.getAge())) ;
		System.out.println(" Average age of female students : "+avgFemaleAge) ;
		System.out.println();
		
		
		//Find the highest ranked male and female student.
		Optional<Student> maxRank= students.stream().filter(e-> e.getGender().equalsIgnoreCase("male")).max((a, b) -> Integer.compare(a.getAge(), b.getAge()));
		if(maxRank.isPresent()) {
			System.out.println("Male student with highest rank  : "  + maxRank.get()) ;
			
		}
		System.out.println();
		
		Optional<Student> maxRankFemale= students.stream().filter(e-> e.getGender().equalsIgnoreCase("female")).max((a, b) -> Integer.compare(a.getAge(), b.getAge()));
		if(maxRankFemale.isPresent()) {
			System.out.println("Female student with highest rank  : "  + maxRankFemale.get()) ;	
		}
		System.out.println();
		
		//List students department-wise with names only.
		
		students.stream()
		.collect(Collectors.groupingBy(Student :: getDepartment))
		.forEach((dept, list) -> {
            System.out.println("\nDepartment: " + dept);
            list.forEach(s -> System.out.println(s.getName()));
        });
		System.out.println();
		
		//Find the youngest student in Computer Engineering.
		
		Optional <Student> youngestCSEStudent= students.stream()
				.filter(s-> s.getDepartment().equalsIgnoreCase("cse"))
				.min((a, b)-> Integer.compare(a.getAge(), b.getAge()));
		if(youngestCSEStudent.isPresent()) {
			System.out.println("Youngest Computer Engineering student : " +youngestCSEStudent.get()) ;
		}
		
		System.out.println();
		
		//.Find the top-ranked student in Mechanical Engineering.
		
		Optional<Student> topMechanical = students.stream()
				.filter(s-> s.getDepartment().equalsIgnoreCase("mechanical"))
				.max(Comparator.comparingInt(Student :: getRank)) ;
		
		if(topMechanical.isPresent()) {
			System.out.println("Top Ranked mechanical engineering student : " +topMechanical.get()) ;
		}
		System.out.println();
		
		
		//Count students in Electronics Engineering from Karnataka.
		long countElectronics = students.stream()
				.filter(s-> s.getDepartment().equalsIgnoreCase("eclectornics"))
				.filter(s-> s.getCity().equalsIgnoreCase("karnataka"))
				.count() ;
		System.out.println("Students in Electronics engineeirng from karnataka : "+countElectronics) ;
		
		System.out.println();
		
		
		//Convert the student list into a Map<Id, Name>
		Map<String, String> idNameMap= students.stream()
				.collect(Collectors.toMap(Student :: getId, Student :: getName));
		System.out.println(idNameMap) ;
		
		System.out.println();
		
		
		//Convert the student list into a Map<Department, List<Student>>.
		Map<String, List<Student>> deptMap = students.stream()
				.collect(Collectors.groupingBy(Student :: getDepartment)) ;
		System.out.println(deptMap) ;
		
		System.out.println();
		
		
		//Find students whose name starts with S
		System.out.println("Students whose name starts with 'S' : " ) ;
		students.stream()
		.filter(s-> s.getFirstName().startsWith("S"))
		.forEach(System.out :: println) ;
		
		System.out.println();
		
		
		//Find students whose name length is greater than 5
	
		System.out.println("Students whose name length is greater than 5  :") ;
		students.stream()
		.filter(s->s.getName().length() > 5)
		.forEach(System.out :: println);
		
		System.out.println();
		
		
		//Find students whose rank is even
		
		System.out.println("Students whose rank is even : ");
		students.stream()
				.filter(s->s.getRank() %2 ==0)
				.forEach(System.out :: println);	
		
		System.out.println();
		
		
		//Find students whose rank is odd
		
		System.out.println("Students whose rank is odd : ");
		students.stream()
				.filter(s->s.getRank() %2 ==1)
				.forEach(System.out :: println);
		
		System.out.println();
		
		
		//Find the top 3 youngest students
		
		List<Student> youngestThree = students.stream()
				.sorted(Comparator.comparingInt(Student :: getAge))
				.limit(3)
				.toList() ;
		
		youngestThree.forEach(s->System.out.println(s.getName() + " - " +s.getAge()));
	
		System.out.println();
		
		
		//.Find the top 3 oldest students
		
		System.out.println("The top 3 oldest students  : ") ;
		students.stream()
		.sorted(Comparator.comparingInt(Student :: getAge).reversed())
		.limit(3)
		.forEach(s -> System.out.println(s.getName() + " - " + s.getAge()));
	
		System.out.println();
		
		
		//Partition students based on age > 25.
		Map<Boolean, List<Student>> partitionedStudents =
		        students.stream()
		                .collect(Collectors.partitioningBy(s -> s.getAge() > 25));
		System.out.println(partitionedStudents);
		
		System.out.println();
		
		
		//Partition students based on rank < 100.
		Map<Boolean, List<Student>> partitionByRank = students.stream().collect(Collectors.partitioningBy(s->s.getRank() <100)) ;
		System.out.println(partitionByRank);
		
		System.out.println();
		
		
		//Find the city having maximum students.
		Optional<Map.Entry<String, Long>> cityWithMaxStudents =
		        students.stream()
		                .collect(Collectors.groupingBy(Student::getCity, Collectors.counting()))
		                .entrySet()
		                .stream()
		                .max(Map.Entry.comparingByValue());

		cityWithMaxStudents.ifPresent(entry ->
		        System.out.println("City with maximum students: "
		                + entry.getKey() + " (" + entry.getValue() + ")"));

		System.out.println();
		
		
		//Find the department having minimum students.
		
		Optional<Map.Entry<String, Long>> minDept =
		        students.stream()
		                .collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()))
		                .entrySet()
		                .stream()
		                .min(Map.Entry.comparingByValue());

		minDept.ifPresent(entry ->
		        System.out.println("Department with minimum students: "
		                + entry.getKey() + " (" + entry.getValue() + ")"));

	}

}
