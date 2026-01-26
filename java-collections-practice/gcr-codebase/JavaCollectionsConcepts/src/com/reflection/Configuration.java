package com.reflection;
import java.lang.reflect.*;
import java.util.*;

public class Configuration {

	//private static fields
	private static String API_KEY = "DEFAULT_KEY";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Using Reflection to access and update the private static API_KEY field based on user input
        try {
            
            Class<Configuration> cls = Configuration.class;

            Field field = cls.getDeclaredField("API_KEY");

            field.setAccessible(true);

            System.out.println("Original API_KEY: " + field.get(null));

            System.out.print("Enter new API_KEY: ");
            String newKey = sc.nextLine().trim();

            if (newKey.isEmpty()) {
                System.out.println("No new key entered, keeping original.");
            } 
            else {
                field.set(null, newKey);
            }

            System.out.println("Modified API_KEY: " + field.get(null));

        } 
        catch (Exception e) {
            e.printStackTrace();
        }


	}

}
