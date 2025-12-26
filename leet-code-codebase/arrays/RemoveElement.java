
import java.util.* ;
class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int count = 0 ;

        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] != val) {
                nums[i - count] = nums[i] ;
            } else {
                count++ ;
            }
        }
        return nums.length - count ;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        
        System.out.print("Enter number of elements: ") ;
        int n = input.nextInt() ;

        int [] nums = new int[n] ;

        System.out.println("Enter array elements:") ;
        for (int i = 0 ; i < n ; i++) {
            nums[i] = input.nextInt() ;
        }

        System.out.print("Enter value to remove: ") ;
        int val = input.nextInt() ;

        int k = removeElement(nums, val) ;

        System.out.println("Number of elements after removal: " + k) ;
        System.out.print("Updated array: ") ;
        for (int i = 0 ; i < k ; i++) {
            System.out.print(nums[i] + " ") ;
        }

        input.close() ;
    }
}

