
import java.util.* ;
public class MeanHeight {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in) ;
		
		//creating a double array heights and getting user input, defining sum to store sum of heights
		double [] heights = new double[11] ;
		double sum = 0.0 ;
		
		//calculating the mean height of players and displaying result
		System.out.println("Enter the heights of 11 players :") ;
		for(int i = 0 ; i < heights.length ; i ++) {
			heights[i] = input.nextDouble() ;
			sum += heights[i] ;
		}
		System.out.println("The mean height of football players is : " +sum / heights.length) ;
		
		input.close() ;
	}
}