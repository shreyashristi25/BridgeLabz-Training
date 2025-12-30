
import java.util.* ;
class MaxProduct {

	//creating method to check for the maximum product of the two elements in an array
    public static int maxProduct(int [] nums) {
        
        int max1 = nums[0];
        int max2 = nums[0];

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in) ;
		
		//Taking user input and displaying result
		System.out.println("Enter the size of the array :") ;
		int size = sc.nextInt() ;
		
		int [] array = new int[size] ;
		System.out.println("Enter the elements of the array : ") ;
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt() ;
		}
		int result = maxProduct(array) ;
		System.out.println("The maximum product of two elements in the given array is :" +result) ;
	}
}
