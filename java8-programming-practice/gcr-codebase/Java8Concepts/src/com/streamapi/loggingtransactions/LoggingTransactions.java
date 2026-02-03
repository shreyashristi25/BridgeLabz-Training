package com.streamapi.loggingtransactions;
import java.util.* ;
import java.time.* ;

public class LoggingTransactions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		List<String> transactionIds = new ArrayList<>() ;
		
		//taking number of transactions as user input 
		System.out.println("Enter numbner of transaction ids : ") ;
		int n = sc.nextInt() ;
		sc.nextLine() ;
		
		for( int i =0; i <n; i++) {
			System.out.println("Enter transaction id " +(i+1) +" : ") ;
			String transactionId = sc.nextLine();
			
			transactionIds.add(transactionId) ;
		}
		
		//printing transaction id's with a time stamp
		transactionIds.forEach(id -> System.out.println(LocalDateTime.now() + "Transaction: " + id));

	}

}
