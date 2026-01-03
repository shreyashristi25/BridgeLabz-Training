package com.hashmaps.pairwithgivensum;
import java.util.* ;

//driver class for PairWithGivenSum class 
public class PairWithGivenSumMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//creating object, accessing methods and displaying result
		PairWithGivenSum p = new PairWithGivenSum();
		
		//Taking user input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        boolean result = p.hasPairWithSum(arr, target);

        if (!result) {
            System.out.println("No pair with given sum found.");
        }

        sc.close();


	}

}
