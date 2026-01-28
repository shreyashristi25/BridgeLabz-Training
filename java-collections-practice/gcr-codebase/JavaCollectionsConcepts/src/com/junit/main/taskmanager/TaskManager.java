package com.junit.main.taskmanager;

public class TaskManager {

	//method to run a task 
	public String longRunningTask() {
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			Thread.currentThread().interrupt() ;
			return "Task Interrupted. ";
		}
		return "Task Completed." ;
	}
}
