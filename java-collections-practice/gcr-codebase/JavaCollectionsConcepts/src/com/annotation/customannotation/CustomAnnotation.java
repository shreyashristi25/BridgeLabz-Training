package com.annotation.customannotation;
import java.lang.annotation.*;
import java.lang.reflect.*;

import java.util.* ;

public class CustomAnnotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		TaskManager manager = new TaskManager() ;
		
		//getting task name, method as user input
		System.out.print("Enter task name (completeProject / cleanWorkspace): ");
        String taskName = sc.nextLine().trim();

        
        try {
           
            Method method = TaskManager.class.getDeclaredMethod(taskName);

            // Checking if annotation is present and executing the method
            if (method.isAnnotationPresent(TaskInfo.class)) {
                TaskInfo info = method.getAnnotation(TaskInfo.class);

                System.out.println("Task Details:");
                System.out.println("Priority: " + info.priority());
                System.out.println("Assigned To: " + info.assignedTo());
                
                method.invoke(manager);
            }
            else {
                System.out.println("No TaskInfo annotation found for this method.");
            }
        } 
        catch (NoSuchMethodException e) {
            System.out.println("Invalid task name entered!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }


	}

}
