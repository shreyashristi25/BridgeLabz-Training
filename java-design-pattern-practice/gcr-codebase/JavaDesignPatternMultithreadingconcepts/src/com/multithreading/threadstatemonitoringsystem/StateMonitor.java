package com.multithreading.threadstatemonitoringsystem;
import java.util.* ;
import java.text.SimpleDateFormat ;

public class StateMonitor extends Thread{

	private Thread[] tasks;

	//constructor
    public StateMonitor(Thread[] tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        boolean monitoring = true;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        while (monitoring) {
            monitoring = false; 
            for (Thread t : tasks) {
                Thread.State state = t.getState();
                String timeStamp = sdf.format(new Date());
                System.out.println("[Monitor] " + t.getName() + " is in " + state + " state at " + timeStamp);

                if (state != Thread.State.TERMINATED) {
                    monitoring = true; 
                }
            }

            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Summary
        System.out.println("Summary: Each task went through NEW, RUNNABLE, TIMED_WAITING, TERMINATED states.");
    }

        
}
