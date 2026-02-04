package com.json.mergejson;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJSON {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();

        try {
            // Two sample JSON objects
            String json1 = "{ \"name\": \"Alice\", \"email\": \"alice@example.com\" }";
            String json2 = "{ \"age\": 22, \"city\": \"Delhi\" }";

            JsonNode node1 = mapper.readTree(json1);
            JsonNode node2 = mapper.readTree(json2);

            // Merging node2 into node1
            ObjectNode merged = ((ObjectNode) node1).setAll((ObjectNode) node2);

            // Printing merged JSON
            System.out.println("Merged JSON: " + mapper.writerWithDefaultPrettyPrinter().writeValueAsString(merged));

        } catch (Exception e) {
            e.printStackTrace();
        }


	}

}
