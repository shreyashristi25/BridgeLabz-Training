package com.hashmaps.longestconsecutivesequence;
import java.util.* ;

//driver class for LongestConsecutiveSequence class 
public class LongestConsecutiveMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//creating object, accessing methods and displaying result
		LongestConsecutiveSequence l = new LongestConsecutiveSequence() ;
		
		//Taking user input 
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int [] nums = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = l.longestConsecutive(nums);
        System.out.println("Length of longest consecutive sequence: " + result);

        sc.close();


	}

}
