
import java.util.*;
public class SneakyNumbers {

    // creating a method getSneakyNumbers to find numbers that appear more than once
    public static int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums); 

        int [] temp = new int[n];
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                
                if (count == 0 || temp[count - 1] != nums[i]) {
                    temp[count++] = nums[i];
                }
            }
        }

        int[] ans = new int[count];
        for (int i = 0; i < count; i++) {
            ans[i] = temp[i];
        }
        return ans;
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

        int[] result = getSneakyNumbers(nums);

        System.out.print("Sneaky Numbers (duplicates): ");
        for (int val : result) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}
