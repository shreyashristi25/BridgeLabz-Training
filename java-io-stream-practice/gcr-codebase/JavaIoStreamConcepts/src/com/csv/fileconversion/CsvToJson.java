package com.csv.fileconversion;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.util.*;

public class CsvToJson {

	public static void convertCsvToJson(String csvFile, String jsonFile) {
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Student s = new Student();
                s.setId(Integer.parseInt(values[0].trim()));
                s.setName(values[1].trim());
                s.setAge(Integer.parseInt(values[2].trim()));
                students.add(s);
            }

            // Write JSON
            ObjectMapper mapper = new ObjectMapper();
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(jsonFile), students);

            System.out.println("✅ CSV converted back to JSON successfully: " + jsonFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

}
}
