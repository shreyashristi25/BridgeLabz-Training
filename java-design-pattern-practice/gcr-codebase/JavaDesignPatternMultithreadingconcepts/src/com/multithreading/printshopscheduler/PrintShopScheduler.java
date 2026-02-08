package com.multithreading.printshopscheduler;
import java.util.* ;

public class PrintShopScheduler {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//taking number of print jobs as user input and printing result accordingly
        System.out.print("Enter number of print jobs: ");
        int n = sc.nextInt();
        sc.nextLine();

        Thread[] jobs = new Thread[n];

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter job name " + (i+1) + ": ");
            String jobName = sc.nextLine();

            System.out.print("Enter number of pages for " + jobName + ": ");
            int pages = sc.nextInt();

            System.out.print("Enter priority (1-10) for " + jobName + ": ");
            int priority = sc.nextInt();
            sc.nextLine(); 

            PrintJob pj = new PrintJob(jobName, pages);
            jobs[i] = new Thread(pj, jobName);
            jobs[i].setPriority(priority);

            System.out.println(jobs[i].getName() + " created with priority " + priority);
        }

        System.out.println("Starting print jobs...");

        for (Thread t : jobs) {
            t.start();
        }

        for (Thread t : jobs) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("All jobs completed in " + (endTime - startTime) + "ms");

        sc.close();


	}

}
