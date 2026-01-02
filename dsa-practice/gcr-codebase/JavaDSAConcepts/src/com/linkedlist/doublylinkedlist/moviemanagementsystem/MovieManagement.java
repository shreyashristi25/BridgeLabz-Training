package com.linkedlist.doublylinkedlist.moviemanagementsystem;

public class MovieManagement {

	private MovieNode head;
    private MovieNode tail;

    // method to add movie at beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // method to add movie at end
    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // method to add movie at specific position
    public void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position <= 0) {
            System.out.println("Invalid position!");
            return;
        }
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (position == 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        MovieNode temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
        } else {
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    // method to remove movie by Title
    public void removeByTitle(String title) {
        if (head == null) {
            System.out.println("No movies in the list!");
            return;
        }
        MovieNode temp = head;
        while (temp != null && !temp.title.equalsIgnoreCase(title)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Movie not found!");
            return;
        }
        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (temp == tail) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        System.out.println("Movie \"" + title + "\" removed.");
    }

    // method to search by Director
    public void searchByDirector(String director) {
        MovieNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                System.out.println("Found: " + temp.title + " (" + temp.year + "), Rating: " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies found for Director: " + director);
    }

    // method to search by Rating
    public void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println("Found: " + temp.title + " (" + temp.year + "), Director: " + temp.director);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies found with Rating: " + rating);
    }

    // method to update Rating by Title
    public void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated for \"" + title + "\" to " + newRating);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found!");
    }

    // method to display movies forward
    public void displayForward() {
        if (head == null) {
            System.out.println("No movies in the list!");
            return;
        }
        System.out.println("Movies (Forward):");
        MovieNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | Rating: " + temp.rating);
            temp = temp.next;
        }
    }


    // method to display movies backward
    public void displayBackward() {
        if (tail == null) {
            System.out.println("No movies in the list!");
            return;
        }
        System.out.println("Movies (Backward):");
        MovieNode temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | Rating: " + temp.rating);
            temp = temp.prev;
        }
    }

	public static void main(String[] args) {

		MovieManagement mm = new MovieManagement();

        //  add movies
        mm.addAtBeginning("DDLJ", "Aditya Chopra", 2010, 8.8);
        mm.addAtEnd("OmShanti Om", "Farah Khan", 2014, 8.6);
        mm.addAtPosition(2, "The Matrix", "Wachowski", 1999, 8.7);

        // display movies
        mm.displayForward();
        mm.displayBackward();
        
        // Search movies
        mm.searchByDirector("Aditya Chopra");
        mm.searchByRating(8.7);

        // Update rating
        mm.updateRating("DDLJ", 9.0);
        mm.displayForward();

        // Remove movie
        mm.removeByTitle("The Matrix");
        mm.displayForward();


	}

}
