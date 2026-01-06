package com.filereader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.* ;
 ;public class FileReaderProblem {

	public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        // Asking user for file path
        System.out.print("Enter the file path: ");
        String filePath = sc.nextLine();

        // Try-with-resources ensures file is closed automatically and reading the file specified
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            System.out.println("--- File Content ---");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("--- End of File ---");

        } 
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
	}

}
