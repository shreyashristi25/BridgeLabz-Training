package day1practice;
import java.util.* ;

//driver class for all the above classes in bank management system
public class BankMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in) ;
		//creating objects of all the classes, accessing methods based on user's choice
		System.out.println("Enter your Account Type for which you want to display information :") ;
		System.out.println("1.Savings Account") ;
		System.out.println("2.Current Account") ;
		System.out.println("Enter your choice :") ;
		int choice = sc.nextInt();
		
		//displaying result as per user choice
		switch (choice) {
			case 1:
				System.out.println("Displaying result for Savings account : ") ;
				System.out.println();
				SavingsAccount savings = new SavingsAccount("200222", 1000, 5);
				savings.deposit(500);   
				savings.withdraw(200);
				savings.displayAccountInfo();
				savings.displayAccountType();
				break ;
			
			case 2 :
				System.out.println();
				System.out.println("Displaying result for Current account : ") ;
				System.out.println();
				CurrentAccount current = new CurrentAccount("300003", 300, 500);
				current.deposit(400);
				current.withdraw(600);  
				current.displayAccountInfo();
				current.displayAccountType();
				break ;
		}


	}

}
