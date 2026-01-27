package com.annotation.markimportantmethod;

public class TaskManager {

    @ImportantMethod(level = "CRITICAL")
    public void processData() {
        System.out.println("Processing data...");
    }

    @ImportantMethod   
    public void saveData() {
        System.out.println("Saving data...");
    }

    public void helperMethod() {
        System.out.println("Helper method (not important).");
    }
}
