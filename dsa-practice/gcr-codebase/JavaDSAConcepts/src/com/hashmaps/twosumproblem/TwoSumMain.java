package com.hashmaps.twosumproblem;
import java.util.* ;

//driver class for TwoSum class
public class TwoSumMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Taking user input, accessing methods and displaying result
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();
        
       //creating object of TwoSum class
      	TwoSum ts = new TwoSum() ;
      	int [] result = ts.findTwoSum(nums, target);

        
        if (result == null) {
            System.out.println("No pair found.");
        } else {
            System.out.println("Pair indices: " + result[0] + " and " + result[1]);
            System.out.println("Pair values: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        }

        sc.close();


	}

}
