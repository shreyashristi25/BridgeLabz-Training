
import java.util.* ;
public class ScoreCard {

    //creating methods generateScores, computeResults, calculateGrades, displayScoreCard
	// To generate random scores of different subjects, compute result and grades, and display result
    public static int[][] generateScores(int n) {
        Random rand = new Random() ;
        int[][] scores = new int[n][3] ; // PCM

        for (int i = 0 ; i < n ; i++) {
            scores[i][0] = 10 + rand.nextInt(90) ;
            scores[i][1] = 10 + rand.nextInt(90) ; 
            scores[i][2] = 10 + rand.nextInt(90) ; 
        }
        return scores ;
    }
   
    public static double[][] computeResults(int[][] scores) {
        double [][] result = new double[scores.length][3] ; 

        for (int i = 0 ; i < scores.length ; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2] ;
            double average = total / 3.0 ;
            double percentage = (total / 300.0) * 100 ;

            average = Math.round(average * 100.0) / 100.0 ;
            percentage = Math.round(percentage * 100.0) / 100.0 ;

            result[i][0] = total ;
            result[i][1] = average ;
            result[i][2] = percentage ;
        }
        return result ;
    }
	 public static String[] calculateGrades(double[][] result) {
        String[] grades = new String[result.length] ;

        for (int i = 0 ; i < result.length ; i++) {
            double percentage = result[i][2] ;

            if (percentage >= 80) grades[i] = "A" ;
            else if (percentage >= 70) grades[i] = "A" ;
            else if (percentage >= 70) grades[i] = "B" ;
            else if (percentage >= 60) grades[i] = "C" ;
            else if (percentage >= 50) grades[i] = "D" ;
			else if (percentage >= 40) grades[i] = "E" ;
            else grades[i] = "R" ;
        }
        return grades ;
    }

    public static void displayScoreCard(int[][] scores, double[][] result, String[] grades) {
        System.out.println("......Scorecard.......") ;
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade") ;
        System.out.println("--------------------------------------------------------------------------") ;

        for (int i = 0 ; i < scores.length ; i++) {
            System.out.println((i+1) + "\t" +scores[i][0] + "\t" +scores[i][1] + "\t\t" +scores[i][2] + "\t" 
			+ (int)result[i][0] + "\t" +result[i][1] + "\t" +result[i][2] + "%\t\t" + grades[i]) ;
        }
    }

	 public static void main(String [] args) {
        Scanner sc = new Scanner(System.in) ;

		//getting user input, calling functions and displaying result
        System.out.println("Enter number of students:") ;
        int n = sc.nextInt() ;

        int [][] scores = generateScores(n) ;
        double [][] result = computeResults(scores) ;
        String [] grades = calculateGrades(result) ;

        displayScoreCard(scores, result, grades) ;

        sc.close() ;
    }
}
