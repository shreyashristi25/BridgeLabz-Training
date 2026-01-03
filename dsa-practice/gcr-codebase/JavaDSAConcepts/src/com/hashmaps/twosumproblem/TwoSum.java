package com.hashmaps.twosumproblem;
import java.util.* ;
public class TwoSum {

	//method to find two indices such that their values add up to the target
	public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return null;

	}
}
