package com.runtimeanalysisofalgo;
import java.io.*;
import java.util.*;


public class FileReadingComparison  {

	//method to read with file reader
	public static void readWithFileReader(String filePath) throws IOException {
		FileReader fr = new FileReader(filePath) ;
		BufferedReader br = new BufferedReader(fr) ;
		while(br.read() != -1) {
			
		}
		br.close();
		fr.close();
		
	}
	
	//method to read with input stream reader
	public static void readWithInputStreamReader(String filePath) throws IOException {
		
		FileInputStream fs = new FileInputStream (filePath) ;
		InputStreamReader is =  new InputStreamReader(fs) ;
		BufferedReader br = new BufferedReader(is) ;
		while(br.read() != -1) {
			
		}
		br.close();
		is.close();
		fs.close();
	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking file path input from user
        System.out.print("Enter the file path: ");
        String filePath = sc.nextLine();

        try {
            // time taken by FileReader 
            long startFR = System.nanoTime();
            readWithFileReader(filePath);
            long endFR = System.nanoTime();
            double timeFR = (endFR - startFR) / 1_000_000.0;

            //time taken by  InputStreamReader 
            long startISR = System.nanoTime();
            readWithInputStreamReader(filePath);
            long endISR = System.nanoTime();
            double timeISR = (endISR - startISR) / 1_000_000.0;

            // displaying results
            System.out.println("File Reading Efficiency Comparison:");
            System.out.println("File Path: " + filePath);
            System.out.println("FileReader Time: " + timeFR + " ms");
            System.out.println("InputStreamReader Time: " + timeISR + " ms");

        } 
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

}
