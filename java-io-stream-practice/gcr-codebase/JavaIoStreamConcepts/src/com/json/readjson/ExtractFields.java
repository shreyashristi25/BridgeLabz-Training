package com.json.readjson;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.* ;

public class ExtractFields {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ObjectMapper mapper = new ObjectMapper();

        System.out.println("Enter JSON array of students (e.g. [{\"name\":\"Alice\",\"email\":\"alice@example.com\"}]) :");
        String jsonInput = scanner.nextLine();

        try {
            // Parse JSON string into JsonNode
            JsonNode root = mapper.readTree(jsonInput);

            // Iterate and extract only name & email safely
            for (JsonNode student : root) {
                String name = student.has("name") ? student.get("name").asText() : "N/A";
                String email = student.has("email") ? student.get("email").asText() : "N/A";
                System.out.println("Name: " + name + ", Email: " + email);
            }
        } catch (IOException e) {
            System.err.println("Invalid JSON input: " + e.getMessage());
        }


	}

}
