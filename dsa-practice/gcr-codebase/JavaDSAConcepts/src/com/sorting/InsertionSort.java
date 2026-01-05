package com.sorting;
import java.util.* ;
public class InsertionSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in) ;
		
		//Taking user input and displaying result
		System.out.println("Enter the number of elements :") ;
		int n = sc.nextInt() ;
		
		int [] emp = new int[n] ;
 		System.out.println("Enter the elements :") ;
		for(int i = 0; i < n; i ++) {
			emp[i] =  sc.nextInt();
		}
		
		// Applying Insertion Sort
        for (int i = 1; i < n; i++) {
            int key = emp[i];
            int j = i - 1;

            while (j >= 0 && emp[j] > key) {
                emp[j + 1] = emp[j];
                j--;
            }
            emp[j + 1] = key;
        }

        System.out.println("Sorted Employee IDs :");
        for (int id : emp) {
            System.out.print(id + " ");
        }

	}
}
