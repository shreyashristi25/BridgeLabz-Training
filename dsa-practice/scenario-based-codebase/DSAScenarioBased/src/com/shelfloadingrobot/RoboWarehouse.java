package com.shelfloadingrobot;
import java.util.* ;

public class RoboWarehouse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking input for number of packages and their weights
		System.out.println("Enter the number of packages :  ") ;
		int n = sc.nextInt();
		
		System.out.println("Enter the weight of the paclages : ") ;
		int [] weight = new int[n];
		
		for(int i = 0; i < n; i++) {
			weight[i] = sc.nextInt();
		}
		
		//creating InsertionSort object, calling function and displaying result
		InsertionSort in = new InsertionSort() ;
		in.insertionSort(weight);
		
		System.out.println("Weight in ascending order : ") ;
		for(int x : weight) {
			System.out.println(x) ;
		}

	}

}
