package com.multithreading.threadstatemonitoringsystem;
import java.util.* ;

public class ThreadStateMonitoringSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//taking number of tasks as user input 
        System.out.print("Enter number of tasks: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        TaskRunner[] tasks = new TaskRunner[n];

        // Collecting task names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name for Task-" + (i+1) + ": ");
            String name = sc.nextLine();
            tasks[i] = new TaskRunner(name);

            System.out.println("[Manager] " + tasks[i].getName() + " initial state: " + tasks[i].getState());
        }

        // Starting tasks and monitor
        for (TaskRunner t : tasks) {
            t.start();
        }

        StateMonitor monitor = new StateMonitor(tasks);
        monitor.start();

        try {
            for (TaskRunner t : tasks) {
                t.join();
            }
            monitor.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All tasks completed. Monitoring finished.");
        sc.close();

	}

}
