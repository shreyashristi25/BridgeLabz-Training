package com.methodreferences.invoicecreation;
import java.util.* ;
import java.util.function.* ;

public class InvoiceObjectCreation {

	public static void main(String args []) {
		Scanner sc = new Scanner(System.in) ;
		
		List<String> transactionIds = new ArrayList<>() ;
		
		//taking user input for number of transactions and their ids
		
		System.out.println("Enter number of Transactions : " ) ;
		int n = sc.nextInt();
		sc.nextLine();
		
		for( int i =0; i <n;i ++) {
			System.out.println("Enter  transaction IDs : ") ;
			String id = sc.nextLine(); 
			transactionIds.add(id) ;
		}
		
		//using Function functional interface to convert String into objects
		Function<String, Invoice> invoiceCreator = Invoice :: new ;
		
		List<Invoice> invoices = new ArrayList<>() ;
		for(String id : transactionIds) {
			invoices.add(invoiceCreator.apply(id)) ;
		}
		
		//displaying invoice
		System.out.println("----- Generated Invoice------") ;
		invoices.forEach(System.out :: println);
		
		sc.close();
	}
}
