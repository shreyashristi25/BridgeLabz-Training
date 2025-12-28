
import java.util.Scanner;
public class RunningSumArray {

    // creating method runningSum to compute running sum
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        ans[0] = nums[0];

        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] + nums[i];  
        }
        return ans;
    }

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		//Taking user input and displaying result
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int [] nums = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = runningSum(nums);

        System.out.print("Running Sum: ");
        for (int val : result) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}
