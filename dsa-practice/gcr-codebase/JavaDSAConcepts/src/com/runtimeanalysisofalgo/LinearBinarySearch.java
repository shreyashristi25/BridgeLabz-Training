package com.runtimeanalysisofalgo;
import java.util.* ;
public class LinearBinarySearch {

	//method for lijear search
	public static int linearSearch(int [] arr, int target) {
		
		for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;

	}
	
	//method for binary search
	public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Taking dataset size and target from user
        System.out.print("Enter dataset size (e.g., 1000, 10000, 1000000): ");
        int n = sc.nextInt();

        // Generating random dataset
        int [] dataset = new int[n];
        for (int i = 0; i < n; i++) {
            dataset[i] = random.nextInt(n * 10); 
        }

        System.out.print("Enter target value to search: ");
        int target = sc.nextInt();

        // checking Linear Search timing
        long startLinear = System.nanoTime();
        int linearResult = linearSearch(dataset, target);
        long endLinear = System.nanoTime();
        double timeLinearMs = (endLinear - startLinear) / 1_000_000.0;

        // Checking Binary Search timing 
        Arrays.sort(dataset);
        long startBinary = System.nanoTime();
        int binaryResult = binarySearch(dataset, target);
        long endBinary = System.nanoTime();
        double timeBinaryMs = (endBinary - startBinary) / 1_000_000.0;


        //displaying result
        System.out.println("\nDataset Size: " + n);
        System.out.println("Target: " + target);
        System.out.println("Linear Search Result: " + (linearResult != -1 ? "Found at index " + linearResult : "Not Found"));
        System.out.println("Linear Search Time: " + timeLinearMs + " ms");
        System.out.println("Binary Search Result: " + (binaryResult != -1 ? "Found at index " + binaryResult : "Not Found"));
        System.out.println("Binary Search Time: " + timeBinaryMs + " ms");
        
        
        sc.close();
    }
	
}
