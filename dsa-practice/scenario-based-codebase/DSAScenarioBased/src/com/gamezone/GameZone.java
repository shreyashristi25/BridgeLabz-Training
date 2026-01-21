package com.gamezone;
import java.util.* ;

public class GameZone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input for number of players and their scores
		System.out.println("Enter number of players:");
        int n = sc.nextInt();

        int [] scores = new int[n];
        System.out.println("Enter player scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        SortScore.quickSort(scores, 0, n - 1);

        //Displaying the sorted array
        System.out.println("Leaderboard (High Scores First):");
        for (int i = 0; i < n; i++) {
            System.out.println("Rank " + (i + 1) + ": " + scores[i]);
        }


	}

}
