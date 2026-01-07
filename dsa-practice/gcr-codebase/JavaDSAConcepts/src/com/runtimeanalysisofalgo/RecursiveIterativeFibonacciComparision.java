package com.runtimeanalysisofalgo;
import java.util.* ;
public class RecursiveIterativeFibonacciComparision {

	//method to find fibonacci using recursion
	public static int fibonacciRecursive(int n) {
	    if (n <= 1) return n;
	    return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}

	//method to find fibonacci using iterative method
	public static int fibonacciIterative(int n) {
	    int a = 0, b = 1, sum;
	    for (int i = 2; i <= n; i++) {
	        sum = a + b;
	        a = b;
	        b = sum;
	    }
	    return b;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in) ;
		
		//taking user input and displaying result
		System.out.print("Enter number for fibonacci series: ");
        int num = sc.nextInt();
        
        // checking timing of fibonacci using recursion
        long startRec = System.nanoTime();
        int recResult = fibonacciRecursive(num);
        long endRec = System.nanoTime();
        double timeRecMs = (endRec - startRec) / 1_000_000.0;

        // checking timing of fibonacci using iteration
        
        long startItr = System.nanoTime();
        int itrResult = fibonacciIterative(num);
        long endItr = System.nanoTime();
        double timeItrMs = (endItr - startItr) / 1_000_000.0;
        
        //displaying result
        System.out.println("Fibonacci Number at position " + num + ":");
        System.out.println("Recursive Result: " + recResult + " (Time: " + timeRecMs + " ms)");
        System.out.println("Iterative Result: " + itrResult + " (Time: " + timeItrMs + " ms)");


	}
}
