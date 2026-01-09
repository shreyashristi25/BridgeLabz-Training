package com.artify;
import java.util.* ;

public class Artify {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        // Creating user 
        System.out.print("Enter your name: ");
        String userName = sc.nextLine();
        
        System.out.print("Enter starting wallet balance: ");
        double balance = sc.nextDouble();
        
        sc.nextLine(); // consume newline

        User buyer = new User(userName, balance);

        //taking number of artworks to add and artwork details as user input
        System.out.print("How many artworks do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Artwork [] artworks = new Artwork[n];

        for(int i=0; i<n; i++) {
            System.out.println("Enter details for artwork " + (i+1));
            System.out.print("Title: ");
            String title = sc.nextLine();
            
            System.out.print("Artist: ");
            String artist = sc.nextLine();
            
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            System.out.print("License Type: ");
            String license = sc.nextLine();
            
            System.out.print("Type (1=Digital, 2=Print): ");
            int type = sc.nextInt();
            sc.nextLine(); 

            if(type == 1) {
                artworks[i] = new DigitalArt(title, artist, price, license);
            } 
            else {
                artworks[i] = new PrintArt(title, artist, price, license);
            }
        }

        //Taking user choice and displaying result accordingly
        int choice;
        do {
            System.out.println("--- Artify Marketplace ---");
            System.out.println("1. View Artworks");
            System.out.println("2. Purchase Artwork");
            System.out.println("3. View Wallet Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Available Artworks:");
                    for(int i=0; i<artworks.length; i++) {
                        System.out.println((i+1) + ". " + artworks[i]);
                    }
                    break;

                case 2:
                    System.out.print("Enter artwork number to purchase: ");
                    int artChoice = sc.nextInt();
                    
                    if(artChoice >= 1 && artChoice <= artworks.length) {
                        Artwork art = artworks[artChoice-1];
                        art.purchase(buyer);
                        art.license();
                    }
                    else {
                        System.out.println("Invalid choice!");
                    }
                    break;

                case 3:
                    buyer.showBalance();
                    break;

                case 4:
                    System.out.println("Exiting Artify... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        }
        while(choice != 4);


        sc.close();
	}
}
