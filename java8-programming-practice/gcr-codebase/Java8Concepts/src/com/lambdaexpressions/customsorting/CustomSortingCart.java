package com.lambdaexpressions.customsorting;
import java.util.* ;

public class CustomSortingCart {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		
		List<Product> products = new ArrayList<>() ;
		
		//storing products in list 
		products.add(new Product("Laptop", 65000, 4.5, 10 )) ;
		products.add(new Product("Mobile", 25000, 4.4, 20 )) ;
		products.add(new Product("Tablet", 20000, 3.6, 8 )) ;
		products.add(new Product("Charger", 5000, 4.1, 30 )) ;
		products.add(new Product("Cable", 500, 4.2, 15 )) ;
		
		//taking user choice as input and displaying sorted results accordingly
		while(true) {
		System.out.println("1. Products Sorted by their name in ascending.") ;
		System.out.println("2. Products Sorted by their price in ascending.") ;
		System.out.println("3. Products Sorted by their rating in ascending.") ;
		System.out.println("4. Products Sorted by discount percent in ascending.") ;
		System.out.println("5. Exit") ;
		System.out.println("Enter your choice : ") ;
		int choice = sc.nextInt() ;
		
		Comparator<Product> comparator ;
		switch(choice) {
		
			case 1 :
				comparator = (p1, p2) -> p1.name.compareTo(p2.name) ;
				break ;
			case 2 :
				comparator = (p1, p2) -> Double.compare(p1.price, p2.price) ;
				break ;
				
			case 3 :
				comparator = (p1, p2) -> Double.compare(p1.rating, p2.rating) ;
				break ;
			
			case 4 :
				comparator = (p1, p2) -> Double.compare(p1.discount, p2.discount) ;
				break ;
				
			case 5 :
				System.out.println("Exiting....") ;
				return ;
			default :
				System.out.println("Invalid Choice!") ;
				continue ;
				
		}
		
		products.sort(comparator);

        System.out.println("=== Sorted Products ===");
        for (Product product : products) {
            System.out.println(product);
        }
	}
		
	}

}
