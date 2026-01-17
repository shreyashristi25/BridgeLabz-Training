package com.icecreamrush;
import java.util. * ;

public class IceCreamRush {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		
		//taking user input for flavors of ice cream and their sales 
		String [] flavors = new String[8] ;
		int sales [] = new int[8] ;
		
		for(int i = 0; i < 8; i++) {
			
			System.out.println("Enter the different flavors of IceCream : ") ;
			flavors[i] = sc.nextLine() ;
			
			System.out.println("Enter the sales of IceCream : ") ;
			sales[i] = sc.nextInt();
			
			sc.nextLine();
			
			
		}
		
		//creating object, calling methods and displaying result
		SortingFlavors sf = new SortingFlavors() ;
		sf.bubbleSort(sales, flavors) ;
		
		System.out.println("IceCream flavors sorted according to their sles : ") ;
		
			for (int i = 0; i < sales.length; i++) {
	            System.out.printf("%-15s : %d sales\n", flavors[i], sales[i]);
	        }
		
	}

}
