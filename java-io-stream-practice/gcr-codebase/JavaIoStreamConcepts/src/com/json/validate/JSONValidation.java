package com.json.validate;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Scanner;

public class JSONValidation {

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
            // Validate JSON syntax
            JsonNode root = mapper.readTree(jsonInput.toString());
            System.out.println(" JSON is valid!");

            // Extract only name & email
            for (JsonNode student : root) {
                String name = student.has("name") ? student.get("name").asText() : "N/A";
                String email = student.has("email") ? student.get("email").asText() : "N/A";
                System.out.println("Name: " + name + ", Email: " + email);
            }
        } catch (IOException e) {
            System.err.println(" Invalid JSON: " + e.getMessage());
        }



	}

}
