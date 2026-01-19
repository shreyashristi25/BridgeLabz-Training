package com.collections.list.nthfromend;
import java.util.* ;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		LinkedList<String> list = new LinkedList<> () ;
		
		//taking user input for number of elements in the list, elements and nth position
		System.out.println("Enter number of elements in the list : ") ;
		int size = sc.nextInt() ;
		sc.nextLine();
		
		System.out.println("Enter the position you want to find element from last : ") ;
		int n = sc.nextInt() ;
		sc.nextLine() ;
		
		System.out.println("Enter elements of the list : ") ;
		
		for(int i =0; i < size ; i++) {
			list.add(sc.nextLine()) ;
		}
		
		//displaying the nth element from last in the list
		String result = FindNthElement.findNthElementFromEnd(list, n) ;

		if(result != null) {
			System.out.println("The " +n +"th element from last is : " +result) ;
			
		}
		else {
			System.out.println("Invalid Position") ;
		}
	}

}
