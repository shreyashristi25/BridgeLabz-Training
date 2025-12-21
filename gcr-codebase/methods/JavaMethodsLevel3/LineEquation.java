
import java.util.*       ;
public class LineEquation {

	// creating methods euclideanDistance, lineEquation to calculate distance, slope and intercept
    public static double euclideanDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) ;
    }
	
    public static double[] lineEquation(int x1, int y1, int x2, int y2) {
        double slope = (double)(y2 - y1) / (x2 - x1) ;
        double intercept = y1 - slope * x1 ;
        return new double[]{slope, intercept} ;
    }
	
	public static void main(String args []) {
		Scanner input = new Scanner(System.in) ;
		
		//getting user input, calculating distance and line equation, and displaying result 
		System.out.print("Enter x1: ") ;
        int x1 = input.nextInt() ;
		System.out.print("Enter y1: ") ;
		int y1 = input.nextInt() ;
        System.out.print("Enter x2: ") ;
        int x2 = input.nextInt() ;
		System.out.print("Enter y2: ") ;
		int y2 = input.nextInt() ;

        double distance = euclideanDistance(x1, y1, x2, y2) ;
        System.out.println("Euclidean Distance : " + distance) ;

        double [] line = lineEquation(x1, y1, x2, y2) ;
        System.out.println("Equation of line: y = " + line[0] + "x + " + line[1]) ;

        input.close() ;
    }
}