package com.productsorting;
import java.util.* ;

public class FlashDealz {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;

		//taking user input for number of products and product details
		System.out.println("Enter the number of products : ") ;
		int n = sc.nextInt() ;
		sc.nextLine() ;
		
		Product [] products = new Product[n] ;
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Enter the name of the product : ") ;
			String name = sc.nextLine();
		
			System.out.println("Enter the discount percentage on the product : ") ;
			int discount = sc.nextInt();
			sc.nextLine();
			
			products[i] = new Product(name, discount) ; 
			
		}
		
		//creating sorter as object of ProductSorting class, calling method and displaying result accordingly
		ProductSorting sorter = new ProductSorting() ;
		sorter.quickSort(products,  0,  products.length - 1);
		
		System.out.println("=== Products Sorted by Discount Percentage ===") ;
		for(Product p : products) {
			System.out.println(p.name +" - " +p.discount +"%") ;
		}
		
		sc.close();
		
	}

}
