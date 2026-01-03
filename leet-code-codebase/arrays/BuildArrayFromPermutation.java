
import java.util.* ;
public class BuildArrayFromPermutation {
	
	public static int [] buildArray(int [] nums) {
        
		int n =  nums.length ;
		int [] ans = new int[n] ;
		for(int i = 0; i < n; i++ ) {
			ans [i] = nums[nums[i]] ;
		}
		return ans ;
    }
	
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter the size of the array  :") ;
		int n =  sc.nextInt() ;
		
		System.out.println("Enter the elements of array :") ;
		int [] array = new int[n] ;
		
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt() ;
		}
		int [] result = buildArray(array);

		System.out.println("The array from permutation is  :") ;
		for(int x : result) {
			System.out.println(x) ;
		}
	}
}