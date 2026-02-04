package com.csv.fileconversion;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.util.*;

public class JsonToCsv {

	public static void convertJsonToCsv(String jsonFile, String csvFile) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            // Read JSON into list of Student objects
            List<Student> students = mapper.readValue(new File(jsonFile), new TypeReference<List<Student>>(){});

            // Write CSV
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
                bw.write("ID,Name,Age");
                bw.newLine();

                for (Student s : students) {
                    bw.write(s.getId() + "," + s.getName() + "," + s.getAge());
                    bw.newLine();
                }
            }

            System.out.println("✅ JSON converted to CSV successfully: " + csvFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
