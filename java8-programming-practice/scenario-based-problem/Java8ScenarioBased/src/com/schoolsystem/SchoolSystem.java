package com.schoolsystem;
import java.util.* ;

public class SchoolSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        //Welcome message using lambda
        Welcome welcome = (studentName) -> System.out.println("Welcome, " + studentName + "!");

        System.out.print("Enter student name for welcome message: ");
        String studentName = sc.nextLine();
        welcome.message(studentName);

        // Pass/Fail check using lambda
        Result result = (marks) -> marks >= 40 ? "Pass" : "Fail";
        System.out.print("Enter marks to check Pass/Fail: ");
        int marks = sc.nextInt();
        System.out.println("Result: " + result.check(marks));

        //Taking student list from user 
        System.out.print("\nEnter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Rank: ");
            int rank = sc.nextInt();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Marks: ");
            int m = sc.nextInt();
            sc.nextLine(); 
            students.add(new Student(name, rank, age, m));
        }

        //Sort by name
        System.out.println("\n--- Sort by Name ---");
        students.sort((s1, s2) -> s1.name.compareTo(s2.name));
        students.forEach(System.out::println);

        // Sort by rank
        System.out.println("\n--- Sort by Rank ---");
        students.sort((s1, s2) -> Integer.compare(s1.rank, s2.rank));
        students.forEach(System.out::println);

        //Display students with age > 18
        System.out.println("\n--- Students with Age > 18 ---");
        students.stream()
                .filter(s -> s.age > 18)
                .forEach(System.out::println);

        sc.close();


	}

}
