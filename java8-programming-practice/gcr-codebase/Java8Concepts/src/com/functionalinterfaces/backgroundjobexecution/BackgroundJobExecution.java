package com.functionalinterfaces.backgroundjobexecution;
import java.util.* ;
import java.util.function.* ;
public class BackgroundJobExecution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user choice as input to execute tasks
		 while (true) {
	            System.out.println("=== Background Job Menu ===");
	            System.out.println("1. Send Email");
	            System.out.println("2. Generate Report");
	            System.out.println("3. Backup Data");
	            System.out.println("4. Exit");
	            System.out.print("Choose a job to execute: ");
	            int choice = sc.nextInt();

	            Runnable job;

	            switch (choice) {
	                case 1:
	                    job = () -> {
	                        System.out.println("Sending email in background...");
	                        try { Thread.sleep(2000); } 
	                        catch (InterruptedException e) {}
	                        System.out.println("Email sent successfully!");
	                    };
	                    break;

	                case 2:
	                    job = () -> {
	                        System.out.println("Generating report in background...");
	                        try { Thread.sleep(3000); } 
	                        catch (InterruptedException e) {}
	                        System.out.println("Report generated!");
	                    };
	                    break;
	                  
	                case 3:
	                    job = () -> {
	                        System.out.println("Backing up data in background...");
	                        try { Thread.sleep(4000); } 
	                        catch (InterruptedException e) {}
	                        System.out.println(" Data backup completed!");
	                    };
	                    break;

	                case 4:
	                    System.out.println("Exiting system...");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice. Try again.");
	                    continue;
	            }

	            // Executing job asynchronously
	            Thread t = new Thread(job);
	            t.start();

	            System.out.println("Main thread continues execution...");
	        }

	}

}
