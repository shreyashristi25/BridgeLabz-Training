package com.annotation.cacheresult;

public class ExpensiveService {

	@CacheResult
    public int computeSquare(int number) {
        System.out.println("Computing square for: " + number);
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return number * number;
    }

}
