package com.collectors.librarybookstatistics;
import java.util.* ;
import java.util.stream.Collectors ;

public class LibraryBookStatistics {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in) ;
		
		List<Book> books = new ArrayList<> () ;
		
		//taking number of books and their details as user input 
		System.out.println("Enter number of books : ") ;
		int n = sc.nextInt() ;
		sc.nextLine() ;
		
		for( int i =0; i < n; i++) {
			System.out.println("Enter Book details  : ") ;
			System.out.println("Enter title :" ) ;
			String title = sc.nextLine();
			
			System.out.println("Enter genre : ") ;
			String genre = sc.nextLine();
			
			System.out.println("Enter number of pages : ") ;
			int pages = sc.nextInt();
			sc.nextLine();
			
			books.add(new Book(title, genre, pages)) ;
		}
		
		//finding total pages, average pages, and maximum pages per genre.
		Map<String, IntSummaryStatistics> statsByGenre = books.stream()
				.collect(Collectors.groupingBy(
				Book::getGenre,
	            Collectors.summarizingInt(Book::getPages)
	    ));

		// Display results
		System.out.println("Library Book Statistics:");
		statsByGenre.forEach((genre, stats) -> {
			System.out.println("Genre: " + genre);
	        System.out.println("  Total Pages: " + stats.getSum());
	        System.out.println("  Average Pages: " + stats.getAverage());
            System.out.println("  Max Pages: " + stats.getMax());
        });

	    sc.close();

	}
}
