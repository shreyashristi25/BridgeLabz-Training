package com.annotation.bugreport;

public class TaskManager {

	@BugReport(description = "Null pointer issue when input is empty")
    @BugReport(description = "Performance issue with large datasets")
    public void processData() {
        System.out.println("Processing data...");
    }

    @BugReport(description = "Incorrect formatting in output")
    public void generateReport() {
        System.out.println("Generating report...");
    }


}
