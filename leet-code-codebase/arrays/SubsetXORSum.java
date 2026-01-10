import java.util.* ;

public class SubsetXORSum{
        public static int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }

    
    private static int helper(int[] nums, int index, int currentXor) {
        if (index == nums.length) {
            return currentXor; 
        }
        
        int include = helper(nums, index + 1, currentXor ^ nums[index]);
        int exclude = helper(nums, index + 1, currentXor);
        return include + exclude;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter  the size of the array : ") ;
		int size = sc.nextInt() ;
		
		int[] nums = new int [size];
		System.out.println("Enter the elements of the array : ") ;
		
		for(int i = 0; i < size ;i++ ) {
			nums[i] =  sc.nextInt() ;
		}
		System.out.println("The sum of all XOR totals for every subset of the given array is :") ;
        System.out.println(subsetXORSum(nums));
    }
}