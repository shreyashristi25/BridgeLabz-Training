package com.payxpress;
import java.util.* ;
import java.time.* ;
import java.time.format.DateTimeFormatter;

//driver class for other classes in PayXpress

public class PayXpress {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input for bill type, bill amount and due date
		System.out.println("Enter the type of Bill (Electricity/Internet/Water) : ") ;
		String type = sc.next();
		
		System.out.println("Enter the Bill amount : ") ;
		double amount = sc.nextDouble();
		
		System.out.println("Enter due date (dd-MM-yyyy): ");
        String dueDateString = sc.next();  
        
        LocalDate dueDate = LocalDate.parse(dueDateString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        //Displaying result on the basis of user choice
        Bill bill = null ;
        switch(type.toLowerCase()) {
        	
        case "electricity" :
        	bill = new ElectricityBill(amount, dueDate) ;
        	break ;
        case "water":
            bill = new WaterBill(amount, dueDate);
            break;
        case "internet":
            bill = new InternetBill(amount, dueDate);
            break;
        default:
            System.out.println("Invalid bill type!");
            return ;
	
   		}
        
        //taking penalty as user input and displaying the bill
        System.out.println("Enter penalty amount (if any): ");
        double penalty = sc.nextDouble();

        double totalPayable = bill.calculateLateFees(penalty);

        System.out.println("--- Bill Summary ---");
        System.out.println("Base Amount : " + amount);
        System.out.println("Penalty     : " + penalty);
        System.out.println("Total Due   : " + totalPayable);
        System.out.println("--------------------");

        bill.sendReminder();
        bill.pay();

        System.out.println(bill.getDetails());

        sc.close();

        
	}

}
