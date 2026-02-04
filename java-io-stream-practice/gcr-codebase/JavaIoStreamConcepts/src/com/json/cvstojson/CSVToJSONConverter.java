package com.json.cvstojson;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.*;

public class CSVToJSONConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter CSV data (end with an empty line):");

        // Reading multiple lines until empty line
        List<String> lines = new ArrayList<>();
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
            lines.add(line);
        }

        if (lines.isEmpty()) {
            System.out.println("No CSV data entered.");
            return;
        }

        // Extracting headers
        String[] headers = lines.get(0).split(",");

        JSONArray jsonArray = new JSONArray();
        for (int i = 1; i < lines.size(); i++) {
            String[] values = lines.get(i).split(",");
            JSONObject obj = new JSONObject();
            for (int j = 0; j < headers.length && j < values.length; j++) {
                obj.put(headers[j].trim(), values[j].trim());
            }
            jsonArray.put(obj);
        }

        //Printing JSON output
        System.out.println("\nConverted JSON:");
        System.out.println(jsonArray.toString(4));


	}

}
