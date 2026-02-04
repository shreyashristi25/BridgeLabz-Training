package com.json.listtojsonarray;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;
public class ListToArray {

	public static void main(String[] args) {
		try {
            // Create a list of Student objects
            List<Student> students = Arrays.asList(
                new Student("Alice", "alice@example.com"),
                new Student("Bob", "bob@example.com"),
                new Student("Charlie", "charlie@example.com")
            );

            // Convert list to JSON array
            ObjectMapper mapper = new ObjectMapper();
            String jsonArray = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(students);

            // Print JSON array
            System.out.println(jsonArray);
        } catch (Exception e) {
            e.printStackTrace();
        }


	}

}
