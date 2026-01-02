
import java.util.* ;
public class TransfromArray {

	//method to transform array (even -> 0, odd -> 1)
    public static int [] transformArray(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0)
                nums[i] = 0;
            else
                nums[i] = 1;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        return nums;
    }

	public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in) ;

		//Taking user input and displaying result
		System.out.println("Enter the size of the array :") ;
		int n = sc.nextInt() ;
		
		System.out.println("Enter the elements of array :") ;
        int [] nums = new int[n];
		
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt() ; 
		}

        int[] result = transformArray(nums);

        System.out.print("Transformed and sorted array: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
