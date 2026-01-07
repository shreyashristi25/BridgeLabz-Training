package com.runtimeanalysisofalgo;
import java.util.* ;
public class SortingLargeData {

	// Sorting using bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; 
        }
    }


    // Sorting using merge sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int [] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int [] L = new int[n1];
        int [] R = new int[n2];

        for (int i = 0; i < n1; i++) {
        	L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
        	R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
            	arr[k++] = L[i++];
            }
            else {
            	arr[k++] = R[j++];
            }
        }
        while (i < n1) {
        	arr[k++] = L[i++];
        }
        while (j < n2) {
        	arr[k++] = R[j++];
        }
    }

    // Sorting using quick sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
               
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }


    // creating a benchmark to compare all other sorting algorithms
    public static void benchmarkSort(String name, int[] arr, Runnable sortMethod) {
        int [] copy = Arrays.copyOf(arr, arr.length);
        long start = System.nanoTime();
        sortMethod.run();
        long end = System.nanoTime();
        double timeMs = (end - start) / 1_000_000.0;
        System.out.println(name + " Time: " + timeMs + " ms");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Taking dataset size from user and generating random dataset
        System.out.print("Enter dataset size (e.g., 1000, 10000, 100000): ");
        int n = sc.nextInt();

        int [] dataset = new int[n];
        for (int i = 0; i < n; i++) {
            dataset[i] = random.nextInt(n * 10);
        }

        System.out.println("Dataset Size: " + n);

        // checking for bubble sort
        int[] bubbleCopy = Arrays.copyOf(dataset, dataset.length);
        long startBubble = System.nanoTime();
        bubbleSort(bubbleCopy);
        long endBubble = System.nanoTime();
        System.out.println("Bubble Sort Time: " + (endBubble - startBubble) / 1_000_000.0 + " ms");

        // checking for merge sort
        int[] mergeCopy = Arrays.copyOf(dataset, dataset.length);
        long startMerge = System.nanoTime();
        mergeSort(mergeCopy, 0, mergeCopy.length - 1);
        long endMerge = System.nanoTime();
        System.out.println("Merge Sort Time: " + (endMerge - startMerge) / 1_000_000.0 + " ms");


        // checking for quick sort
        int[] quickCopy = Arrays.copyOf(dataset, dataset.length);
        long startQuick = System.nanoTime();
        quickSort(quickCopy, 0, quickCopy.length - 1);
        long endQuick = System.nanoTime();
        System.out.println("Quick Sort Time: " + (endQuick - startQuick) / 1_000_000.0 + " ms");
    }


	
}
