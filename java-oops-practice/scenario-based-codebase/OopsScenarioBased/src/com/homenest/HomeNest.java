package com.homenest;
import java.util.* ;
public class HomeNest {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Device> devices = new ArrayList<>();

        //Taking user choice as input, calling methods and displaying results accordingly
        while (true) {
            System.out.println("--- HomeNest Menu ---");
            System.out.println("1. Add Device");
            System.out.println("2. Turn ON Device");
            System.out.println("3. Turn OFF Device");
            System.out.println("4. Reset Device");
            System.out.println("5. Show Energy Usage Report");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Select Device Type: 1.Light 2.Camera 3.Thermostat 4.Lock");
                    int type = sc.nextInt();
                    System.out.print("Enter Device ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Energy Usage: ");
                    double usage = sc.nextDouble();

                    Device d = null;
                    if (type == 1) d = new Light(id, usage);
                    else if (type == 2) d = new Camera(id, usage);
                    else if (type == 3) d = new Thermostat(id, usage);
                    else if (type == 4) d = new Lock(id, usage);

                    if (d != null) devices.add(d);
                    break;

                case 2:
                	System.out.print("Enter Device ID to turn ON: ");
                    id = sc.nextInt();
                    boolean found = false;
                    for (Device dev : devices) {
                        if (dev.getId() == id) {
                            dev.turnOn();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println(" Device ID " + id + " not found.");
                    }
                    break;

                case 3:
                	System.out.print("Enter Device ID to turn OFF: ");
                    id = sc.nextInt();
                    found = false;
                    for (Device dev : devices) {
                        if (dev.getId() == id) {
                            dev.turnOff();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println(" Device ID " + id + " not found.");
                    }
                    break;


                case 4:
                	System.out.print("Enter Device ID to reset: ");
                    id = sc.nextInt();
                    found = false;
                    for (Device dev : devices) {
                        if (dev.getId() == id) {
                            dev.reset();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println(" Device ID " + id + " not found.");
                    }
                    break;

                case 5:
                    double total = 0;
                    System.out.println("--- Energy Usage Report ---");
                    for (Device dev : devices) {
                        System.out.println("Device " + dev.getId() + " [" + dev.getClass().getSimpleName() + "] - Status: " + dev.getStatus() + ", Usage: " + dev.getEnergyUsage());
                        total += dev.getEnergyUsage();
                    }
                    System.out.println("Total Energy Usage: " + total + " units");
                    break;

                case 6:
                    System.out.println("Exiting HomeNest. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

