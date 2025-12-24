
import java.util.* ;
public class CoffeeShop {
	public static void main(String args []) {
		Scanner input = new Scanner(System.in) ;
		
		System.out.println("Types of coffees and their prices : ") ;
		System.out.println("1. Latte       ₹140") ;
		System.out.println("2. Cappuccino  ₹150") ;
		System.out.println("3. Flat White  ₹200") ;
		System.out.println("4. Mocha       ₹160") ;
		System.out.println("5. Ristretto   ₹150") ;
		System.out.println("6. Doppio      ₹120") ;
		System.out.println("7. Exit ") ;
		System.out.println() ;
	
		int price = 0 ;	
		int quantity = 0 ; 
		double totalBill = 0.0 ;
	
        while (true) {
			System.out.println("Enter your choice of coffee (or type 'exit' to quit):");
			String choice = input.next();

			if (choice.equalsIgnoreCase("exit")) {
				System.out.println("Exiting... Thank you!");
				System.out.println("Please visit again!");
				System.out.println("Your FINAL total bill including GST: ₹" + totalBill);
				break;
			}

		switch(choice) {
			case "Latte" : 
				System.out.println("Enter qualtity :") ;
				quantity = input.nextInt() ;
				price = 140 ;
				break ;
			
			case "Cappuccino" : 
				System.out.println("Enter qualtity :") ;
				quantity = input.nextInt() ;
				price = 150 ;
				break ;
			
			case "Flat White" : 
				System.out.println("Enter qualtity :") ;
				quantity = input.nextInt() ;
				price = 200 ;
				break ;
			
			case "Mocha" : 
				System.out.println("Enter qualtity :") ;
				quantity = input.nextInt() ;
				price = 160 ;
				break ;
			
			case "Ristretto" : 
				System.out.println("Enter qualtity :") ;
				quantity = input.nextInt() ;
				price =  150 ;
				break ;
			
			case "Doppio" : 
				System.out.println("Enter qualtity :") ;
				quantity = input.nextInt() ;
				price = 120 ;
				break ;
			
			case "exit": 
                System.out.println("Exiting... Thank you!");
				System.out.println("Please visit again!") ;
                input.close();
                return;
            
            default: 
                System.out.println("Invalid choice!");
                input.close();
                return;
            }
        
        double bill = quantity * price;
        double gst = bill * 0.05;
        bill = bill + gst;

        totalBill += bill;  

        System.out.println("Your order: " + choice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Bill for this order (including GST): ₹" + bill);
        System.out.println("Running total bill: ₹" + totalBill);
        System.out.println();
       }

	  input.close() ;
	}
}