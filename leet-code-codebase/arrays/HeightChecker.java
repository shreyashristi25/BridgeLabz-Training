
import java.util.* ;
public class HeightChecker {
	
	//creating method to chcek if the expected height is equal to the height of the student at ith position
	
    public static int heightChecker(int [] height, int [] expected) {
        int n = height.length;
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(height[i] != expected[i]) {
				count++ ;
			}
		}
		return count ;
    }
	
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in) ;
	
		//Taking user input and displaying result
		System.out.println("Enter the number of student in the queue : ") ;
		int num = sc.nextInt() ;
		
		int [] height = new int[num] ;
		
		System.out.println("Enter the height of students : ") ;
		for(int i = 0; i < num; i++) {
			height[i] = sc.nextInt() ;
		}
		
		int [] expected = new int[num] ;
		System.out.println("Enter the expected height of students : ") ;
		for(int i = 0; i < num; i++) {
			expected[i] = sc.nextInt() ;
		}
		int result = heightChecker(height, expected) ;
		
		System.out.println("The number of students that are not standing as per expected are :" +result) ;
	}
}
