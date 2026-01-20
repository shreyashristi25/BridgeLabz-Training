package com.collections.map;
import java.util.* ;

public class MaxValuedKey {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		Map<String, Integer> map = new HashMap<>() ;
		
		//taking number of map entries and map as user input
		System.out.println("Enter number of entries : ") ;
		int n = sc.nextInt() ;
		sc.nextLine();
		
		for( int i =0; i < n; i++) {
			System.out.println("Enter key : ") ;
			String key = sc.nextLine();
			
			System.out.println("Enter value : ") ;
			int value = sc.nextInt() ;
			sc.nextLine() ;
			
			map.put(key,  value) ;
		}
	    
		String maxi = null ;
			
		int maxValue = Integer.MIN_VALUE ;
			
		//finding the max valued key in the map and displaying result
    	for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() >maxValue) {
				maxValue = entry.getValue();
				maxi = entry.getKey();
			}
		}
		System.out.println("Original Map : " +map) ;
		System.out.println("Key with max value : " +maxi) ;
			
		sc.close();
		
	}

	

}
