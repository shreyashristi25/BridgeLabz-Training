import java.util.* ;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        // creating variable number and arrays named physics, chemistry, maths, percentage and grade 
        System.out.print("Enter the number of students: ") ;
        int n = input.nextInt() ;
        int[] physics = new int[n] ;
        int[] chemistry = new int[n] ;
        int[] maths = new int[n] ;
        double[] percentage = new double[n] ;
        String[] grade = new String[n] ;
        
		//getting user input in arrays
        for (int i = 0 ; i < n ; i++) {
            System.out.print("Enter marks of Physics of Student : " +(i+1) +" : ")  ;
            int p = input.nextInt() ;
			System.out.print("Enter marks of Chemistry of Student : " +(i+1) +" : ")  ;
            int c = input.nextInt() ;
			System.out.print("Enter marks of Maths of Student : " +(i+1) +" : ")  ;
            int m = input.nextInt() ;

            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Invalid input! Marks must be positive. Try again.") ;
            }
			physics[i] = p ;
            chemistry[i] = c ;
            maths[i] = m ;
        }

        // clculating percentage and garde and displaying result 
        for (int i = 0 ; i < n ; i++) {
            int totalMarks = physics[i] + chemistry[i] + maths[i] ;
            percentage[i] = totalMarks / 300 * 100  ;

            if (percentage[i] >= 80) {
                grade[i] = "A" ;
            } 
			else if (percentage[i] >= 70) {
                grade[i] = "B" ;
            } 
			else if (percentage[i] >= 60) {
                grade[i] = "C" ;
            } 
			else if (percentage[i] >= 50) {
                grade[i] = "D" ;
            }
			else if (percentage[i] >= 40) {
                grade[i] = "E" ;
            }
			else {
                grade[i] = "R" ;
            }
        }
        for (int i = 0 ; i < n ; i++) {
            System.out.println("Student " + (i + 1) +"'s marks in Physics is : " + physics[i] +", marks in Chemistry is : " + chemistry[i] +
            ", marks in Maths is : " + maths[i] +", overall percentage is : " + percentage[i] +"% and grade is : " + grade[i])  ;
        }

        input.close() ;
    }
}



