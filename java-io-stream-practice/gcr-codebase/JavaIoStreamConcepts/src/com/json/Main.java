package com.json;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) {
    	
    	 // JSON data stored as String
        String json = "{"
                + "\"name\":\"Shreya\","
                + "\"age\":22,"
                + "\"subjects\":[\"Java\",\"DSA\",\"OS\",\"DBMS\"]"
                + "}";

        try {
            ObjectMapper mapper = new ObjectMapper();
            
            // Convert JSON String into Student object
            Student student = mapper.readValue(json, Student.class);

            // Displaying converted object data
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Subjects: " + student.getSubjects());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}



