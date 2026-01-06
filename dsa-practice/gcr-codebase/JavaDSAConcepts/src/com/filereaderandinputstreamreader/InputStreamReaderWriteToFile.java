package com.filereaderandinputstreamreader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.* ;
public class InputStreamReaderWriteToFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter the file path : ") ;
        String filePath = sc.nextLine(); 

        //reading input using inputStreamReader, wrapping InputStreamReader in BufferedReader, Creating FileWriter to write to file
        try (
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                FileWriter fw = new FileWriter(filePath)
            ) {
                String line;
                System.out.println("Enter text (type 'exit' to stop):");

                while ((line = br.readLine()) != null) {
                    if (line.equalsIgnoreCase("exit")) {
                        break;
                    }
                    fw.write(line + System.lineSeparator()); 
                }

                System.out.println("Input saved to " + filePath);

        } 
        catch (IOException e) {
        	System.out.println("Error: " + e.getMessage());
        }

        sc.close();

    }

}
