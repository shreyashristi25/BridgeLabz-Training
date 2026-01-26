package com.reflection.jasonreflection;
import java.lang.reflect.*;
import java.util.* ;

public class JSONReflection {

	// Method to convert object to JSON-like string
    public static String toJson(Object obj) {
        StringBuilder json = new StringBuilder("{");
        Class<?> clazz = obj.getClass();

        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true); 
            try {
                Object value = field.get(obj);
                json.append("\"").append(field.getName()).append("\":");

                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }

                if (i < fields.length - 1) {
                    json.append(", ");
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        json.append("}");
        return json.toString();
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//taking user input and displaying result
        System.out.print("Enter student name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter student age: ");
        int age = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Enter student marks: ");
        double marks = Double.parseDouble(sc.nextLine().trim());

        Student s = new Student(name, age, marks);

        String jsonString = toJson(s);
        System.out.println("JSON Representation: " + jsonString);

	}

}
