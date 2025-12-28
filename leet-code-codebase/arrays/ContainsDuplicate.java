
import java.util.Scanner;
public class ContainsDuplicate {

	//creating containsDuplicate to check if an array consists of duplicates
	
    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true; // duplicate found
                }
            }
        }

        return false; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		//Taking user input and displaying result
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        boolean result = containsDuplicate(nums);

        System.out.println("Contains duplicate? " + result);

        sc.close();
    }
}
