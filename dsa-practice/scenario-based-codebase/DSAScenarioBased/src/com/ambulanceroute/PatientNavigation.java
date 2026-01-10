package com.ambulanceroute;
import java.util. * ;
public class PatientNavigation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        AmbulanceRoute route = new AmbulanceRoute();
        boolean running = true;

        //taking user choice as input, calling methods and displaying results accordingly 
        while (running) {
            System.out.println("--- AmbulanceRoute Menu ---");
            System.out.println("1. Add Unit");
            System.out.println("2. Remove Unit");
            System.out.println("3. Set Availability");
            System.out.println("4. Redirect Patient");
            System.out.println("5. Show Route");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter unit name: ");
                    String unit = sc.nextLine();
                    route.addUnit(unit);
                    break;

                case 2:
                    System.out.print("Enter unit name to remove: ");
                    String removeUnit = sc.nextLine();
                    route.removeUnit(removeUnit);
                    break;

                case 3:
                    System.out.print("Enter unit name: ");
                    String availUnit = sc.nextLine();
                    System.out.print("Enter availability (true/false): ");
                    boolean status = sc.nextBoolean();
                    route.setAvailability(availUnit, status);
                    break;

                case 4:
                    route.redirectPatient();
                    break;

                case 5:
                    route.showRoute();
                    break;

                case 6:
                    running = false;
                    System.out.println("👋 Exiting AmbulanceRoute...");
                    break;

                default:
                    System.out.println("⚠ Invalid choice!");
            }
        }
        sc.close();

	}

}
