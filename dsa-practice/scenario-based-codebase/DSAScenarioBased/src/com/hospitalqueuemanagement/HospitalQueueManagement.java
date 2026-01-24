package com.hospitalqueuemanagement;
import java.util.* ;

public class HospitalQueueManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		QueueManagement patient = new QueueManagement() ;
		

		//taking user choice as input and displaying result accordingly
		while (true) {
            System.out.println("--- Online Ticket Booking ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Discharge Patient");
            System.out.println("3. Show Patients");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = sc.next();
                    
                    System.out.print("Enter arrival time (according to 24hr clock): ");
                    int time = sc.nextInt();
                    
                    patient.register(name, time);
                    
                    break;
                case 2:
                    System.out.print("Enter time to discharge (according to 24hr clock) : ");
                    int arrivalTime = sc.nextInt();
                    patient.discharge(arrivalTime);
                    break;
                case 3:
                	if(patient != null) {
                		patient.showPatients();
                	}
                	else {
                		System.out.println("No Patient in Queue !") ;
                	}
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }


	}

}
