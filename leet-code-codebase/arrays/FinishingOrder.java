import java.util.* ;
public class FinishingOrder {

	public static int [] recoverOrder(int[] order, int[] friends) {
		
		int [] finishingOrder = new int [friends.length] ;
		
		int count = 0; 

        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                if (order[i] == friends[j]) {
                    finishingOrder[count] = friends[j];
                    count++;
                }
            }
        }
		 
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = finishingOrder[i];
        }
        return result;


	}
	
	public static void main(String args[]) {	
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter the number of students in the race " ) ;
		int n = sc.nextInt() ;
		
		int [] order = new int[n] ;
		
		System.out.println("Enter the finishing order of the race : ") ;
		for(int i = 0; i < n; i++) {
			order [i] = sc.nextInt() ;
		}
		
		System.out.println("Enter the number of friends : ") ;
		int friendsNum = sc.nextInt() ;
		
		int [] friends = new int [friendsNum] ;
		
		System.out.println("Enter the ID's of friends : ") ;
		for(int i = 0; i < friendsNum; i++) {
			friends [i] = sc.nextInt() ;
		}
		
		int [] result =  recoverOrder(order, friends) ;
		System.out.println("The friends' IDs in their finishing order is :") ;
		for(int x : result) {
			System.out.println(x) ;
		}
		
	}
	
}