
import java.util.*   ;
public class StudentVoteChecker {

	// creating method canVote to check if a student can vote
     public boolean canStudentVote(int age) {  
        if (age < 0) {
            return false; 
        }
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

	public static void main(String args  []) {
		Scanner input = new Scanner(System.in)  ;
		StudentVoteChecker studentVoteChecker = new StudentVoteChecker();

        //creating array to store age of students and displaying result
        int[] ages = new int[10];
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            boolean canVote = studentVoteChecker.canStudentVote(ages[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " CAN vote.");
            } else {
                System.out.println("Student " + (i + 1) + " CANNOT vote.");
            }
        }

        input.close() ;
    }
}