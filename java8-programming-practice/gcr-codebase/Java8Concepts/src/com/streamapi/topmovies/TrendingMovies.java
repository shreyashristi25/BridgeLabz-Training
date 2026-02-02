package com.streamapi.topmovies;
import java.util.* ;
import java.util.stream.Collectors;

public class TrendingMovies {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		
		//taking user input for number of movies, their titles, their rating and their release year
		List<Movie> movies = new ArrayList<>() ;
		System.out.println("Enter the number of movies : ") ;
		int n = sc.nextInt() ;
		sc.nextLine() ;
		
		for(int i = 0; i <n; i++) {
			System.out.println("Enter the title of the movie : ") ;
			String title = sc.nextLine() ;
			
			System.out.println("Enter the rating of the movie : ") ;
			double rating = sc.nextDouble();
			
			System.out.println("Enter the release year of the movie : ") ;
			int releaseYear = sc.nextInt();
			
			sc.nextLine() ;
			movies.add(new Movie(title, rating, releaseYear)) ;

		}
		
		//using to streams to get top5 movies
		List<Movie> top5 = movies.stream()
				.filter(m -> m.getReleaseYear() >= 2025)
				.sorted(Comparator.comparing(Movie :: getRating).reversed().thenComparing(Movie::getReleaseYear).reversed())
				.limit(5)
				.collect(Collectors.toList()) ;

		System.out.println(top5) ;
	}

}
