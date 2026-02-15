package com.functionalinterface.runnable;
import java.util.* ;

public class RunnableDemo {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Run a background task using Runnable
        Runnable backgroundTask = () -> {
            System.out.println("Background task is running...");
            try {
                Thread.sleep(2000); 
                System.out.println("Background task completed!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(backgroundTask).start();

        // Execute a file cleanup task using Runnable
        Runnable cleanupTask = () -> {
            System.out.println("File cleanup task started...");
            try {
                Thread.sleep(1000); 
                System.out.println("File cleanup completed!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(cleanupTask).start();

        // Print a message in a separate thread using Runnable
        System.out.print("\nEnter a message to print in a separate thread: ");
        String message = sc.nextLine();

        Runnable messageTask = () -> System.out.println("Thread Message: " + message);
        new Thread(messageTask).start();

        sc.close();
    }

}
