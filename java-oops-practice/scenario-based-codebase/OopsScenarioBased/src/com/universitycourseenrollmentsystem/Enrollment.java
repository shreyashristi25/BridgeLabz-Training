package com.universitycourseenrollmentsystem;

public class Enrollment {

	private Student student;
    private Course course;
    private String grade;

    //constructor
    public Enrollment(Student student, Course course, String grade) {
        this.student = student;
        this.course = course;
        this.grade = grade;
    }

    //method to display Enrollment info
    public void displayInfo() {
        System.out.println("Enrollment: " + student.getTranscript() + " | Course: " + course.getTitle() + " | Grade: " + grade);
    }

}
