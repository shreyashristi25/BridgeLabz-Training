/*Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.*/

import java.util.* ;
public class DiscountDashboard {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in) ;
		
		//dispalying the list of items and getting user choice
		System.out.println("-----List of Stationary items-----") ;
		System.out.println() ;
		System.out.println("1. Flair Write More Kit\t\t\t₹145");
        System.out.println("2. Apsara Scholars Kit\t\t\t₹99");
        System.out.println("3. Kaco Pure Assorted Colour Gel Pens\t₹199");
        System.out.println("4. Notebook (100–200 pages)\t\t₹55");
        System.out.println("5. Pastel Sticky Notes\t\t\t₹120");
        System.out.println("6. Markers/Highlighters\t\t\t₹100");
        System.out.println("7. Scissors\t\t\t\t₹99");
        System.out.println("8. Colour Pencils (12–24 shades)\t₹107");
        System.out.println("9. Glue stick/Fevicol\t\t\t₹70");
        System.out.println("10. Ruler\t\t\t\t₹50");
	
		System.out.println() ;
		System.out.println("If the item's price is above 150 you will get a 10% discount") ;
		System.out.println("If the item's price is above 100 you will get a 5% discount") ;
		
		//storing the prices of items in an array and computing the total bill
		int[] prices = {145, 99, 199, 55, 120, 100, 99, 107, 70, 50};

		double total = 0;
        while (true) {
            System.out.print("Enter item number(Enter 0 to exit !): ");
            int choice = sc.nextInt();

            if (choice == 0) break; 
            if (choice >= 1 && choice <= 10) {
                total += prices[choice - 1]; 
                System.out.println("Item added! Current total: ₹" + total);
            } else {
                System.out.println("Invalid choice, try again.");
            }
        }
		double discount = 0.0 ;
		if(total >= 150) {
			discount = 0.1 ;
		}
		else if(total >= 100 ) {
			discount = 0.5 ;
		}
		double finalBill = total - discount*total ;
		
		//displaying computed bill with total amount, discount applied and final amount
		System.out.println ("------BILL------") ;
		System.out.println("Total price\t\t: ₹" + total);
		System.out.println("Discount availed\t: " + (discount * 100) + "%");
		System.out.println("Discounted Amount\t: ₹" + discount);
		System.out.println("Final Amount\t\t: ₹" + finalBill);

		System.out.println() ;
		System.out.println("-----Thank you for shopping :)-----");
		System.out.println("(: Please visit Again :)") ;

		
	}
}