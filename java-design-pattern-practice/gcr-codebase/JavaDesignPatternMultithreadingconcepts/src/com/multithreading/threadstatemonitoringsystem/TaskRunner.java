package com.multithreading.threadstatemonitoringsystem;

public class TaskRunner extends Thread{

	public TaskRunner(String name) {
		super(name) ;
	}
	
	@Override
	public void run() {
		try {
           
            for (int i = 0; i < 3; i++) {
                int sum = i * i;
            }

            Thread.sleep(2000);

            for (int i = 0; i < 1000000; i++) {
                int sum = i + i;
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

	}
}
