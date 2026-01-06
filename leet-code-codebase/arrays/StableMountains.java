import java.util.* ;
public class StableMountains{

	//method to count stable mountains
	public static int [] stableMountain(int [] heights, int threshold) {
	
		int n = heights.length ;
		int [] stable = new int[n] ;
		int count = 0;              

        for (int i = 1; i < n; i++) {
            if (heights[i - 1] > threshold) {
                stable[count] = i;  
                count++;
            }
        }

        return Arrays.copyOf(stable, count);

	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in) ;
		
		//taking user input and displaying result
		System.out.println("Enter the number of mountains :") ;
		int n = sc.nextInt() ;
		
		int [] mountains =  new int[n] ;
		System.out.println("Enter the heights of the mountains :") ;
		for(int i = 0; i < n; i++ ) {
			mountains[i] = sc.nextInt() ;
		}
		
		System.out.println("Enter the threshold :") ;
		int threshold = sc.nextInt();
		
		int [] result = stableMountain(mountains, threshold) ;
		
		System.out.println("The number of stable mountains in the given mountains are :") ;
		for(int x : result) {
			System.out.println(x) ;
		}
	}
}