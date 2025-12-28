
import java.util.Scanner;
public class GoodPairs {

    // creating a method identicalPairs to count identical pairs
    public static int identicalPairs(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {  
                if (nums[i] == nums[j]) {
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

        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = identicalPairs(nums);

        System.out.println("Number of good pairs: " + result);

        sc.close();
    }
}
