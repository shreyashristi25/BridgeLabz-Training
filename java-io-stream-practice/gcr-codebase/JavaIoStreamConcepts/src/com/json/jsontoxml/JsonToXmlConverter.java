package com.json.jsontoxml;
import org.json.JSONObject;
import org.json.XML;
import java.util.Scanner;

public class JsonToXmlConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        //Taking JSON input from user
        System.out.println("Enter a JSON string:");
        String jsonInput = scanner.nextLine();

        try {
          
            JSONObject jsonObject = new JSONObject(jsonInput);

            String xmlOutput = XML.toString(jsonObject);

            System.out.println("\nConverted XML:");
            System.out.println(xmlOutput);

        } catch (Exception e) {
            System.out.println(" Invalid JSON input: " + e.getMessage());
        }


	}

}
