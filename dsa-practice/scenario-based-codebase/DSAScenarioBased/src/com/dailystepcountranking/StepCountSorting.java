package com.dailystepcountranking;

public class StepCountSorting {

	//method for bubble sort
	public  void bubbleSort(Person [] arr) {
		for(int i = 0; i < arr.length - 1; i++  ) {
			for(int j = i; j < arr.length - i - 1; j++) {
				if(arr[j].steps < arr[j+1].steps) {
					Person temp = arr[j] ;
					arr[j] = arr[j+1] ;
					arr[j+1] =  temp ;
				} 
			}
		}
	}
}
