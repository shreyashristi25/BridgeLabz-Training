package com.collections.shoppingcart;
import java.util.* ;

public class ShoppingCart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
	    Cart c = new Cart() ;
	    
	  //taking user input for total number of items and the item names and prices to add to cart
	  System.out.println("Enter total number of items :") ;
	  int n = sc.nextInt( ) ;
	  sc.nextLine() ;
	  		
	  for( int i =0; i < n; i ++) {
		  System.out.println("Enter the name of the item to add into cart : ");
	  	  String item = sc.nextLine();
	  	  
	  	  System.out.println("Enter the price of the item : ") ;
	  	  double price = sc.nextDouble();
	  	  sc.nextLine() ;
	  	  c.addItem(item, price) ;
	  }
	  		
	  //displaying result in sorted and original order
	  c.displaySortedResult() ;
	  System.out.println();
	  c.displayOriginalResult();

	}

}
