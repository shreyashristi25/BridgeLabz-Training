package com.examscanner;
import java.util.* ;

public class AnswerSheet<T> {

	 private String studentName;
	 private List<T> answers;

	 //constructor
	 public AnswerSheet(String studentName, List<T> answers) {
		 this.studentName = studentName;
	     this.answers = answers;
	 }

	 //getter methods to get student name and answers
	 public String getStudentName() { 
		 return studentName; 
	 }
	 public List<T> getAnswers() {
		 return answers; 
	 }

}
