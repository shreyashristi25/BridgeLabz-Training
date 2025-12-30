
import java.util.* ;
public class DistributeCandies {
	
	//creating method to distribute the candy and checking for minimum candies that can be eaten
	
    public static int distributeCandies(int [] candyType) {
        int n = candyType.length;
		
        Arrays.sort(candyType) ;
        
		int uniqueCount = 1; 
        for (int i = 1; i < n; i++) {
            if (candyType[i] != candyType[i - 1]) {
                uniqueCount++;
            }
        }

        return (uniqueCount < n / 2) ? uniqueCount : n / 2;
    }
	
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in) ;
	
		//Taking user input and displaying result
		System.out.println("Enter the number of candies you have : ") ;
		int candy = sc.nextInt() ;
		
		int [] candyType = new int[candy] ;
		
		System.out.println("Enter the candy types : ") ;
		for(int i = 0; i < candy; i++) {
			candyType[i] = sc.nextInt() ;
		}
		
		int canEat = distributeCandies(candyType) ;
		System.out.println("The number of chocolates that you can eat is  :" + canEat) ;
	}
}
