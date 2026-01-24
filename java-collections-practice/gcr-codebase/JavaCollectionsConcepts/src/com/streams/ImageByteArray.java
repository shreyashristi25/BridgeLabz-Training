package com.streams;
import java.io.* ;
import java.util.* ;

public class ImageByteArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // taking user input for input and output file names
        System.out.print("Enter path of input image: ");
        String inputImage = sc.nextLine();

        System.out.print("Enter path for output image: ");
        String outputImage = sc.nextLine();

        try {
        	
            //reading images in fileStream, writing to ByteArrayOutputStream
            FileInputStream fis = new FileInputStream(inputImage);

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            fis.close();

            // Converting to byte array and reading from ByteArrayInputStream and writing back to new file
            byte[] imageBytes = baos.toByteArray();

            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);

            FileOutputStream fos = new FileOutputStream(outputImage);
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            fos.close();
            bais.close();

            System.out.println(" Image converted to byte array and written back successfully!");

            // Verifying by comparing file sizes
            File original = new File(inputImage);
            File copy = new File(outputImage);

            if (original.length() == copy.length()) {
                System.out.println(" Verification successful: Files are identical in size.");
            } else {
                System.out.println(" Verification failed: Files differ in size.");
            }

        } 
        catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        sc.close();

	}

}
