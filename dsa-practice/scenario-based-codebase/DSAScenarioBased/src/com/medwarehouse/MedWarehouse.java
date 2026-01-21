package com.medwarehouse;
import java.util.* ;
import java.time.* ;

public class MedWarehouse {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		
		//taking user input for number of medicines and their expiry dates
		System.out.print("Enter number of medicines: ");
        int n = sc.nextInt();
        LocalDate[] expiryDates = new LocalDate[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter expiry date (yyyy-mm-dd) for medicine " + (i + 1) + ": ");
            String dateStr = sc.next();
            expiryDates[i] = LocalDate.parse(dateStr);
        }

        // Sorting expiry dates
        SortMedicines.mergeSort(expiryDates, 0, n - 1);

        // Displaying sorted medicines
        System.out.println("\nSorted Expiry Dates:");
        for (LocalDate d : expiryDates) {
            System.out.println(d);
        }

        // Asking for threshold days for alter and displaying alert message 
        System.out.print("Enter threshold days for alert: ");
        int days = sc.nextInt();
        System.out.println("Medicines expiring within " + days + " days:");
        SortMedicines.alertExpiring(expiryDates, days);



	}

}
