package com.sorting;
import java.util.* ;
public class CountingSort {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking user input
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = new int[n];
        System.out.println("Enter ages of students (10 to 18):");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        // defining range for counting
        int minAge = 10, maxAge = 18;
        int range = maxAge - minAge + 1;

        // create count array and count frequencies and commulative counts
        int [] count = new int[range];

       
        for (int age : ages) {
            count[age - minAge]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // build the output array and display result
        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int age = ages[i];
            output[count[age - minAge] - 1] = age;
            count[age - minAge]--;
        }

        System.out.println("Sorted Ages (Ascending):");
        for (int age : output) {
            System.out.print(age + " ");
        }
	}

}
