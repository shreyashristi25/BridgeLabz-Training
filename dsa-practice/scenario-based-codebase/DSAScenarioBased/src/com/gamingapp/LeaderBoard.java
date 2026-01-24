package com.gamingapp;
import java.util.* ;

public class LeaderBoard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		PlayerAVL leaderBoard = new PlayerAVL() ;
		
		//taking user choice as input and displaying result accordingly
		while (true) {
            System.out.println("--- Leaderboard Menu ---");
            System.out.println("1. Add/Update Player");
            System.out.println("2. Remove Player");
            System.out.println("3. Show Top k Players");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter player name: ");
                    String name = sc.next();
                    
                    System.out.print("Enter score: ");
                    int score = sc.nextInt();
                    
                    leaderBoard.insert(name, score);
                    
                    System.out.println("Player : " + name +" score added/ updated to the leaderBoard.") ;
                    break;
                case 2:
                    System.out.print("Enter score to remove: ");
                    int delScore = sc.nextInt();
                    leaderBoard.delete(delScore);
                    break;
                case 3:
                	System.out.println("Enter the value of k :" ) ;
                	int k = sc.nextInt() ;
                	
                    leaderBoard.displayTopK(k);
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