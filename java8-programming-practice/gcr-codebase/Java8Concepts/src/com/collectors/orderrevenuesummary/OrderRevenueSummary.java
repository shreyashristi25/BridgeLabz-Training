package com.collectors.orderrevenuesummary;
import java.util.* ;
import java.util.stream.Collectors;

public class OrderRevenueSummary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		List<Order> orders = new ArrayList<>() ;
		
		//taking number of orders and order details from user as input 
		System.out.println("Enter number of orders  : ") ;
		int n = sc.nextInt() ;
		sc.nextLine() ;
		
		for( int i =0; i < n; i ++) {
			System.out.println("Enter customer details for order " +(i+1) +" : ") ;
			System.out.println("Enter customer name  : ") ;
			String name = sc.nextLine() ;
			
			System.out.println("Enter Order total : ") ;
			double total = sc.nextDouble() ;
			sc.nextLine();
			
			orders.add(new Order(name, total)) ;
		}
		//summing order totals for each customer 
		
		Map<String , Double> revenue = orders.stream()
				.collect(Collectors.groupingBy(Order :: getCustomer, Collectors.summingDouble(Order :: getTotal))) ;

		//displaying result
		System.out.println("Order revenue ummary : ") ;
		revenue.forEach((name, total)-> System.out.println(name +" -> $" +total)) ;
	}

}
