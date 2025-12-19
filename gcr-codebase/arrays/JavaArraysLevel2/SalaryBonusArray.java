
import java.util.* ;
public class SalaryBonusArray {
   public static void main (String args[]) {
      Scanner input = new Scanner (System.in) ;
	  
	  //creating an arrays named oldSalary and newSalary to store the oldSalary and new salary of 10 employees 
	  double [] oldSalary = new double[10] ;
	  double [] newSalary = new double[10] ;
	  double [] bonus = new double[10] ;
	  int [] yearOfService = new int [10] ; 
	  double totalBonusPayout = 0, totalOldSalary = 0, totalNewSalary = 0 ;
	  
	  //getting input for salary and yoear of service from user
	  for(int i = 0 ; i < 10; i++){
		System.out.println("Enter slary of employee " +(i+1)+" :") ;
		oldSalary[i] =  input.nextDouble() ;
		System.out.println("Enter year of service of employee " +(i+1)+" :") ;
		yearOfService[i] =  input.nextInt() ;
		
		if(oldSalary[i] <= 0 || yearOfService[i] < 0) {
			System.out.println("Invalid input!, Try Again") ;
		}
	  }
	  //computing and displaying old salary, new salary, year of service and bonus payout for employees
	  for(int i = 0; i < 10; i++) {
		if(yearOfService[i] > 5) {
			bonus[i] = oldSalary[i] * 0.05 ;
		}
		else if(yearOfService[i] > 2) {
			bonus[i] = oldSalary[i] * 0.02 ;
		}
		else {
		bonus[i] = 0 ;
		}
		newSalary[i] = oldSalary[i] + bonus[i] ;
		totalOldSalary += oldSalary[i] ;
	    totalBonusPayout += bonus[i] ;
		totalNewSalary += newSalary[i] ;
	  }
	  System.out.println("Zara salary and bonus report :") ;
	  for (int i = 0; i < 10; i++) {
		System.out.println("Employee " +(i+1) +"'s old salary is :" +oldSalary[i]) ;
		System.out.println("Employee " +(i+1) +"'s new salary is :" +newSalary[i]) ;
		System.out.println("Employee " +(i+1) +"'s year of experience is :" +yearOfService[i]) ;
		System.out.println("Employee " +(i+1) +"'s bonus amount is :" +bonus[i]) ;
	  }
	  System.out.println("Total old salary is :" +totalOldSalary) ;
	  System.out.println("Total new salary is :" +totalNewSalary) ;
	  System.out.println("Total bonus payout is :" +totalBonusPayout) ;
	  
	  
	  input.close() ;
	  
   }
}