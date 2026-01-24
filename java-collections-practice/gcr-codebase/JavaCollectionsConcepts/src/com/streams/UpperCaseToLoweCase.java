package com.streams;
import java.io.* ;
import java.nio.charset.*;
import java.util.* ;

public class UpperCaseToLoweCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		// Taking user input for input and output file names
        System.out.print("Enter path of input text file: ");
        String inputFile = sc.nextLine();

        System.out.print("Enter path for output text file: ");
        String outputFile = sc.nextLine();

        try (
            //reading and using standard UTF-8 unicode
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), StandardCharsets.UTF_8));

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile), StandardCharsets.UTF_8) )
        ) {
            String line;
            while ((line = br.readLine()) != null) {
               
                bw.write(line.toLowerCase());
                bw.newLine();
            }

            System.out.println("Conversion complete! Output written to " + outputFile);

        } 
        catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        sc.close();


	}

}
