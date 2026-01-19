package com.ranksheetgenerator;
import java.util. *;

//driver class for other classes of EduResult
public class EduResults {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    //taking user input for number of districts, number of students per district and name and score of each student 
	    System.out.println("Enter the number of districts : ");
	    int districts = sc.nextInt();

	    int total = 0;

	    System.out.println("Enter the number of students per district : ");
	    int[] districtSizes = new int[districts];
	    for (int i = 0; i < districts; i++) {
	        districtSizes[i] = sc.nextInt();
	        total += districtSizes[i];
	    }

	    Student[] students = new Student[total];

	    int index = 0;
	    for (int i = 0; i < districts; i++) {
	        for (int j = 0; j < districtSizes[i]; j++) {
	            sc.nextLine(); // clear buffer
	            System.out.println("Enter the name of Student : ");
	            String name = sc.nextLine();

	            System.out.println("Enter the score of Student : ");
	            int score = sc.nextInt();

	            students[index++] = new Student(name, score);
	        }
	    }

	    // Sorting and displaying rank accordingly
	    RankSheetGenerator.mergeSort(students, 0, total - 1);

	    System.out.println("--- Final State-wise Rank Sheet ---");
	    for (int k = 0; k < total; k++) {
	        System.out.printf("Rank %d: %s - %d\n",
	                (k + 1), students[k].name, students[k].score);
	    }
	}

}


