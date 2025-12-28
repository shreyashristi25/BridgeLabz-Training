
import java.util.Scanner;
public class CountPairs {

    // creating a method to count pairs with sum < target
    public static int countPairs(int[] nums, int target) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if ((nums[i] + nums[j]) < target) {
                    count++;
                }
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input and displaying result
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int [] nums = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        int result = countPairs(nums, target);

        System.out.println("Number of pairs with sum < target: " + result);

        sc.close();
    }
}

