package com.streams;
import java.io.* ;
import java.nio.charset.*;
import java.util.* ;

public class LargeFileReader {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // taking user input for file path
        System.out.print("Enter path of the text file: ");
        String filename = sc.nextLine();

        try (
        		//reading and making for case-insensitive for "error"
            BufferedReader br = new BufferedReader( new InputStreamReader(new FileInputStream(filename), StandardCharsets.UTF_8) )
        ) {
            String line;
            long lineCount = 0;

            while ((line = br.readLine()) != null) {
                lineCount++;
                
                if (line.toLowerCase().contains("error")) {
                    System.out.println("Line " + lineCount + ": " + line);
                }
            }

            System.out.println(" Finished reading file. Total lines checked: " + lineCount);

        } 
        catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        sc.close();


	}

}
