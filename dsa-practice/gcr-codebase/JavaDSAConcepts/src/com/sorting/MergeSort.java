package com.sorting;
import java.util.* ;

public class MergeSort {

	//creating a method to merge
    public static void merge(int [] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int [] L = new int[n1];
        int [] R = new int[n2];

        // Copying data
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // Merging temp arrays back
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copying remaining elements
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    //Applying merge sort algo
    public static void mergeSort(int[] arr, int n) {
        for (int currSize = 1; currSize < n; currSize *= 2) {
            for (int leftStart = 0; leftStart < n - 1; leftStart += 2 * currSize) {
                int mid = Math.min(leftStart + currSize - 1, n - 1);
                int rightEnd = Math.min(leftStart + 2 * currSize - 1, n - 1);
                merge(arr, leftStart, mid, rightEnd);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //getting user input and displaying result
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        int [] prices = new int[n];
        System.out.println("Enter book prices:");
       
        for (int i = 0; i < n; i++) prices[i] = sc.nextInt();

        mergeSort(prices, n);

        System.out.println("Sorted Book Prices (Ascending):");
        for (int price : prices) System.out.print(price + " ");
    }

}
