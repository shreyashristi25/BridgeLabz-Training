package com.feedbackguru;

public class Feedback <T>{

	T type;        
    String text;   
    int rating;    

    //constructor
    public Feedback(T type, String text, int rating) {
        this.type = type;
        this.text = text;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + text + " (Rating: " + rating + "/10)";
    }

}
