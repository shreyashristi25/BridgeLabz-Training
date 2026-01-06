package com.filereaderandinputstreamreader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreamToCharacterStream {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking user for file path
        System.out.print("Enter the file path: ");
        String filePath = sc.nextLine();

        //Reading a UTF-8 encoded file line by line using InputStreamReader and BufferedReader and printing its contents 
        try (
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); 
            BufferedReader br = new BufferedReader(isr)
        ) 
        {
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
