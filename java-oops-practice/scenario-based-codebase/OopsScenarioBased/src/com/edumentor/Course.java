package com.edumentor;

public class Course {

	private String courseId;
    private String courseName;
    private String duration;
    private int difficulty;

    //constructor
    public Course(String courseId, String courseName, String duration, int difficulty) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.duration = duration;
        this.difficulty = difficulty;
    }

    //method to assign certificates for a particular course
    public void assignCertificate(Learner l) {
        if (duration.equalsIgnoreCase("short")) {
            l.generateCertificate("short");
        } 
        else {
            l.generateCertificate("full-time");
        }
    }

}
