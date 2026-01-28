package com.junit.main.fileprocessor;
import java.util.* ;
import java.io.* ;

public class FileProcessorMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        FileProcessor processor = new FileProcessor();

        //taking file path as user input 
        System.out.print("Enter filepath: ");
        String filepath = scanner.nextLine();

        System.out.print("Enter content to write: ");
        String content = scanner.nextLine();

        try {
            // Write to file
            processor.writeToFile(filepath, content);
            System.out.println("File written successfully.");

            // Read from file
            String readContent = processor.readFromFile(filepath);
            System.out.println("Read content: " + readContent);

        }
        catch (IOException e) {
            System.out.println("Error handling file: " + e.getMessage());
        }

        scanner.close();

	}

}
