
import java.util.Scanner;
public class SingleNumber {

    public static int singleNumber(int [] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            boolean isUnique = true;

            for (int j = 0; j < n; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                return nums[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int [] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = singleNumber(nums);

        System.out.println("Single Number is: " + result);

        sc.close();
    }
}
