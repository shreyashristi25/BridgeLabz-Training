package com.annotation.bugreport;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.* ;

public class RepeatableAnnotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        System.out.print("Enter method name (processData / generateReport): ");
        String methodName = sc.nextLine().trim();

        //getting all BugReport annotations and executing the method and displaying result
        try {
            Method method = TaskManager.class.getDeclaredMethod(methodName);

            BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);

            if (bugReports.length > 0) {
                System.out.println("Bug Reports for method: " + methodName);
                for (BugReport report : bugReports) {
                    System.out.println("- " + report.description());
                }
                System.out.println("---------------------------");

                method.invoke(manager);
            } 
            else {
                System.out.println("No bug reports found for this method.");
            }
        }
        catch (NoSuchMethodException e) {
            System.out.println("Invalid method name entered!");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}



