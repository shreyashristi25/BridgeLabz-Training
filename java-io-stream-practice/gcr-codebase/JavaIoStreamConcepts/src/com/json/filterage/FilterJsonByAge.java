package com.json.filterage;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Scanner;

public class FilterJsonByAge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ObjectMapper mapper = new ObjectMapper();

        System.out.println("Enter JSON array of students (end with ] on a new line):");

        // Read multi-line JSON input until user finishes with ']'
        StringBuilder jsonInput = new StringBuilder();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            jsonInput.append(line.trim());
            if (line.trim().endsWith("]")) {
                break;
            }
        }

        try {
            // Parse JSON
            JsonNode root = mapper.readTree(jsonInput.toString());

            System.out.println(" Records with age > 25:");
            for (JsonNode student : root) {
                if (student.has("age") && student.get("age").asInt() > 25) {
                    String name = student.has("name") ? student.get("name").asText() : "N/A";
                    String email = student.has("email") ? student.get("email").asText() : "N/A";
                    int age = student.get("age").asInt();
                    System.out.println("Name: " + name + ", Email: " + email + ", Age: " + age);
                }
            }
        } catch (IOException e) {
            System.err.println(" Invalid JSON: " + e.getMessage());
        }


	}

}
