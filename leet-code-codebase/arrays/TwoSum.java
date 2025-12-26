
import java.util.Arrays ;
import java.util.* ;

class TwoSum {

    // method to find two indices whose sum equals target
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0 ; i < nums.length ; i++) {
            for (int j = i + 1 ; j < nums.length ; j++) {

                if (nums[i] + nums[j] == target) {
                    int [] ans = new int[2] ;
                    ans [0] = i ;
                    ans [1] = j ;
                    return ans ;
                }
            }
        }
        return new int[0] ;
    }

    public static void main(String[] args) {

		//Taking user input to check for the indices whose sum is equal to the target
        Scanner input = new Scanner(System.in) ;
        TwoSum obj = new TwoSum() ;

        System.out.println("Enter the size of the array:") ;
        int size = input.nextInt() ;

        System.out.println("Enter the array elements:") ;
        int [] nums = new int[size] ;
        for (int i = 0 ; i < size ; i++) {
            nums[i] = input.nextInt() ;
        }

        System.out.println("Enter the target:") ;
        int target = input.nextInt() ;

        int [] result = twoSum(nums, target) ;

        if (result.length == 0) {
            System.out.println("No two sum solution found.") ;
        } else {
            System.out.println("Indices: " + Arrays.toString(result)) ;
            System.out.println("Values: " + nums[result[0]] + " + " + nums[result[1]]) ;
        }

        input.close() ;
    }
}


