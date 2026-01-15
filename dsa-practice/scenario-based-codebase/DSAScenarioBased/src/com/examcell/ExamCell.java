package com.examcell;
import com.zipzipmart.Sale;
import java.util.* ;

public class ExamCell {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input for number of students, their names and their scores
		System.out.println("Enter the number of students : ") ;
		int n = sc.nextInt();
		sc.nextLine();
		
		Students []  scores = new Students[n] ;
		for (int i = 0; i < n; i++) {
		    System.out.println("Enter the name of student : ");
		    String name = sc.nextLine();

		    System.out.println("Enter the score of the student : ");
		    while (!sc.hasNextInt()) {
		        System.out.println("Invalid input! Please enter a valid number:");
		        sc.next(); 
		    }
		    int score = sc.nextInt();
		    sc.nextLine(); 

		    scores[i] = new Students(name, score);
		}

		//calling mergeSort method and displaying state level rank list 
		MergeSort.mergeSort(scores,  0,  n-1);
		
		System.out.println("====State Level Rank List====") ;
		for (Students s : scores) {
            System.out.println(s);
        }
	}
}
