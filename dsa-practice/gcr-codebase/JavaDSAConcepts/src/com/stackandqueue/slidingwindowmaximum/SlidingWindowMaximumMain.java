package com.stackandqueue.slidingwindowmaximum;
import java.util.* ;

public class SlidingWindowMaximumMain {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //creating object, accessing methods and displaying result
        SlidingWindowMaximum s =  new SlidingWindowMaximum();
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int [] nums = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter window size k: ");
        int k = sc.nextInt();

        int [] result = s.maxSlidingWindow(nums, k);

        System.out.println("\nMaximums in each sliding window:");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();

        sc.close();
	}
}
