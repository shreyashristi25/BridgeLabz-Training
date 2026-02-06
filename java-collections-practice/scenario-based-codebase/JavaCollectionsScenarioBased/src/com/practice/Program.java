package com.practice;
import java.util.* ;
import java.util.stream.Collectors;
import java.util.Dictionary;
public class Program {

	public static List<CreatorStats> engagementBoard = new LinkedList<>() ;

	//method to register new creator
	public void registerCreator(CreatorStats record) {
		engagementBoard.add(record);
		System.out.println("Creator registered successfully") ;
	}
	
	//method to calculate overall average likes
	public double calculateAverageLikes() {
		double totalLikes = 0;
		double totalWeeks = 0;
		
		for(CreatorStats cs : engagementBoard) {
			for(double like : cs.getWeeklyLikes()) {
				totalLikes += like ;
				totalWeeks++ ;
			}
			
		}
		return totalWeeks == 0 ? 0 : totalLikes/totalWeeks ;
	}
	
	//method to get top performers 
	public Dictionary<String, Integer> getTopPostCounts(List<CreatorStats> records, double likeThreshold) {
		
		Dictionary<String, Integer> result = new Hashtable <>() ;
		
		for(CreatorStats cs : records) {
			int count =0 ;
			
			double [] weeklyLikes =cs.getWeeklyLikes() ;
			for( int i =0; i < weeklyLikes.length; i++) {
				if(weeklyLikes[i] >= likeThreshold) {
					count ++ ;
				}
			}
			
			if(count > 0) {
				result.put(cs.getName(), count) ;
			}
			
			
		}
		return result ;
	}
	
	public static void main(String ags[]) {
		Scanner sc = new Scanner(System.in) ;
		Program program = new Program() ;
		
		int choice ;
		
		do {
			
			//taking user input and displaying result accordingly
			System.out.println("1. Register a new Creator ") ;
			System.out.println("2. Get Top Performers ") ;
			System.out.println("3. Get Overall Weekly Likes") ;
			System.out.println("4. Exit") ;
			System.out.println("Enter your choice : ") ;
			choice = sc.nextInt() ;
			sc.nextLine();
			
			switch(choice) {
		
				case 1:
					System.out.println("Enter creator's name : ") ;
					String name = sc.nextLine();
				
					System.out.println("Enter Weekly likes of the creator for four weeks : ");
					double [] likes = new double[4] ;
					
					for( int i =0; i < 4; i++) {
						likes[i] = sc.nextDouble();
					}
					CreatorStats creator = new CreatorStats(name, likes) ;
					program.registerCreator(creator) ;
					
					break ;
					
			    	case 2: 	
			    		System.out.println("Enter the threshold : ") ;
			    		double threshold = sc.nextDouble() ;
			    		
			    		System.out.println("Top Performers this week : ") ;
				
			    		Dictionary<String, Integer> topPerformers =program.getTopPostCounts(engagementBoard, threshold) ;
			    		Enumeration<String> k = topPerformers.keys() ;
			    		if(!topPerformers.isEmpty()) {
			    			while(k.hasMoreElements()) {
			    				String key = k.nextElement() ;
			    				System.out.println(key +" " +topPerformers.get(key));
			    			}
			    		}
			    		else {
			    			System.out.println("No top-performing posts this week") ;
			    		}
				
			    		break ;
			    	case 3 :
			    		System.out.println("Overall average weekly likes: ") ;
			    		double avg = program.calculateAverageLikes() ;
			    		System.out.println(avg) ;
			    		break ;
			    		
			    	case 4 :
			    		System.out.println("Logging off — Keep Creating with StreamBuzz!");
			    		return ;
				
			    	default : 
			    		System.out.println("Invalid Input !");
				}
			}
			while(choice !=4) ;
		
		}

}
