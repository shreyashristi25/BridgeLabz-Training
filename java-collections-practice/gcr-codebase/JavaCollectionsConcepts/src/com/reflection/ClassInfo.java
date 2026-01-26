package com.reflection;
import java.util.* ;
import java.lang.reflect.* ;

public class ClassInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking class name as user input 
		System.out.print("Enter fully qualified class name: ");
        String className = sc.nextLine();

        try {
            // Loading the class dynamically
            Class<?> cls = Class.forName(className);

            System.out.println("Class: " + cls.getName());

            System.out.println("Constructors:");
            for (Constructor<?> c : cls.getDeclaredConstructors()) {
                System.out.println(c);
            }

            System.out.println("Fields:");
            for (Field f : cls.getDeclaredFields()) {
                System.out.println(f);
            }

            System.out.println("Methods:");
            for (Method m : cls.getDeclaredMethods()) {
                System.out.println(m);
            }

        }
        catch (ClassNotFoundException e) {
            System.out.println("Class not found!");
        }


		
	}

}
