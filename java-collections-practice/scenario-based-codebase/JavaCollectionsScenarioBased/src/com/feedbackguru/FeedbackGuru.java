package com.feedbackguru;
import java.io.* ;
import java.util.* ;
import java.util.regex.* ;

public class FeedbackGuru {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     SmartSurveyAnalyzer guru = new SmartSurveyAnalyzer();

	     //taking user input and displaying result accordingly
	     System.out.print("Enter feedback file path  : ");
	     String fileName = sc.nextLine();

	     System.out.print("Enter feedback type (Service/Product): ");
	     String type = sc.nextLine();

	     guru.readFile(fileName, type);
	     guru.showSummary();


	}

}
