package com.functionalinterfaces.dateformatutility;
import java.time.* ;
import java.util.* ;

public class InvoiceMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//taking take as user input 
        System.out.println("=== Date Format Utility ===");
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = sc.nextLine();

        LocalDate date = LocalDate.parse(inputDate);

        //taking user choice as input and displaying date in the chosen format
        System.out.println("Choose format:");
        System.out.println("1. ISO (yyyy-MM-dd)");
        System.out.println("2. US (MM-dd-yyyy)");
        System.out.println("3. EU (dd/MM/yyyy)");
        System.out.println("4. Custom pattern");
        System.out.println("Enter your choice  : ") ;
        
        int choice = sc.nextInt();
        sc.nextLine(); 

        String formattedDate = "";

        switch (choice) {
            case 1:
                formattedDate = DateFormatUtility.formatAsISO(date);
                break;
            case 2:
                formattedDate = DateFormatUtility.formatAsUS(date);
                break;
            case 3:
                formattedDate = DateFormatUtility.formatAsEU(date);
                break;
            case 4:
                System.out.print("Enter custom pattern (e.g. EEEE, MMM dd yyyy): ");
                String pattern = sc.nextLine();
                formattedDate = DateFormatUtility.formatDate(date, pattern);
                break;
            default:
                System.out.println("Invalid choice!");
                return ;
                
        }

        System.out.println("Formatted Date: " + formattedDate);

        sc.close();
    }
}

