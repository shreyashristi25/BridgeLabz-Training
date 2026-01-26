package com.reflection.objectmapper;
import java.lang.reflect.*;
import java.util.*;

public class ObjectMapper {

	// Maps a properties Map to a new object instance using Reflection to set matching fields
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
          
            T obj = clazz.getDeclaredConstructor().newInstance();

            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();

                try {
                    Field field = clazz.getDeclaredField(fieldName);
                    field.setAccessible(true);

                    if (field.getType() == int.class && fieldValue instanceof String) {
                        field.set(obj, Integer.parseInt((String) fieldValue));
                    } else {
                        field.set(obj, fieldValue);
                    }
                } catch (NoSuchFieldException e) {
                    System.out.println("No field found for: " + fieldName);
                }
            }

            return obj;
        } 
        catch (Exception e) {
            throw new RuntimeException("Error mapping object", e);
        }
    }
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  Map<String, Object> props = new HashMap<>();

		  //taking user input and mapping objects
		  System.out.print("Enter student name: ");
		  props.put("name", sc.nextLine().trim());

		  System.out.print("Enter student age: ");
		  props.put("age", sc.nextLine().trim()); 
		  Student s = ObjectMapper.toObject(Student.class, props);
		  System.out.println("Mapped Object: " + s);

	}

}
