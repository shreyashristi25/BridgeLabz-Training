package com.tailorshop;
import java.time.LocalDate ;

public class OrdersSort {

	//method to apply insertion sort
	public static void insertionSort(LocalDate [] arr) {
		for( int i = 1; i < arr.length; i++) {
			LocalDate key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].isAfter(key)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
		}
	}
}
