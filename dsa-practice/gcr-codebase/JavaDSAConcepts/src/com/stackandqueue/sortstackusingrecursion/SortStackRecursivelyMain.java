package com.stackandqueue.sortstackusingrecursion;
import java.util.* ;
public class SortStackRecursivelyMain {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Stack<Integer> stack = new Stack<>();
        SortStackRecursively s = new SortStackRecursively() ;

        System.out.print("Enter number of elements in stack: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            stack.push(val);
        }

        System.out.println("Original Stack:");
        s.printStack(stack);

        s.sortStack(stack);

        System.out.println("Sorted Stack (Ascending):");
        s.printStack(stack);
        
        System.out.println("Sorted Stack (Descending):");
        s.printStackAscending(stack);

        sc.close();
    }

}
