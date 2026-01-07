package com.searching.binarysearch;
import java.util.* ;

public class SearchTargetValue {

	//method to find the target element in a 2D matrix
	public static boolean searchTargetElement(int [][]matrix, int  target) {
		int rows = matrix.length;
        if (rows == 0) return false;
        int cols = matrix[0].length;

		int left = 0, right = rows * cols - 1 ; 
		while (left <= right) {
            int mid = (left + right) / 2;

            int row = mid / cols;
            int col = mid % cols;

            int midValue = matrix[row][col];

            if (midValue == target) {
                return true; 
            }
            else if (midValue < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1; 
            }
        }

        return false; 
	}
	
	public static void main(String args []) {
		Scanner sc = new Scanner (System.in) ;
		
		//Taking user input and displaying result
		System.out.println("Enter the number of rows in the matrix : " ) ;
		int rows = sc.nextInt();
		
		System.out.println("Enter the number of columns in the matrix : ") ;
		int cols = sc.nextInt();
		
		int [][] array = new int[rows][cols] ;
		
		System.out.println("Enter the elements of the matrix : ") ;
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the target element : ") ;
		int target = sc.nextInt();
		
		if(searchTargetElement(array, target)) {
			System.out.println("Found") ;
		}
		else {
			System.out.println("Not Found") ;
		}
		
	}
}
