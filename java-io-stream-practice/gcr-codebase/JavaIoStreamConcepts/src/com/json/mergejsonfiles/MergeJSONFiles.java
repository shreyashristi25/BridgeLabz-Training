package com.json.mergejsonfiles;
import org.json.JSONObject;
import org.json.JSONTokener;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MergeJSONFiles {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        try {
            //Taking file paths from user
            System.out.print("Enter path of first JSON file: ");
            String file1 = scanner.nextLine();

            System.out.print("Enter path of second JSON file: ");
            String file2 = scanner.nextLine();

            // Reading both JSON files
            JSONObject json1 = new JSONObject(new JSONTokener(new FileInputStream(file1)));
            JSONObject json2 = new JSONObject(new JSONTokener(new FileInputStream(file2)));

            for (String key : json2.keySet()) {
                json1.put(key, json2.get(key)); 
            }

            System.out.print("Enter output file path: ");
            String outputFile = scanner.nextLine();

            try (FileWriter fileWriter = new FileWriter(outputFile)) {
                fileWriter.write(json1.toString(4)); 
            }

            System.out.println("Merged JSON saved to " + outputFile);

        } catch (IOException e) {
            System.out.println("Error reading/writing files: " + e.getMessage());
        }


	}

}
