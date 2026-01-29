package com.csv;
import java.io.*;

public class WriteCSV {

	public static void main(String[] args) {
		String filePath = "employees.csv";  

		//writing into a csv file
        try (FileWriter writer = new FileWriter(filePath)) {
           
            writer.append("ID,Name,Department,Salary\n");

            
            writer.append("1,Anita,HR,50000");
            writer.append("2,Rahul,IT,60000");
            writer.append("3,Meena,Finance,55000");
            writer.append("4,Arjun,Marketing,52000");
            writer.append("5,Sneha,Operations,58000");

            System.out.println("CSV file created successfully: " + filePath);
        }
        catch (IOException e) {
            e.printStackTrace();
        }


	}

}
