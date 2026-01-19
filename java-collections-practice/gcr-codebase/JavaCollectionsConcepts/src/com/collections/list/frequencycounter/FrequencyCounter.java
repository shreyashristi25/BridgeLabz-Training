package com.collections.list.frequencycounter;
import java.util.* ;

public class FrequencyCounter {

	//method to count frequency of items in a list
	public static Map<String, Integer> findFrequency(List<String> items) {
		Map<String , Integer> frequencyMap = new HashMap<>() ;
		
		for(String item : items) {
			frequencyMap.put(item,  frequencyMap.getOrDefault(items,  0) +1) ;
			
		}
		return frequencyMap ;
	}
}
