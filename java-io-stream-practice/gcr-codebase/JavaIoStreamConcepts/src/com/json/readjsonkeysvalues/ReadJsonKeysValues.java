package com.json.readjsonkeysvalues;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.util.*;


public class ReadJsonKeysValues {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ObjectMapper mapper = new ObjectMapper();

        System.out.println("Enter JSON (end with ] or } on a new line):");

        // Read multi-line JSON input until user finishes with ] or }
        StringBuilder jsonInput = new StringBuilder();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            jsonInput.append(line.trim());
            if (line.trim().endsWith("]") || line.trim().endsWith("}")) {
                break;
            }
        }

        try {
            // Parse JSON
            JsonNode root = mapper.readTree(jsonInput.toString());

            System.out.println(" Parsed JSON. Keys and values:");
            printJson(root, "");
        } catch (IOException e) {
            System.err.println(" Invalid JSON: " + e.getMessage());
        }
    }

	// Recursive method to handle nested objects/arrays
    private static void printJson(JsonNode node, String prefix) {
        if (node.isObject()) {
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> entry = fields.next();
                printJson(entry.getValue(), prefix + entry.getKey() + ": ");
            }
        }
        else if (node.isArray()) {
            for (JsonNode element : node) {
                printJson(element, prefix);
            }
        }
        else {
            
            System.out.println(prefix + node.asText());
        }


	}

}
