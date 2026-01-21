package com.tailorshop;
import java.util.* ;
import java.time.* ;
public class TailorShop {

	public static void main(String args []) {
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter number of orders : ") ;
		int n = sc.nextInt() ;
		sc.nextLine();
		LocalDate [] deadlines = new LocalDate [n] ;
		System.out.println("Enter delivery date (YYYY-MM-DD) : ") ;
		for (int i = 0; i < n; i++) {
            deadlines[i] = LocalDate.parse(sc.nextLine());

        }

        OrdersSort.insertionSort(deadlines);
        System.out.println() ;
        
        System.out.println("Sorted Deadlines:");
        for (LocalDate d : deadlines) {
            System.out.println(d);
        }


	}
}
