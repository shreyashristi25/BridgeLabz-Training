package com.runtimeanalysisofalgo;
import java.util.* ;

public class StringConcatenationPerformance {

	//method to check time to concatenate using String
	public static  double testStringConcat(int n) {
		long start = System.nanoTime();
		String str = "" ;
		for(int i = 0; i < n ; i++) {
			str += "ab" ;
		}
		long end = System.nanoTime();
		return (end - start) /1_000_000.0 ;
	}
	
	//method to check time to concatenate using StringBuilder
	public static double testStringBuilderConcat(int n) {
		long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("ab");
        }
        long end = System.nanoTime();
        return (end - start) / 1_000_000.0;

	}
	
	//method to check time to concatenate using StringBuffer
	public static double testStringBufferConcat(int n) {
        long start = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbuf.append("ab");
        }
        long end = System.nanoTime();
        return (end - start) / 1_000_000.0;
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user, calling methods and displaying results
        System.out.print("Enter number of concatenations (e.g., 1000, 10000, 1000000): ");
        int n = sc.nextInt();

        double timeString = testStringConcat(n);
        double timeSB = testStringBuilderConcat(n);
        double timeSBuf = testStringBufferConcat(n);

        System.out.println("Concatenation Performance for N = " + n);
        System.out.println("String Time: " + timeString + " ms");
        System.out.println("StringBuilder Time: " + timeSB + " ms");
        System.out.println("StringBuffer Time: " + timeSBuf + " ms");
    }


}
