package com.lambdaexpressions.notificationfiltering;
import java.util.* ;
import java.util.function.* ;

public class NotificationFiltering {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//storing list of alerts in a list
		List<Alert> alerts = new ArrayList<>() ;
		
		alerts.add(new Alert("Critical", "Patient's oxygen level is dropping!" ) ) ;
		alerts.add(new Alert("Normal", "Routine checkup scheduled!" ) ) ;
		alerts.add(new Alert("Reminder", "Medicine time for patient" ) ) ;
		
		//taking user choice as input and displaying notification alerts accordingly
		System.out.println("Notifications available :") ;
		System.out.println("critical/normal/reminder ::") ;
		String choice = sc.nextLine().toLowerCase();
		

		Predicate<Alert> filter ;
		if (choice.equals("critical")) {
            filter = alert -> alert.name.equalsIgnoreCase("Critical");
        } 
		else if (choice.equals("normal")) {
            filter = alert -> alert.name.equalsIgnoreCase("Normal");
        }
		
		else if (choice.equals("reminder")) {
            filter = alert -> alert.name.equalsIgnoreCase("Reminder");
        } 
		else {
            filter = alert -> true; 
        }

		
		System.out.println("---Filtered Notification---") ;
		for(Alert alert : alerts) {
			if(filter.test(alert)) {
				System.out.println(alert) ;
			}
		}
		
		sc.close();
	}

}
