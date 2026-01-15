package com.smartshelf;
import java.util.* ;

//driver class for all other classes in SmartShelf
public class SmartShelf {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in) ;
		
		//creating object, calling methods and displaying result accordingly
		BookArrangement shelf = new BookArrangement() ;
		
		System.out.println("Enter the number of books to add :" ) ;
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter book's title : ") ;
			String title = sc.nextLine();
			
			System.out.println("Enter the name of the author : ") ;
			String author = sc.nextLine(); 
			
			shelf.addBook(new Book(title, author)) ;
			shelf.displayList() ;
		}
	}
}
