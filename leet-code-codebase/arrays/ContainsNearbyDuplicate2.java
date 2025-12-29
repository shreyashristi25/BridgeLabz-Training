
import java.util.* ;
public class ContainsNearbyDuplicate2 {

	//creating method containsNearbyDuplicate to check for duplicates
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    return true;
                }
            }
        }
        return false;
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

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        boolean result = containsNearbyDuplicate(nums, k);
        System.out.println("Result: " + result);

        sc.close();

    }
}
