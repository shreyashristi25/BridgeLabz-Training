package com.json.listtojasonarray;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class ListToJSONArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.print("How many students do you want to enter? ");
        int count = scanner.nextInt();
        scanner.nextLine(); 

        // Take user input for each student
        for (int i = 0; i < count; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 

            students.add(new Student(name, email, age));
        }

        try {
            // Convert list to JSON array
            ObjectMapper mapper = new ObjectMapper();
            String jsonArray = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(students);

            System.out.println("\n✅ JSON Array:");
            System.out.println(jsonArray);
        } catch (Exception e) {
            e.printStackTrace();
        }


	}

}
