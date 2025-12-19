
import java.util.* ;
public class YoungestTallestArray {
   public static void main (String args[]) {
      Scanner input = new Scanner (System.in) ;
	  
	  //creating two arrays height and age to store height and age of the three friends
	  String[] friends = {"Amar", "Akbar", "Anthony"};
	  double [] height = new double[3] ;
	  int [] age = new int[3] ;
	  int tallest = 0 ;
	  int youngest = 0 ;
	  
	  //getting input for height and age of each friend from user
	  for(int i = 0; i < 3; i++) {
		System.out.println("Enter the age of " +friends[i]) ;
        age[i] = input.nextInt() ;
		System.out.println("Enter the height of " +friends[i]) ;
        height[i] = input.nextDouble() ;
		
		if(age[i] <= 0 || height[i] <= 0) {
			System.out.println("Invali input : Please enter a valid age or height") ;
		}
	  }
	   // checking for youngest and tallest among the three friends
	   for (int i = 0; i < 3; i++) {
		if(height[i] > height[tallest]) {
			tallest = i ;
		}
		if(age[i] < age[youngest]) {
			youngest = i ;
		}
	   }
	   System.out.println("Tallest friend : " +friends[tallest]) ;
	   System.out.println("Youngest friend : " +friends[youngest]) ;
	   
	  input.close() ;
	  
   }
}