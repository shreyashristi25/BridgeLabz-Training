
import java.util.*;
public class SmallerNumbersThanCurrent {

	//creating method smallerNumbersThanCurrent to check for the numbers namller than the current number in an array
	public static int [] smallerNumbersThanCurrent(int [] nums) {
       int n=nums.length;
       int [] small =  new int[n] ;
    
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				{
					if(i!=j&&nums[j]<nums[i])
                    small[i]++;
			}
		}
      return small;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		
		//getting user input and and checking for the number smaller than the current number in an array
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt(); 
		
		int [] array = new int[size] ;
		System.out.println("Enter the elements of array") ;
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt() ;
		}
		int [] result = smallerNumbersThanCurrent(array) ;
		System.out.println("The array representing the number of elemnts smaller than the current number  :") ;
		
		for (int num : result) {
			System.out.println(num) ;
		}
		
    }
}
