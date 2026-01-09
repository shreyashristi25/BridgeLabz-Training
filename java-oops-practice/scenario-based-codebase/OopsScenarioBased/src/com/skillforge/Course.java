package com.skillforge;

public class Course implements ICertifiable{

	//private variables to ensure limited access
	private String title;
    private Instructor instructor;
    private double rating;
    private String [] modules;
    private String [] reviews;
    private int reviewCount;

    // constructor with default values
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[]{"Intro", "Basics", "Final Project"};
        this.reviews = new String[5];
        this.reviewCount = 0;
    }

    // constructor without default values
    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.reviews = new String[5];
        this.reviewCount = 0;
    }

    // protected method for rating logic
    protected void updateRating(double newRating) {
        rating = (rating + newRating) / 2;
    }

    // methods to read and add reviews
    public String [] getReviews() {
        String [] copy = new String[reviewCount];
        for (int i = 0; i < reviewCount; i++) { 
        	copy[i] = reviews[i];     
        }
        
        return copy;
    }

    public void addReview(String review, double stars) {
        if (reviewCount < reviews.length) {
            reviews[reviewCount++] = review;
            updateRating(stars);
        }
    }

    @Override
    public String generateCertificate() {
        return "Certificate: " + title + " completed under " + instructor.getName();

    }


}
