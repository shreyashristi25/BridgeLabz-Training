package com.multithreading.printshopscheduler;

public class PrintJob implements Runnable{

	private String jobName;
    private int pages;

    //constructor
    public PrintJob(String jobName, int pages) {
        this.jobName = jobName;
        this.pages = pages;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started " + jobName);

        for (int i = 1; i <= pages; i++) {
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("[" + Thread.currentThread().getName() + "] Printing " 
                               + jobName + " - Page " + i + " of " + pages);
        }

        System.out.println(Thread.currentThread().getName() + " completed " + jobName);
    }

}
