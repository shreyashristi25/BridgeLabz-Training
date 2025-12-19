
import java.util.* ;
public class Matrix {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in) ;
		
		System.out.println("Enter the number of rows :") ;
		int rows = input.nextInt() ;
		System.out.println("Enter the number of columns :") ;
		int columns = input.nextInt() ;
		int matrix [][] = new int [rows][columns] ;
		int [] array = new int[rows * columns];
		int index = 0 ;
		
		System.out.println("Enter the elements of matrix") ;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++){
				matrix[i][j] = input.nextInt() ;
				array[index ++] = matrix[i][j] ; 
			}
		}
		System.out.println("The elements of matrix in 1D array are :") ;
		for(int x : array) {
			System.out.println(x) ;
		}
		
		input.close() ;
	}
}