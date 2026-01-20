package com.collections.map;
import java.util.* ;

public class InvertMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking original map as input from the user
		Map<String, String> originalMap = new HashMap<>() ;
		
		System.out.println("Enter number of entries : ") ;
		int n = sc.nextInt() ;
		sc.nextLine();
		
		for( int i =0; i < n; i++) {
			System.out.println("Enter key : ") ;
			String key = sc.nextLine() ;
			
			System.out.println("Enter value : ") ;
			String value = sc.nextLine();
			
			originalMap.put(key, value) ;
		}
		
		//invert the map and display the result
		Map<String , List<String>> invertedMap = new HashMap<>() ;
		
		for(Map.Entry<String, String> entry : originalMap.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			
			invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key) ;
		}
		
		System.out.println("Original Map : " +originalMap) ;
		System.out.println("Inverted MAp : " +invertedMap) ;
		
		sc.close();

	}

}
