
import java.util.* ;
public class AssignCookies {
	
	//creating method to check for the assignment of cookies
	public static int assignCookies(int [] g, int [] s) {
		Arrays.sort(g) ;
		Arrays.sort(s) ;
		
		int i = 0 ;
		int j = 0 ;
		int count = 0;
		while(i < g.length && j < s.length) {
			if(s[j] >= g[i]) {
                count++;
                j++;i++;
            }
            else{
                j++;
            }
		}
		return count ;
	}
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in) ;
		
		//Taking user input and displaying result
		System.out.println("Enter the size of first array :") ;
		int s1 = sc.nextInt() ;
		System.out.println("Enter the first array:");
		int [] g = new int[s1] ;
		for(int i = 0; i < s1; i++) {
			g[i] = sc.nextInt() ;
		}
		
		System.out.println("Enter the size of second array :") ;
		int s2 = sc.nextInt() ;
		System.out.println("Enter the second array:");
		int [] s = new int[s2] ;
		for(int i = 0; i < s1; i++) {
			s[i] = sc.nextInt() ;
		}
		
		int cookies = assignCookies(g, s) ;
		
		System.out.println("The maximum numbe rof cookies that can be assigned to children are :" +cookies) ;
		
		
	}
}