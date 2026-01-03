package com.stackandqueue.sortstackusingrecursion;
import java.util.* ;
public class SortStackRecursively {

	// method to insert element in sorted order
    public static void insertSorted(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
            return;
        }
        int top = stack.pop();
        insertSorted(stack, element);
        stack.push(top);
    }

    // method to sort and print stack
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sortStack(stack);
            insertSorted(stack, top);
        }
    }

    public static void printStack(Stack<Integer> stack) {
        System.out.print("Stack (top → bottom): ");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }

    public static void printStackAscending(Stack<Integer> stack) {
        System.out.print("Stack (bottom → top): ");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }

    
}
