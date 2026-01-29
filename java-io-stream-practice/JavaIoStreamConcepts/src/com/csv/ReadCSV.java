package com.csv;
import java.io.* ;
import java.util.* ;

public class ReadCSV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//taking file path as user input and reading CSV file 
        System.out.print("Enter the path of the file: ");
        String filePath = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] record = line.split(",");
                if (record.length >= 4) { 
                    System.out.println("ID: " + record[0] +", Name: " + record[1] +", Age: " + record[2] +", Marks: " + record[3]);
                } 
                else {
                    System.out.println("Invalid record: " + line);
                }
            }
        } 
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        
       sc.close();
	}

}
