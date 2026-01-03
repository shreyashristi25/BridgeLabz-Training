
import java.util.*;
public class SortPeople {

    public static String [] sortPeople(String [] names, int [] heights) {
        int n = names.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (heights[i] < heights[j]) { 
                    
                    int tempHeight = heights[i];
					
                    heights[i] = heights[j];
                    heights[j] = tempHeight;
                    
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }
        
        return names;
    }
    
    
    public static void main(String [] args) {
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter the number of students : ") ;
		int n =  sc.nextInt() ;
		
		System.out.println( " Enter the name of students : ") ;
        String [] names = new String[n] ;
		
		for(int i = 0; i < n; i ++ ) {
			names[i] =  sc.nextLine() ;
		}
		
		int [] heights = new int[n] ;
		
		System.out.println( " Enter the heights of students : ") ;
        
		for(int i = 0; i < n; i ++ ) {
			heights[i] =  sc.nextInt() ;
		}
        
        String [] sorted = sortPeople(names, heights);
        System.out.println(Arrays.toString(sorted));
        
    }
}
