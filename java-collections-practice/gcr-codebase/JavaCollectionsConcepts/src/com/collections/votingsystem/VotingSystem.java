package com.collections.votingsystem;
import java.util.* ;

public class VotingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		Voting vote = new Voting() ;
		
		//taking user input for total number of votes and the candidate names to cast vote
		System.out.println("Enter total number of votes :") ;
		int n = sc.nextInt( ) ;
		sc.nextLine() ;
		
		for( int i =0; i < n; i ++) {
			System.out.println("Enter the name of the candidate to vote : ");
			String candidate = sc.nextLine();
			vote.castVote(candidate) ;
		}
		
		//displaying result in sorted and original order
		vote.displaySortedResult() ;
		System.out.println();
		vote.displayOriginalResult();
		
	}

}
