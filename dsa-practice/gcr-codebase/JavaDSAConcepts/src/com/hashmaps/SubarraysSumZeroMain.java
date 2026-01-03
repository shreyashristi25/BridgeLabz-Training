package com.hashmaps;
import java.util.* ;

//driver class for SubarraysSumZero class
public class SubarraysSumZeroMain {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);

		//creating object, accessing methods and displaying result
		SubarraysSumZero s = new SubarraysSumZero();
		
		//Taking user input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<int[]> subarrays = s.findZeroSumSubarrays(arr);

        if (subarrays.isEmpty()) {
            System.out.println("No zero-sum subarrays found.");
        } 
        else {
            System.out.println("Zero-sum subarrays (startIndex → endIndex):");
            for (int[] range : subarrays) {
                System.out.println(range[0] + " → " + range[1]);
             }
        }

        sc.close();


	}

}
