
import java.util.* ;
public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        // creating a varibale number and getting user input, and creating arrays named marks percentage and grade 
        System.out.print("Enter the number of students: ") ;
        int n = input.nextInt() ;
        int[][] marks = new int[n][3] ;      
        double[] percentage = new double[n] ;
        String[] grade = new String[n] ;

        // Taking user input in arrays
        for (int i = 0 ; i < n ; i++) {
            System.out.print("Enter marks of Physics of Student : " +(i+1) +" : ") ;
            int physics = input.nextInt() ;
            System.out.print("Enter marks of Chemistry of Student : " +(i+1) +" : ") ;
            int chemistry = input.nextInt() ;
			System.out.print("Enter marks of Maths of Student : " +(i+1) +" : ") ;
            int maths = input.nextInt() ;

            if (physics < 0 || chemistry < 0 || maths < 0) {
                System.out.println("Invalid input! Marks must be positive. Try again.") ;
            }

            marks[i][0] = physics ;
            marks[i][1] = chemistry ;
            marks[i][2] = maths ;
        }
		
		//Calculating percentage and grade and displaying output accordingly
        for (int i = 0; i < n; i++) {
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2] ;
            percentage[i] = totalMarks / 300 * 100 ;

            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } 
			else if (percentage[i] >= 50) {
                grade[i] = "D";
            } 
			else if (percentage[i] >= 40) {
                grade[i] = "E";
            } 
			else {
                grade[i] = "R";
            }
        }
        for (int i = 0 ; i < n ; i++) {
            System.out.println("Student " + (i + 1) +"'s marks in Physics is : " + marks[i][0] +", marks in Chemistry is : " + marks[i][1] +
            ", marks in Maths is : " + marks[i][2] +", overall percentage is : " + percentage[i] +"% and grade is : " + grade[i]) ;
        }

        input.close() ;
    }
}



