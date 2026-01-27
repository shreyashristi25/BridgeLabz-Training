package com.annotation.logexecutiontime;
import java.lang.annotation.*;
import java.util.* ;
import java.lang.reflect.*;

public class ExecutionTimeLogger {

	//method to run a method
	private static void runMethod(Object obj, Class<?> clazz, String methodName) throws Exception {
        Method method = clazz.getDeclaredMethod(methodName);
        if (method.isAnnotationPresent(LogExecutionTime.class)) {
            long start = System.nanoTime();
            method.invoke(obj);
            long end = System.nanoTime();
            long duration = end - start;
            System.out.println("Method: " + methodName + " | Execution Time: " + duration + " ns");
        }
        else {
            System.out.println("Method " + methodName + " is not annotated with @LogExecutionTime.");
        }

	}
	
	public static void main(String[] args) throws Exception {
		PerformanceTest test = new PerformanceTest();
	    Class<?> clazz = test.getClass();
	    Scanner sc = new Scanner(System.in);

	    //taking user choice as input and displaying result accordingly
	    System.out.println("=== Execution Time Logger ===");
	    System.out.println("Choose a method to run:");
	    System.out.println("1. fastMethod");
	    System.out.println("2. mediumMethod");
	    System.out.println("3. slowMethod");
	    System.out.println("4. Run All");
	    System.out.print("Enter choice: ");
	    int choice = sc.nextInt();

	    switch (choice) {
	        case 1:
	        	runMethod(test, clazz, "fastMethod");
	            break;
	        case 2:
	            runMethod(test, clazz, "mediumMethod");
	            break;
	        case 3:
	            runMethod(test, clazz, "slowMethod");
	            break;
	        case 4:
	            for (Method method : clazz.getDeclaredMethods()) {
	                if (method.isAnnotationPresent(LogExecutionTime.class)) {
	                    runMethod(test, clazz, method.getName());
	                }
	            }
	            break;
	        default:
	            System.out.println("Invalid choice!");
	    }

	    sc.close();

    }
	

}
