package com.stackandqueue.slidingwindowmaximum;
import java.util.* ;

public class SlidingWindowMaximum {

	public static int [] maxSlidingWindow(int [] nums, int k) {
        
		if (nums == null || k <= 0) {
        	return new int[0];
        }
        int n = nums.length;
        int [] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        // Remove indices out of current window, Remove smaller elements from back,  Add current index and Record max for current window
        for (int i = 0; i < n; i++) {
            
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return result;
	}
}
