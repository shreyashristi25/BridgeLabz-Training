
import java.util.Scanner;
public class MaxConsecutiveOnes {

    // creating a method findMaxConsecutiveOnes to find maximum consecutive 1s
    public static int findMaxConsecutiveOnes(int [] nums) {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } 
			else {
                count = 0; 
            }
        }
        return maxCount;
    }

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		//Taking user input and displaying result
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements (only 0s and 1s):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive 1s: " + result);

        sc.close();
    }
}
