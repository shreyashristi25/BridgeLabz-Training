package com.annotation.logexecutiontime;

public class PerformanceTest {

	@LogExecutionTime
    public void fastMethod() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += i;
        }
    }

    @LogExecutionTime
    public void mediumMethod() {
        try {
            Thread.sleep(200); 
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @LogExecutionTime
    public void slowMethod() {
        try {
            Thread.sleep(500); 
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
