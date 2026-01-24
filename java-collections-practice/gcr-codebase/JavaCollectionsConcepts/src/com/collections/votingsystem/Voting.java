package com.collections.votingsystem;
import java.util.* ;

public class Voting {

	private Map<String, Integer> vote =  new HashMap<> () ;
	private Map<String , Integer> orderedVotes = new LinkedHashMap<> () ;
	
	//method to cast vote
	public void castVote(String candidate) {
		vote.put(candidate, vote.getOrDefault(candidate, 0) +1) ;
		orderedVotes.put(candidate, vote.get(candidate)) ;
	}
	
	//method to display votes sorted by candidate name
	public void displaySortedResult() {
		TreeMap<String, Integer> sorted = new TreeMap<> (vote) ;
		System.out.println("Results in Sorted Order : ") ;
		for(Map.Entry<String, Integer> entry  : sorted.entrySet()) {
			System.out.println(entry.getKey() +" -> " +entry.getValue()) ;
		}
	}
	
	//method to display the original list of candidates and their votes
	public void displayOriginalResult() {
		System.out.println("Results in Original Order : ") ;
		for(Map.Entry<String, Integer> entry  : orderedVotes.entrySet()) {
			System.out.println(entry.getKey() +" -> " +entry.getValue()) ;
		}
	}
	
}
