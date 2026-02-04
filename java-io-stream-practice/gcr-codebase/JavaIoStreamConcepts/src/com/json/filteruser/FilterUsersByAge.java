package com.json.filteruser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Scanner;

public class FilterUsersByAge {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ObjectMapper mapper = new ObjectMapper();

        System.out.println("Enter JSON array of users (end with ] on a new line):");

        // Read multi-line JSON input until user finishes with ]
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

            System.out.println(" Users older than 25:");
            for (JsonNode user : root) {
                if (user.has("age") && user.get("age").asInt() > 25) {
                    String name = user.has("name") ? user.get("name").asText() : "N/A";
                    String email = user.has("email") ? user.get("email").asText() : "N/A";
                    int age = user.get("age").asInt();
                    System.out.println("Name: " + name + ", Email: " + email + ", Age: " + age);
                }
            }
        } catch (IOException e) {
            System.err.println(" Invalid JSON: " + e.getMessage());
        }
    }


}
