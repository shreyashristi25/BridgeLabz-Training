package com.gamebox;
import java.util.* ;

public class GameBox {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user's detail as input
		System.out.println("Enter your user name : ") ;
		String name = sc.nextLine();
		
		System.out.println("Enter the gaem type (Arcade/Strategy) : ") ;
		String type = sc.nextLine();
		
		//taking game's detail as input
		System.out.println("Enter the title of the game : ") ;
		String title = sc.nextLine();
		
		System.out.println("Is the game free (Yes / No) : ") ;
		String free = sc.next();
		
		Game g ;
		
		//checking for game type and taking user input for rating and displaying result accordingly
		if(type.equalsIgnoreCase("Arcade")) {
			if(free.equalsIgnoreCase("Yes")) {
				System.out.print("Enter rating : ");
                double rating = sc.nextDouble();
                g = new ArcadeGame(title, rating);

			}
			else {
				System.out.println("Enter the price : ") ;
				double price = sc.nextDouble() ;
				
				System.out.println("Enter rating : ") ;
				double rating = sc.nextDouble() ;
				
				g = new ArcadeGame(title, rating);
			}
		}
		
		else {
			if(free.equalsIgnoreCase("Yes")) {
				System.out.print("Enter rating : ");
                double rating = sc.nextDouble();
                g = new StrategyGame(title, rating);

			}
			else {
				System.out.println("Enter the price : ") ;
				double price = sc.nextDouble() ;
				
				System.out.println("Enter rating : ") ;
				double rating = sc.nextDouble() ;
				
				g = new StrategyGame(title, rating);
			}
		}
		
		//applying discount
		System.out.print("Apply discount? Enter amount (or 0): ");
        double discount = sc.nextDouble();
        if (discount > 0) {
            g.applyDiscount(discount);
        }

        if (g instanceof IDownloadable) {
            ((IDownloadable) g).download();
            g.playDemo();
        }

        User user = new User(name) ;
        
        // Add to user library and show owned games
        System.out.println();
        System.out.println("1. Add games ") ;
        System.out.println("2. Show Owned games") ;
        System.out.println("3. Exit!") ;
        System.out.println("Enter your choice : ") ;
        int choice = sc.nextInt();
        
        switch(choice) {
        
        case 1 : 
        	user.addGame(g);
        	System.out.println("Added " +g.getTitle() +" in " +name +"'s list!") ;
        	break ;
        case 2 :
        	System.out.println("List of games that " +name +" owns : " ) ;
            user.showGames();
            break ;
        case 3 :
        	System.out.println("Exiting GameBox......") ;
        	return ;
        	
        default :
        	System.out.println("Invalid Choice! Choose from above options.") ;
        }
        
        sc.close();

	}

}
