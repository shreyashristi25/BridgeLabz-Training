
import java.util.* ;
public class RichestCustomer {
	
	//method to find the richest customer
	public static int maximumWealth(int[][] accounts) {
      
        int maxWealth = 0;
        for(int i = 0; i < accounts.length; i++ ) {
            int wealth = 0 ;
            for(int j = 0; j < accounts[i].length ; j++ ){
                wealth += accounts[i][j] ;
            }
            maxWealth = Math.max(maxWealth, wealth) ;
        }
        return maxWealth ;
    }
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in) ;
	
	//taking user input and displaying result
		System.out.print("Enter number of customers: ");
        int m = sc.nextInt();

        System.out.print("Enter number of banks: ");
        int n = sc.nextInt();

        int [][] accounts = new int[m][n];

        System.out.println("Enter the wealth for each customer in each bank:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }
		int result = maximumWealth(accounts) ;
		System.out.println("The Richest Customer has money :" +result) ;
	}
}