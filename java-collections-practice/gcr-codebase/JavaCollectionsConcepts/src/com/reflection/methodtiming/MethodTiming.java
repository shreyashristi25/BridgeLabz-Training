package com.reflection.methodtiming;
import java.lang.reflect.*;
import java.lang.annotation.*;
import java.util.* ;

public class MethodTiming {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//taking method name as user input and displaying result accordingly
        System.out.print("Enter method name to execute (fastMethod / slowMethod): ");
        String methodName = sc.nextLine().trim();

        try {
           
            Class<Task> clazz = Task.class;

            Task task = clazz.getDeclaredConstructor().newInstance();

            Method method = clazz.getDeclaredMethod(methodName);

            long start = System.nanoTime();
            method.invoke(task);
            long end = System.nanoTime();

            long duration = (end - start) / 1_000_000; 
            System.out.println("Execution time of " + methodName + ": " + duration + " ms");

        } 
        catch (NoSuchMethodException e) {
            System.out.println("No such method found: " + methodName);
        }
        catch (Exception e) {
            e.printStackTrace();
        }


	}

}
