package com.libraryorganizer;
import java.util.* ;
public class BookShelf {

	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in) ;
		LibraryOrganizer library = new LibraryOrganizer();
		
		while(true) {
		System.out.println("======BookShelf======") ;
		System.out.println("1. Add Book") ;
		System.out.println("2. Borrow Book") ;
		System.out.println("3. Return Book") ;
		System.out.println("4. Display Book Catalog") ;
		System.out.println("5. Exit") ;
		
		System.out.println("Enter your choice : ") ;
		int choice = sc.nextInt() ;
		
		switch(choice) {
			case 1 : 
				System.out.println("Enter the genre :") ;
				String genre = sc.nextLine();
				sc.nextLine();
				
				System.out.println("Enter the title of the book :") ;
				String title = sc.nextLine();
				sc.nextLine();
			
				System.out.println("Enter the name of author :") ;
				String author = sc.nextLine();
				sc.nextLine();
			
				library.addBook(genre,  new Book(title, author));
				break ;
		
			case 2:
				System.out.println("Enter the genre of the book :") ;
				genre = sc.nextLine();
				sc.nextLine();
				
				System.out.println("Enter the title of the book :") ;
				title = sc.nextLine();
				sc.nextLine();
				
				library.borrowBook(genre, title) ;
				break ;
				
			case 3 :
				System.out.println("Enter the genre of the book :") ;
				genre = sc.nextLine();
				sc.nextLine();
				
				System.out.println("Enter the title of the book :") ;
				title = sc.nextLine() ;
				sc.nextLine();
				
				System.out.print("Enter author: ");
                author = sc.nextLine();
                sc.nextLine();
                
                library.returnBook(genre, new Book(title, author));
                break;
		
			case 4 :
				library.displayCatalog();
				break ;
				
			case 5 :
				System.out.println("Exiting... Goodbye!");
                sc.close();
                return;
                
			default :
				System.out.println("Exititng BookShelf.......") ;
				System.out.println("Thank You !") ;
				break ;
						
			}
		}
	}
}
