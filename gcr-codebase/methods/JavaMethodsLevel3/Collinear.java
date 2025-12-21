
import java.util.*      ;
public class Collinear {

	// creating methods areCollinearSlope, areCollinearArea to check collinearity of points using slope and area formula
    public static boolean areCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = (double)(y2 - y1) / (x2 - x1) ;
        double slopeBC = (double)(y3 - y2) / (x3 - x2) ;
        double slopeAC = (double)(y3 - y1) / (x3 - x1) ;
        return (slopeAB == slopeBC) && (slopeBC == slopeAC) ;
    }

    public static boolean areCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) ;
        return area == 0 ;
    }
	
	public static void main(String args []) {
		Scanner input = new Scanner(System.in) ;
		
		System.out.print("Enter x1: ") ;
        int x1 = input.nextInt() ;
		System.out.print("Enter y1: ") ;
		int y1 = input.nextInt() ;
        System.out.print("Enter x2: ") ;
        int x2 = input.nextInt() ;
		System.out.print("Enter y2: ") ;
		int y2 = input.nextInt() ;
        System.out.print("Enter x3: ") ;
        int x3 = input.nextInt() ;
		System.out.print("Enter y3: ") ;
		int y3 = input.nextInt() ;

      
        boolean slopeCheck = areCollinearSlope(x1, y1, x2, y2, x3, y3) ;
        System.out.println("Collinear ( using Slope Method)? " + slopeCheck) ;
        boolean areaCheck = areCollinearArea(x1, y1, x2, y2, x3, y3) ;
        System.out.println("Collinear (using Area Method)? " + areaCheck) ;
 
        input.close() ;
    }
}