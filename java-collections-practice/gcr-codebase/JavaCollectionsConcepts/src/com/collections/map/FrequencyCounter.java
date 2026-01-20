package com.collections.map;
import java.util.* ;
import java.io.* ;
public class FrequencyCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter the file path: ") ;
		String filePath = sc.nextLine();
		
		HashMap<String, Integer> wordCount = new HashMap<>() ;
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line ;
			while((line = br.readLine()) != null) {
				line = line.replaceAll("[^a-zA-Z ]", " ").toLowerCase() ;
				String [] words = line.split("\\s+") ;
				
				for(String word : words) {
					if(!word.isEmpty()) {
						wordCount.put(word, wordCount.getOrDefault(word, 0) +1) ;
					}
				}
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(wordCount) ;
	}

}
