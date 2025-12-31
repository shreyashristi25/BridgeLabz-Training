
import java.util.* ;
public class ShuffleArray {

    // creating method to shuffle the array
    public static int [] shuffle(int [] nums, int n) {
        int[] ans = new int[2 * n];  
        int index = 0;

        for (int i = 0; i < n; i++) {
            ans[index++] = nums[i];     
            ans[index++] = nums[i + n]; 
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // getting user input and display result
        System.out.println("Enter the size of the array (even number):");
        int size = sc.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        int n = size / 2;

        int[] result = shuffle(nums, n);

        System.out.println("Shuffled array:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
