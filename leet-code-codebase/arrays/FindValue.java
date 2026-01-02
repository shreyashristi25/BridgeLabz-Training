
public class FindValue {
	
	public static int finalValueAfterOperations(String [] operations) {
        
		int x = 0 ;
		for(int i=0 ;i < operations.length; i++) {
			if(operations[i] == "++x") {
				System.out.println("The result of the operation is : "+ ++x) ;
			}
			else if(operations[i] == "x++") {
				System.out.println("The result of the operation is : "+ x++) ;
			}
			else if(operations[i] == "x--") {
				System.out.println("The result of the operation is : "+ x--) ;
			}
			else {
				System.out.println("The result of the operation is : "+ --x) ;
			}
		}
		return x ;
        
    }
	public static void main(String args[]) {
		
		int x = 0 ;
		String [] result = {"++x", "x--", "x++", "--x"} ;
		
		int output = finalValueAfterOperations(result) ;
	}
}