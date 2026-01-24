package com.streams;
import java.io.* ;
import java.util.* ;

public class FileHandling {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in) ;
		
		// Taking file names from user
        System.out.print("Enter source file path: ");
        String sourcePath = sc.nextLine();

        System.out.print("Enter destination file path: ");
        String destinationPath = sc.nextLine();

        FileInputStream fin = null;
        FileOutputStream fout = null;

        //Handling exception
        try {            
            File sourceFile = new File(sourcePath);
            if (!sourceFile.exists()) {
                System.out.println("Source file does not exist!");
                return; 
            }
           
            fin = new FileInputStream(sourceFile);
            fout = new FileOutputStream(destinationPath); 

            int byteData;
           
            while ((byteData = fin.read()) != -1) {
                fout.write(byteData);
            }

            System.out.println("File copied successfully!");
        } 
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } 
        
        finally {
           
            try {
                if (fin != null) fin.close();
                if (fout != null) fout.close();
                sc.close();
            } 
            catch (IOException e) {
                System.out.println("Error closing streams: " + e.getMessage());
            }
        }


	}

}
