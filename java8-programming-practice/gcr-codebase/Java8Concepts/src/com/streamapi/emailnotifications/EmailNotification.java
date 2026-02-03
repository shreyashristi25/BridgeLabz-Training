package com.streamapi.emailnotifications;
import java.util.* ;

public class EmailNotification {

	//method to send notification
	public static void sendNotification(String email) {
		System.out.println("Notification sent to: " + email);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking number of email ids and email id's a s user input 
		List<String> emails = new ArrayList<>() ;
		System.out.println("Enter number of emails  : ") ;
		int n = sc.nextInt() ;
		sc.nextLine( ) ;
		
		System.out.println("Enter email id's : ") ;
		for(int i=0; i <n; i++) {
			String emailId = sc.nextLine();
			emails.add(emailId) ;
		}
		
		//using forEach to send notification
		emails.forEach(email -> sendNotification(email) ) ;

	}

}
