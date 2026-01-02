
import java.util.* ;
public class EmployeesMetTarget {

	
	//method to count number of employees who acheived the target
    public static int countEmployee(int [] nums, int target) {
        int n = nums.length;
		int count = 0;
	
		for(int i = 0; i < n; i++){
			if(nums[i] >= target ) {
				count++ ;
			}
		}
	
		return count ;
    }

	public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in) ;

		//Taking user input and displaying result
		System.out.println("Enter the number of employees :") ;
		int n = sc.nextInt() ;
		
		System.out.println("Enter the target hours :") ;
		int target =  sc.nextInt() ;
		
		System.out.println("Enter the work hours per employee :") ;
        int [] employee = new int[n];
		
		for(int i = 0; i < n; i++) {
			employee[i] = sc.nextInt() ; 
		}

        int result = countEmployee(employee, target);

        System.out.print("The number of employees who worked atleast target hours are : " +result);
        
		sc.close() ;
    }
}
