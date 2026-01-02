
import java.util.* ;
public class ComputeAlternatingSum {
	
	public static int computeAlternativeSum(int [] nums) {
		int n = nums.length ;
		
		int evenSum = 0 ;
		int oddSum = 0 ;
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				evenSum += nums[i] ;
			}
			else {
				oddSum += nums [i] ; 
			}
		}
		return evenSum - oddSum ;
	}
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter the size of the array : ") ;
		int size = sc.nextInt() ;
		
		int [] array = new int [size] ; 
		System.out.println("Enter the elements of array : ") ;
		for(int i = 0; i < size ; i++) {
			array [i ] = sc.nextInt() ;
		}
		int result = computeAlternativeSum(array) ;
		System.out.println("The Alternative sum of the array is :" +result) ;
	}
	
}