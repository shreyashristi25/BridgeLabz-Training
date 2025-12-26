
import java.util.* ;
public class RemoveDuplicates {

    // creating a method removeDuplicates to remove duplicates from a sorted array
    public static int removeDuplicates(int [] nums) {
        if (nums.length == 0) return 0 ;

        int i = 0 ;
        for (int j = 1 ; j < nums.length ; j++) {
            if (nums[j] != nums[i]) {
                i++ ;
                nums[i] = nums[j] ;
            }
        }
        return i + 1 ;
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in) ;

		//Taking user input, calling function and displaying result
        System.out.print("Enter the size of the array: ") ;
        int size = input.nextInt() ;

        int [] array = new int[size] ;

        System.out.println("Enter the array elements (sorted): ") ;
        for (int i = 0 ; i < size ; i++) {
            array[i] = input.nextInt() ;
        }

        int newLength = removeDuplicates(array) ;

        System.out.println("Array after removing duplicates:") ;
        for (int i = 0 ; i < newLength ; i++) {
            System.out.print(array[i] + " ") ;
        }

        System.out.println("New length: " + newLength) ;
        
		input.close() ;
    }
}
