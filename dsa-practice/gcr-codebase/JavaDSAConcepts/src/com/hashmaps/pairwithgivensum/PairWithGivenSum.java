package com.hashmaps.pairwithgivensum;
import java.util.* ;

public class PairWithGivenSum {

	//method to  find if there exists a pair of elements whose sum is equal to the target.
	
	public static boolean hasPairWithSum(int [] arr, int target) {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                System.out.println("Pair found: (" + num + ", " + complement + ")");
                return true;
            }
            seen.add(num);
        }
        return false;
    }

}
