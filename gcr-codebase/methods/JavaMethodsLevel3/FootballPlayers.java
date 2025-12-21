
import java.util.*    ;
public class FootballPlayers {

	//creating methods finSum, findMean, findTallest to calculate sum, mean and check for shortest and tallest
    public static int findSum(int [] heights) {
        int sum = 0 ;
        for (int h : heights) {
            sum += h ;
        }
        return sum ;
    }
    public static double findMean(int [] heights) {
        int sum = findSum(heights) ;
        return (double) sum / heights.length ;
    }

    public static int findShortest(int [] heights) {
        int min = heights[0] ;
        for (int h : heights) {
            if (h < min) {
                min = h ;
            }
        }
        return min ;
    }
    public static int findTallest(int [] heights) {
        int max = heights[0] ;
        for (int h : heights) {
            if (h > max) {
                max = h ;
            }
        }
        return max ;
    }

	public static void main(String args  []) {
		Scanner input = new Scanner(System.in) ;
		
		//generating random numbers between 150 and 250, calculating the sum, mean, shortest height and tallest height and displaying results
		Random random = new Random() ;
        int [] heights = new int[11] ;

        for (int i = 0 ; i < heights.length ; i++) {
            heights[i] = random.nextInt(101) + 150 ; 
        }
        
		System.out.println("Heights of players :");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        int sum = findSum(heights) ;
        double mean = findMean(heights) ;
        int shortest = findShortest(heights) ;
        int tallest = findTallest(heights) ;

        System.out.println("\nSum of heights is : " + sum) ;
        System.out.println("Mean heights is : " + mean) ;
        System.out.println("Shortest height is : " + shortest) ;
        System.out.println("Tallest height is : " + tallest) ;

        input.close() ;
    }
}