package com.optionalinterface;
import java.util.* ;

public class OptionalDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Input student details from user 
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student email (or press Enter if missing): ");
        String email = sc.nextLine();
        if (email.isEmpty()) email = null;
        System.out.print("Enter student phone (or press Enter if missing): ");
        String phone = sc.nextLine();
        if (phone.isEmpty()) phone = null;
        System.out.print("Enter student address (or press Enter if missing): ");
        String address = sc.nextLine();
        if (address.isEmpty()) address = null;
        System.out.print("Enter student nickname (or press Enter if missing): ");
        String nickname = sc.nextLine();
        if (nickname.isEmpty()) nickname = null;

        Student student = new Student(id, name, email, phone, address, nickname);

        // Safely fetch email
        System.out.println("\nEmail: " + student.email.orElse("Email not provided"));

        // Return default phone if missing
        System.out.println("Phone: " + student.phone.orElse("000-000-0000"));

        // Find student by ID (simulate search)
        Optional<Student> foundStudent = (student.id == id) ? Optional.of(student) : Optional.empty();
        System.out.println("Student Search Result: " + foundStudent.map(s -> s.name).orElse("Student not available"));

        // Safely fetch address
        System.out.println("Address: " + student.address.orElse("Address not provided"));

        // Return nickname if present, else real name
        System.out.println("Display Name: " + student.nickname.orElse(student.name));

        sc.close();



	}

}
