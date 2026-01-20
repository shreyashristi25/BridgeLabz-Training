package com.collections.map;
import java.util.* ;
public class MergeMaps {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		
		Map<String, Integer> map1 = new HashMap<>() ;
		Map<String, Integer> map2 = new HashMap<>() ;

		//taking user input for number of entries in map1 and map2 and their entries
		System.out.println("Enter number of entries for map1 :") ;
		int n1 = sc.nextInt() ;
		sc.nextLine() ;
		
		for( int i =0; i <n1; i++) {
			System.out.println("Enter key for map1 : ") ;
			String key = sc.nextLine() ;
			
			System.out.println("Enter value for map1 : " ) ;
			int value = sc.nextInt();
			sc.nextLine();
			
			map1.put(key,  value) ;
		}
		
		System.out.println("Enter number of entries for map2 :") ;
		int n2 = sc.nextInt() ;
		sc.nextLine() ;
		
		for( int i =0; i <n2; i++) {
			System.out.println("Enter key for map2 : ") ;
			String key = sc.nextLine() ;
			
			System.out.println("Enter value for map2 : " ) ;
			int value = sc.nextInt();
			sc.nextLine();
			
			map2.put(key,  value) ;
		}
		
		Map<String , Integer> mergedMap = new HashMap<>() ;
		
		//Merging two maps and displaying result
		for(Map.Entry<String, Integer> entry : map2.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			mergedMap.put(key, mergedMap.getOrDefault(key, 0) + value) ;
		}
		
		System.out.println("Map1 : " +map1) ;
		System.out.println("Map2 : " +map2) ;
		System.out.println("Merged Map : " +mergedMap) ;
		
		sc.close();
		
	}

}
