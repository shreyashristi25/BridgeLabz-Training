
import java.util.Scanner;
public class ThirdMaximum {
    public static int thirdMax(int[] nums) {
        int first = nums[0];
        int second = nums[0];
        int third = nums[0];

        for (int num : nums) {
            
            if (num == first || num == second || num == third) continue;

            if (num > first) {
                third = second;
                second = first;
                first = num;
            } 
			else if (num > second) {
                third = second;
                second = num;
            }
			else if (num > third) {
                third = num;
            }
        }

        return (third == nums[0]) ? (int) first : (int) third;
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

        int result = thirdMax(nums);

        System.out.println("Third maximum (or maximum if not exists): " + result);

        sc.close();
    }
}
