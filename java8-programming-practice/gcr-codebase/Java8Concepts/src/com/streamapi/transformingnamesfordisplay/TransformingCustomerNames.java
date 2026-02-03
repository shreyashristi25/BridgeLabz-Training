package com.streamapi.transformingnamesfordisplay;
import java.util.* ;

public class TransformingCustomerNames {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking number of customers and their name as user input 
		List<String> names = new ArrayList<>() ;
		System.out.println("Enter the number of customers : ") ;
		int n = sc.nextInt() ;
		sc.nextLine() ;
		
		for(int i =0; i <n; i++) {
			System.out.println("Enter names of the customers : ") ;
			String name = sc.nextLine() ;
			
			names.add(name) ;
		}
		
		//displaying names in upper case
		names.stream().map(x->x.toUpperCase()).sorted().forEach(System.out :: println);
		

	}

}
