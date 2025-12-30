
import java.util.* ;
public class SquareOfArray {
	
	//creating method to square each element of a sorted array and displaying the sqaured array in non decreasing form
	
    public static int [] squareArray(int [] array) {
        int n = array.length;
		
		int [] square = new int[n] ;
		for(int i = 0; i< n; i++) {
			square [i] = array[i] * array[i] ;
		}
        
        return square;
    }
	
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in) ;
	
		//Taking user input and displaying result
		System.out.println("Enter the size of the array : ") ;
		int size = sc.nextInt() ;
		
		int [] array = new int[size] ;
		
		System.out.println("Enter the array : ") ;
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt() ;
		}
		
		int [] result =  squareArray(array) ;
		Arrays.sort(result) ;
		System.out.println("The squares of the sorted array are :") ;
		for(int x : result ) {
			System.out.println(x) ;
		}
	}
}
