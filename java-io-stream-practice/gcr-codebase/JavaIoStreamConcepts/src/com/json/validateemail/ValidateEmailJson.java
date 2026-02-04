package com.json.validateemail;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.ValidationMessage;

import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class ValidateEmailJson {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ObjectMapper mapper = new ObjectMapper();

        // JSON Schema requiring "email" field with proper format
        String schemaStr = "{"
                + "\"type\":\"object\","
                + "\"properties\":{"
                + "   \"name\":{\"type\":\"string\"},"
                + "   \"email\":{\"type\":\"string\",\"format\":\"email\"}"
                + "},"
                + "\"required\":[\"email\"]"
                + "}";

        System.out.println("Enter JSON object (e.g. {\"name\":\"Alice\",\"email\":\"alice@example.com\"}):");
        String jsonInput = scanner.nextLine();

        try {
            // Parse schema and input
            JsonNode schemaNode = mapper.readTree(schemaStr);
            JsonNode jsonNode = mapper.readTree(jsonInput);

            JsonSchema schema = JsonSchemaFactory.getInstance().getSchema(schemaNode);
            Set<ValidationMessage> errors = schema.validate(jsonNode);

            if (errors.isEmpty()) {
                System.out.println(" JSON is valid. Email field is correctly formatted.");
            } else {
                System.out.println(" Validation errors:");
                errors.forEach(err -> System.out.println(err.getMessage()));
            }
        } catch (IOException e) {
            System.err.println(" Invalid JSON input: " + e.getMessage());
        }

	}

}
