
import java.util.Scanner;
public class LeftRightDifference {

    // creating a method leftRightDifference to compute left-right difference
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int [] leftSum = new int[n];
        int [] rightSum = new int[n];
        int [] answer = new int[n];

        leftSum[0] = 0;
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }

        rightSum[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return answer;
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		//Taking user input and displaying result
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = leftRightDifference(nums);

        System.out.print("Left-Right Difference Array: ");
        for (int val : result) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}


