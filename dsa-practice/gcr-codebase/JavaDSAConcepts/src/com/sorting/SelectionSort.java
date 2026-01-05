package com.sorting;
import java.util.* ;

public class SelectionSort {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //getting user input
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];
        System.out.println("Enter exam scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        // Applying Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
           
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }

        //displaying sorted result
        System.out.println("Sorted Exam Scores (Ascending):");
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }

}
