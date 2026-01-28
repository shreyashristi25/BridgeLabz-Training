package com.junit.main.taskmanager;

public class TaskManagerMain {

	public static void main(String[] args) {
		
		//creating object, accessing methods and displaying result
		 TaskManager manager = new TaskManager();
	        System.out.println("Starting long-running task...");
	        String result = manager.longRunningTask();
	        System.out.println("Result: " + result);
	    
	}

}
