
import java.util.*        ;
public class Scorecard {

	// creating methods generateScores, calculateResults, displayScorecard to generate scores of different subjects, calculte and display the scorecard
	
    public static int[][] generateScores(int n) {
        Random random = new Random() ;
        int[][] scores = new int[n][3] ;

        for (int i = 0 ; i < n ; i++) {
            scores[i][0] = 10 + random.nextInt(90) ; 
            scores[i][1] = 10 + random.nextInt(90) ; 
            scores[i][2] = 10 + random.nextInt(90) ; 
        }
        return scores ;
    }
	
    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length ;
        double[][] results = new double[n][4] ; 

        for (int i = 0 ; i < n ; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2] ;
            double average = total / 3.0 ;
            double percentage = (total / 300.0) * 100 ;
            average = Math.round(average * 100.0) / 100.0 ;
            percentage = Math.round(percentage * 100.0) / 100.0 ;

            results[i][0] = total ;
            results[i][1] = average ;
            results[i][2] = percentage ;
            results[i][3] = i + 1 ;
        }
        return results ;
    }
	
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("ID\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage") ;
        System.out.println("---------------------------------------------------------------") ;

        for (int i = 0 ; i < scores.length ; i++) {
            System.out.println((int)results[i][3] + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t\t" +
                    scores[i][2] + "\t" +
                    (int)results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2] + "%") ;
        }
    }
	
	public static void main(String args []) {
		Scanner input = new Scanner(System.in)  ;
		
		System.out.print("Enter number of students: ") ;
        int n = input.nextInt() ;

        int[][] scores = generateScores(n) ;
        double[][] results = calculateResults(scores) ;
        displayScorecard(scores, results) ;

        input.close()  ;
    }
}