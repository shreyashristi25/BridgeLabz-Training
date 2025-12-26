
import java.util.*;
class SearchInsert {

    //creating a method searchInsert to search for the index to insert the target element in a sorted array
    public static int searchInsert(int[] nums, int target) {
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            if (nums[i] == target) {
                return i;
            } else {
                if (target < nums[i]) {
                    return i;
                }
            }
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int [] nums = new int[n];
		
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        int result = searchInsert(nums, target);

        System.out.println("Result for Search Insert Position: " + result);

        sc.close();
    }
}
