package com.songvault;
import java.io.* ;
import java.util.* ;
import java.util.regex.* ;
import java.util.stream.* ;
public class SongVault {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PersonalMusicLibrary vault = new PersonalMusicLibrary();

		//taking user input and displaying result accordingly
        System.out.print("Enter number of song files: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Enter path for song file " + (i+1) + ": ");
            String path = sc.nextLine();
            Song song = vault.readSongFile(path);
            vault.addSong(song);
        }

        System.out.println("--- Song Library ---");
        vault.printLibrary();

        System.out.println("--- Grouped by Genre ---");
        vault.groupByGenre().forEach((g, list) -> {
            System.out.println(g + ": " + list);
        });

        System.out.println("--- Unique Artists ---");
        vault.uniqueArtists().forEach(System.out::println);

        System.out.println("--- Sorted by Title ---");
        vault.sortByTitle().forEach(System.out::println);

        System.out.print("Enter genre to filter: ");
        String genre = sc.nextLine();
        System.out.println("Songs in " + genre + ": " + vault.filterByGenre(genre));


	}

}
