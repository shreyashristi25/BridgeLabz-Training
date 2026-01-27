package com.songvault;
import java.io.* ;
import java.util.* ;
import java.util.regex.* ;
import java.util.stream.* ;

public class PersonalMusicLibrary {

	private List<Song> songs = new ArrayList<>();

    // Regex patterns
    private static final Pattern TITLE_PATTERN = Pattern.compile("Title:\\s*(.*)");
    private static final Pattern ARTIST_PATTERN = Pattern.compile("Artist:\\s*(.*)");
    private static final Pattern DURATION_PATTERN = Pattern.compile("Duration:\\s*(.*)");
    private static final Pattern GENRE_PATTERN = Pattern.compile("Genre:\\s*(.*)");

    // Reading a single song file, adding song to the library, 
    public Song readSongFile(String filePath) {
        String title = "", artist = "", duration = "", genre = "";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                Matcher m;
                if ((m = TITLE_PATTERN.matcher(line)).matches()) title = m.group(1);
                else if ((m = ARTIST_PATTERN.matcher(line)).matches()) artist = m.group(1);
                else if ((m = DURATION_PATTERN.matcher(line)).matches()) duration = m.group(1);
                else if ((m = GENRE_PATTERN.matcher(line)).matches()) genre = m.group(1);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + filePath);
        }
        return new Song(title, artist, duration, genre);
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    //methods to Group by genre, find unique artists, filter by genre, sort by title and print
    public Map<String, List<Song>> groupByGenre() {
        return songs.stream().collect(Collectors.groupingBy(Song::getGenre));
    }

    public Set<String> uniqueArtists() {
        return songs.stream().map(Song::getArtist).collect(Collectors.toSet());
    }

    public List<Song> filterByGenre(String genre) {
        return songs.stream().filter(s -> s.getGenre().equalsIgnoreCase(genre)).collect(Collectors.toList());
    }

    public List<Song> sortByTitle() {
        return songs.stream().sorted(Comparator.comparing(Song::getTitle)).collect(Collectors.toList());
    }

    public void printLibrary() {
        songs.forEach(System.out::println);
    }


	
}
