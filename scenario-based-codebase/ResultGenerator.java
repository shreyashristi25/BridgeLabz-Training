
import java.util.Scanner;
public class ResultGenerator {

	//creating method assignGrade to calculate and assign grades based on the average marks
    public static String assignGrade(double average) {
        int gradeCategory = (int) average / 10;

        String grade;
        if (average >= 90) {
            grade = "A";
        } 
		else if (average >= 80) {
            grade = "B";
        }
		else if (average >= 70) {
            grade = "C";
        }
		else if (average >= 60) {
            grade = "D";
        }
		else {
            grade = "F";
        }

        return grade;
    }

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		//getting input from user, the marks of five subjects, calculating average and diaplaying result
		
        int [] marks = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            sum += marks[i];
        }
		
        double average = sum / 5.0;

        String grade = assignGrade(average);

        System.out.println("--- Raj's Result---");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + " Marks: " + marks[i]);
        }
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
