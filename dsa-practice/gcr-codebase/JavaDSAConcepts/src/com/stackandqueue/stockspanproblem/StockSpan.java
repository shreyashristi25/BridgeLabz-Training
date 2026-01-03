package com.stackandqueue.stockspanproblem;
import java.util.* ;

public class StockSpan {

	//method to calculate the span 
	public static int [] calculateSpan(int[] prices) {
        int n = prices.length;
        int [] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        // First day is always 1
        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < n; i++) {
            // Pop indices with price <= current price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            stack.push(i);
        }
        return span;
	}
}
