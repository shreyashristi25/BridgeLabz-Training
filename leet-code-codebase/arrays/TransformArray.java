
import java.util.* ;
public class TransformArray {

    // creating a method transformArray to transform array
    public static int[] transformArray(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = 0;
            } 
			else {
                nums[i] = 1;
            }
        }

        Arrays.sort(nums);

        return nums;
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

        int [] result = transformArray(nums);

        System.out.print("Transformed Array: ");
        for (int val : result) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}

