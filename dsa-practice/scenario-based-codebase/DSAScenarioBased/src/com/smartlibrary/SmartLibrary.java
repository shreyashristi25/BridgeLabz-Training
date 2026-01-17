package com.smartlibrary;
import java.util.* ;

public class SmartLibrary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input for number, book titles and displaying sorted and unsorted books
		System.out.println("Enter the number of books : ") ;
		int n = sc.nextInt();
		sc.nextLine();
		
		String borrowedBooks [] = new String[n] ;
		
		int count = 0 ;
		System.out.println("SmartLibrary - Auto-Sort Borrowed Books") ;
		
		SortBook sb = new SortBook() ;
		while(true) {
			System.out.println("Enter book titles (Enter exit to stop )") ;
			
			String book =  sc.nextLine();
			if(book.equalsIgnoreCase("exit"))  {
				break ;
			}
			
			borrowedBooks[count++]= book ;
		
			
			System.out.println("Current Borrowed books in unsorted order : ");
			for(int i = 0; i < count; i++  ) {
				System.out.println("- " +borrowedBooks[i]) ;
			}
			
			sb.insertionSort(borrowedBooks, count) ;
			
			System.out.println("Current Borrowed books in sorted order : ");
			for(int i = 0; i < count; i++  ) {
				System.out.println("- " +borrowedBooks[i]) ;
			}
			
			if(count == n ) {
				System.out.println("Maximum number of books reached ") ;
				break ;
			}
				
		}

	}

}
