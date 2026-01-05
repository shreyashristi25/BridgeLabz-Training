package com.sorting;
import java.util.* ;

public class QuickSort {

	// Partition method for quick sort
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; 
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // placing the pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


    // method to implement quickSort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //getting user input and displaying result
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter product prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        quickSort(prices, 0, n - 1);

        System.out.println("Sorted Product Prices (Ascending):");
        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
	
}
