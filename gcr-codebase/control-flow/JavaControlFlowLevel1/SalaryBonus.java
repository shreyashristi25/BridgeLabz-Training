
import java.util.* ;
public class SalaryBonus {
   public static void main (String args[]) {
      Scanner input = new Scanner (System.in) ;
	  
	  //creating variable number to store number 
	  double salary, bonus ;
	  int yearOfService ;
	  System.out.println("Enter the salary : ") ;
	  salary = input.nextDouble() ;
	  System.out.println("Enter the years of service : ") ;
	  yearOfService = input.nextInt() ;
	  
	  //computing the bonus amount
	  if(yearOfService > 5) {
	     bonus = (salary * 5)/100 ;
	  }
	  else {
	     bonus = 0 ; 
	  }
	  System.out.println("The bonus amount is :" +bonus) ;
	  
	  input.close() ;
	  
   }
}