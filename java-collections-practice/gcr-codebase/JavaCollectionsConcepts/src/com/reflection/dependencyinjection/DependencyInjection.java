package com.reflection.dependencyinjection;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.* ;

public class DependencyInjection {

	//Dependency container
	public static <T> T getInstance(Class<T> clazz) {
        try {
            T obj = clazz.getDeclaredConstructor().newInstance();

            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(Inject.class)) {
                    Object dependency = field.getType().getDeclaredConstructor().newInstance();
                    field.setAccessible(true);
                    field.set(obj, dependency);
                }
            }
            return obj;
        } catch (Exception e) {
            throw new RuntimeException("DI failed", e);
        }
    }

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		 //taking user input and displaying result
	     System.out.print("Enter your name: ");
	     String userName = sc.nextLine().trim();

	     Client client = getInstance(Client.class);
	     client.run(userName);
	}


}
