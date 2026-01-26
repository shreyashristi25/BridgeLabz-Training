package com.reflection.methodtiming;

public class Task {

	//methods for time of fastMethod and slow method
	public void fastMethod() {
        System.out.println("Fast method running...");
    }

    public void slowMethod() {
        try {
            Thread.sleep(1000); 
            System.out.println("Slow method finished...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
