package com.annotation.jasonfield;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.* ;

public class JsonSerializer {
	
	// method to convert an object into a JSON string using @JsonField annotations
	public static String toJson(Object obj) {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{");

        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        int count = 0;
        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField annotation = field.getAnnotation(JsonField.class);
                String key = annotation.name();

                field.setAccessible(true);
                try {
                    Object value = field.get(obj);
                    if (count > 0) {
                        jsonBuilder.append(", ");
                    }
                    jsonBuilder.append("\"").append(key).append("\": ");

                    if (value instanceof String) {
                        jsonBuilder.append("\"").append(value).append("\"");
                    } else {
                        jsonBuilder.append(value);
                    }
                    count++;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        jsonBuilder.append("}");
        return jsonBuilder.toString();

	}

}
