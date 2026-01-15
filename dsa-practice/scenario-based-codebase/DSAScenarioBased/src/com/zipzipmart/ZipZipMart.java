package com.zipzipmart;
import java.util.* ;

//driver class for all the classes of ZipZipMart
public class ZipZipMart {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input for number of sales and sales details
		System.out.println("Enter the number of sales record : ") ;
		int n = sc.nextInt() ;
		sc.nextLine();
		
		 Sale [] sales = new Sale[n];

	        for (int i = 0; i < n; i++) {
	            System.out.println("Enter details for Sale " + (i + 1));
	            System.out.print("Branch: ");
	            String branch = sc.nextLine();

	            System.out.print("Date (dd-mm-yyyy): ");
	            String date = sc.nextLine();

	            System.out.print("Amount: ");
	            int amount = sc.nextInt();
	            sc.nextLine(); 

	            sales[i] = new Sale(branch, date, amount);
	        }

	        // Sorting using Merge Sort
	        MergeSort.mergeSort(sales, 0, n - 1);

	        // Displaying  Report
	        System.out.println("=== ZipZipMart Daily Sales Summary Report ===");
	        System.out.println("Branch\t | Date\t       | Amount");
	        System.out.println("--------------------------------");
	        for (Sale s : sales) {
	            System.out.println(s);
	        }

	        sc.close();
	    
	}	
	
}
	

