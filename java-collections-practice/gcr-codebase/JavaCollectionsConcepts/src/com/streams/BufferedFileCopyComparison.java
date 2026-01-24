package com.streams;
import java.io.* ;
import java.util.* ;

public class BufferedFileCopyComparison {

	// Methods for Unbuffered copy (byte-by-byte) and buffered copy(chunks of 4KB)
    public static void copyUnbuffered(String source, String destination) {
        try (FileInputStream fin = new FileInputStream(source);
             FileOutputStream fout = new FileOutputStream(destination)) {

            int byteData;
            while ((byteData = fin.read()) != -1) {
                fout.write(byteData);
            }
        }
        catch (IOException e) {
            System.out.println("Error in unbuffered copy: " + e.getMessage());
        }
    }

    public static void copyBuffered(String source, String destination) {
        try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[4096]; 
            int bytesRead;
            while ((bytesRead = bin.read(buffer)) != -1) {
                bout.write(buffer, 0, bytesRead);
            }
        }
        catch (IOException e) {
            System.out.println("Error in buffered copy: " + e.getMessage());
        }
    }


	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in) ;
		
        // Taking file paths from user
        System.out.print("Enter source file path: ");
        String sourcePath = sc.nextLine();

        System.out.print("Enter destinationination file path for unbuffered copy: ");
        String destinationUnbuffered = sc.nextLine();

        System.out.print("Enter destinationination file path for buffered copy: ");
        String destinationBuffered = sc.nextLine();

        // Unbuffered copy and buffered copy
        long startUnbuffered = System.nanoTime();
        copyUnbuffered(sourcePath, destinationUnbuffered);
        long endUnbuffered = System.nanoTime();
        long timeUnbuffered = endUnbuffered - startUnbuffered;

        long startBuffered = System.nanoTime();
        copyBuffered(sourcePath, destinationBuffered);
        long endBuffered = System.nanoTime();
        long timeBuffered = endBuffered - startBuffered;

        // Displaying results
        System.out.println("--- Performance Comparison ---");
        System.out.println("Execution Time (Unbuffered): " + timeUnbuffered / 1_000_000 + " ms");
        System.out.println("Execution Time (Buffered):   " + timeBuffered / 1_000_000 + " ms");

        sc.close();

	}
}
