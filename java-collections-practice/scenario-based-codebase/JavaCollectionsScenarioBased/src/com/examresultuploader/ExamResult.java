package com.examresultuploader;

public class ExamResult <T>{

	private String rollNo;
    private String name;
    private String subject;
    private int marks;
    private T examType; 

    //constructor
    public ExamResult(String rollNo, String name, String subject, int marks, T examType) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
        this.marks = marks;
        this.examType = examType;
    }

    //getter methods to get roll no, name, subject, marks and exam type
    public String getRollNo() {
    	return rollNo; 
    }
    public String getName() {
    	return name; 
    }
    public String getSubject() {
    	return subject; 
    }
    public int getMarks() {
    	return marks; 
    }
    public T getExamType() {
    	return examType; 
    }

    @Override
    public String toString() {
        return rollNo + " - " + name + " (" + subject + ": " + marks + ")";
    }

}
