package com.annotation.customannotation;

public class TaskManager {

	//applying annotations to methods
	 @TaskInfo(priority = "High", assignedTo = "Shreya")
	 public void completeProject() {
		 System.out.println("Completing project...");
	 }

	 @TaskInfo(priority = "Low", assignedTo = "Shristi")
	 public void cleanWorkspace() {
		 System.out.println("Cleaning workspace...");
	 }

}
