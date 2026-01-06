package com.stringbuffer;

public class StringPerformanceTest {

	public static void main(String[] args) {
        int iterations = 1_000_000;

        // Testing StringBuffer
        StringBuffer sbf = new StringBuffer();
        long startTime = System.nanoTime();
        
        for (int i = 0; i < iterations; i++) {
            sbf.append("hello");
        }
        
        long endTime = System.nanoTime();
        long stringBufferTime = endTime - startTime;

        // Testing StringBuilder
        StringBuilder sbd = new StringBuilder();
        startTime = System.nanoTime();
        
        for (int i = 0; i < iterations; i++) {
            sbd.append("hello");
        }
        endTime = System.nanoTime();
        long stringBuilderTime = endTime - startTime;

        // displaying result
        System.out.println("Time taken by StringBuffer: " + stringBufferTime + " ns");
        System.out.println("Time taken by StringBuilder: " + stringBuilderTime + " ns");
    }

}
