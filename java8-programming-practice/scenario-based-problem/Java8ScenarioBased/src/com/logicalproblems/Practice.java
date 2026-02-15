package com.logicalproblems;
import java.util.* ;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {

	public static void main(String[] args) {
		//Count vowels in a string using Stream
		String input = "programming";
		
		long vowelCount =input.chars().mapToObj(c-> (char) c)
		.filter(e-> e=='A' || e=='E' || e=='I'|| e=='O'  || e=='U' || e=='a' || e=='e' || e=='i' || e=='o' || e=='u')
		.count() ;

		System.out.println("Vowels in the given string  : " +vowelCount) ;
		
		//Count number of words in a sentence
		
		String sentence =  "Java is very powerful";
		long words = Arrays.stream(sentence.split(" "))
				.count() ;
		System.out.println("Number of words in the given sentence  : " +words) ;
		
		
		//Find even numbers from list
		List<Integer> numbers =  List.of(2,5,7,8,10,13) ;
		System.out.println("Evene numbers in the given list  : ") ;
		 numbers.stream()
				.filter(e->e%2==0)
				.forEach(System.out :: println);
		 
		 //Convert list of strings to uppercase
		 
		 List<String> wordList = List.of("java","spring","boot") ;
		 System.out.println("Words in uppercase : " ) ;
		 wordList.stream()
		 .map(String :: toUpperCase)
		 .forEach(System.out :: println);
		
		 
		 // Find string length list
		 
		 List<String> listOfWords = List.of("cat","elephant","dog") ;
		 System.out.println("String length of list  : ") ;
		 listOfWords.stream()
		 .map(String :: length)
		 .forEach(System.out :: println);
		 
		 //Count strings starting with ‘a’
		 List<String> strings = List.of("apple","banana","ant","car") ;
		 strings.stream().filter(e -> e.startsWith("a")).forEach(System.out :: println);
	
		 // Remove empty strings
		 List<String> listOfStrings = List.of("java","","spring","","boot");
		 System.out.println("String afetr remove empty strings : ") ;
		 listOfStrings.stream().filter(e-> e.length() > 0).forEach(System.out :: println) ;
		 
		 //Sum of all numbers using stream
		 List<Integer> number = List.of(1,2,3,4,5) ;
		 int sum = number.stream().mapToInt(Integer :: intValue).sum();
		 System.out.println("Sum of all numers in the list  : " +sum) ;
		 
		 
		 // Find max number
		 List<Integer> listOfNumber  =  List.of(10,25,3,99,45) ;
		 Optional<Integer> maxNum  = listOfNumber.stream().max((a, b)-> Integer.compare(a, b)) ;
		 if(maxNum.isPresent()) {
			 System.out.println("Max number in the list  : " + maxNum.get()) ;
		 }
		 
		 //Reverse each string in list
		 List<String> stringList = List.of("java","api") ;
		 stringList.stream()
         .map(str -> new StringBuilder(str).reverse().toString())
         .forEach(System.out::println);
		 
		 
		 //Remove duplicate elements from list
		 
		 List<Integer> elements = List.of(1,2,2,3,4,4,5) ;
		 System.out.println("List without duplicates : ") ;
		 elements.stream().distinct().forEach(System.out :: println);
		 
		 
		 //Sort list in descending order
		 
		 List<Integer> numList = List.of(5,1,9,3) ;
		 System.out.println("List in descending order : ") ;
		 numList.stream().sorted(Comparator.reverseOrder()).forEach(System.out :: println) ;
		 
		 
		 //Find second highest number
		 List<Integer> list= List.of(10,40,30,20) ;
		 System.out.println("Second highest number in the list  : ") ;
		 list.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).forEach(System.out :: println);
	
	
		 //Join strings with comma
		 
		 List<String> commaList =  List.of("Java","Spring","Boot") ;
		 String result  =  commaList.stream().collect(Collectors.joining(", ")) ;
	
		 System.out.println(result) ;
		 
		 
		 //Frequency of each character
		 String s = "banana" ;
		 Map<Character, Long> freq = s.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) ;
	
		 System.out.println("Frequency of each character in the given string  : " + freq) ;
	
		 
		 //Group strings by length
		 List<String> stringList1 = List.of("a","bb","ccc","dd") ;
		 Map<Integer, List<String>> groupingString = stringList1.stream().collect(Collectors.groupingBy(String :: length)) ;
		 System.out.println("Strings grouped by their length : " + groupingString) ;
		 
		 // Find first non-repeated character
		 
		 String str = "stress" ;
		 Optional<Character> firstNonRepeating = str.chars()
		 .mapToObj(c-> (char) c)
		 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap :: new, Collectors.counting()))
		 .entrySet()
		 .stream()
		 .filter(e-> e.getValue() == 1)
		 .map(Map.Entry :: getKey)
		 .findFirst();
		 
		 if(firstNonRepeating.isPresent()) {
			 System.out.println("First non repeating cahracter : " +firstNonRepeating.get()) ;
		 }
		 
		 //Convert List<Integer> to List<String>
		 List<Integer> list1 = List.of(1,2 , 3) ;
		 List<String> stringList2 = list1.stream().map(String :: valueOf).collect(Collectors.toList()) ;
		 System.out.println("List in form od strings : " +stringList2) ;
		 
		 //Count occurrences of each word
		 String text = "java is java and java is fast";
		 Map<String, Long> wordCount = Arrays.stream(text.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) ;
		 
		 System.out.println("Count of each word : " + wordCount) ;
		 
		 //Partition numbers into even and odd
		 List<Integer> num = List.of(1, 2, 3, 4, 5, 6);

		 Map<String, List<Integer>> res =
				 num.stream()
				 .collect(Collectors.groupingBy(
						 n -> n % 2 == 0 ? "even" : "odd"
						 ));

		 System.out.println(res);
	        
	     
		 // Find duplicate elements only
		 List<Integer> nums = List.of(1,2,3,2,4,5,1) ;
		 System.out.println("Only duplicate values : ") ;
		 nums.stream()
		 .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		 .entrySet()
		 .stream()
		 .filter(e-> e.getValue() >1)
		 .forEach(e->System.out.println(e.getKey()));
	        
		 
		 //Find longest string
		 List<String> str1 = List.of("java","microservices","api") ;
		 Optional<String> longest =
	                str1.stream()
	                    .max(Comparator.comparingInt(String::length));

	        longest.ifPresent(System.out::println);
	        
	        
	     // Find top 3 highest numbers
	     List<Integer> numerals = List.of(10,90,30,70,50) ;
	     System.out.println("Top 3 highest numbers : " ) ;
	     numerals.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out :: println) ;
		 
	     
	     //Flatten list of lists
	     List<List<Integer>> lists = List.of(
	    		 List.of(1, 2),
	    		 List.of(3, 4),
	    		 List.of(5)
	    		);

	     List<Integer> flatList =
	    		 lists.stream()
	    		 .flatMap(List::stream)
	    		 .toList();

	     System.out.println(flatList);
	     
	     
	     //Find sum of squares of even numbers
	     List<Integer> numbers1 = List.of(1,2,3,4,5) ;
	     int summation = numbers1.stream()
	    		 .filter(e->e%2 ==0)
	    		 .mapToInt(e-> e*e).sum() ;
	     
	     System.out.println("Sum of squares of even numbers : " +summation) ;
	        
	    //Sort map by value
	     Map<String, Integer> map = Map.of("A",3, "B",1, "C",2);

	     Map<String, Integer> sorted =
	    		 map.entrySet()
	    		 .stream()
	    		 .sorted(Map.Entry.comparingByValue())
	    		 .collect(Collectors.toMap(
	    				 Map.Entry::getKey,
	    				 Map.Entry::getValue,
	    				 (e1, e2) -> e1,
	    				 LinkedHashMap::new
	    			));

	     System.out.println("Map sorted by value : " + sorted);
	    
	     
	     // Find common elements between two lists
	     List<Integer> list2 = List.of(1,2,3,4);
	     List<Integer> list3 = List.of(3,4,5,6);
	     
	     List<Integer> common = list2.stream().filter(list3 :: contains).collect(Collectors.toList()) ;
	     
	     System.out.println("Common elemnts in two lists  : " + common) ;
	     
	     
	     //Find kth smallest element
	     List<Integer> n = List.of(9,1,5,3,7) ;
	     int k = 2 ;
	     System.out.println("Kth smallest number  : ") ;
	     Integer kthSmallest=  n.stream()
	                       .sorted()
	                       .skip(k - 1)
	                       .findFirst()
	                       .orElse(null);

	     System.out.println(kthSmallest);
	     
	     
	     //Remove Repeating Characters (Keep Only Unique Once)
	     String inputString = "aabbccdde";

	     String resultString = inputString.chars()
	    		 .mapToObj(c -> (char) c)
	    		 .collect(Collectors.groupingBy(
	    				 Function.identity(),
	    				 LinkedHashMap::new,
	    				 Collectors.counting()))
	    		 .entrySet()
	    		 .stream()
	    		 .filter(e -> e.getValue() == 1)
	    		 .map(e -> String.valueOf(e.getKey()))
	    		 .collect(Collectors.joining());

	     System.out.println(resultString);
	        
	        
	     //Remove Non-Alphanumeric Characters
	     
	     String in  =  "ja@va#8!!" ;
	     String out = in.chars()
	                .filter(Character::isLetterOrDigit)
	                .mapToObj(c -> String.valueOf((char) c))
	                .collect(java.util.stream.Collectors.joining());

	     System.out.println("String without non-alphanumeric acharacters : " +out);
	     
	     //Keep Only Alphabets
	     
	     String inString = "java8stream2025";
	     String outString = inString.chars()
	    		 .filter(Character :: isAlphabetic)
	    		 .mapToObj(c-> String.valueOf((char) c))
	    				 .collect(Collectors.joining()) ;
	     
	     System.out.println("String with only aphabets : " +outString) ;
	     
	     //.Keep Only Digits
	     String stringInput = "orderId=AB123XZ9";

	     String stringResult = stringInput.chars()
	    		 .filter(Character::isDigit)
	    		 .mapToObj(c -> String.valueOf((char) c))
	    		 .collect(Collectors.joining());

	     System.out.println("String with only digits  : " +stringResult);
	     
	     //Count Each Character Except Spaces
	     String string = "java stream";

	     Map<Character, Long> freqMap = string.chars()
	    		 .filter(c -> c != ' ')   
	    		 .mapToObj(c -> (char) c)
	    		 .collect(Collectors.groupingBy(
	    				 Function.identity(),
	    				 LinkedHashMap::new,
	    				 Collectors.counting()));

	     System.out.println(freqMap);
	} 

}
