package com.coderepocleaner;
import java.util.* ;
import java.io.* ;


public class CodeRepoCleanerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        CodeRepoCleaner cleaner = new CodeRepoCleaner();

        //taking user input and displaying result accordingly
        System.out.print("Enter root directory to scan: ");
        String rootDir = sc.nextLine();

        try {
            cleaner.scanFiles(rootDir);
        } 
        catch (IOException e) {
            System.err.println("Error scanning files: " + e.getMessage());
            e.printStackTrace();
            return; 
        }

        cleaner.analyzeFiles();

        System.out.print("Enter minimum file size (bytes): ");
        long minSize = sc.nextLong();

        System.out.print("Enter maximum file size (bytes): ");
        long maxSize = sc.nextLong();

        System.out.print("Enter modified after (timestamp in ms, e.g. 0 for all): ");
        long modifiedAfter = sc.nextLong();

        cleaner.filterFiles(minSize, maxSize, modifiedAfter);
        cleaner.printSummary();

        sc.close();



	}

}
