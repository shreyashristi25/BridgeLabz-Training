import java.util.* ;
public class SumOfNumbersWithFor {
   public static void main (String args[]) {
      Scanner input = new Scanner (System.in) ;
	  
	  //creating variables to store number and gettig user input
	  int number ;
	  System.out.println("Enter the number : ") ;
	  number = input.nextInt() ;
	  int num = number ;
	  int sum = 0 ;
	  int sumFormula = 0 ;
	  
	  // checking for natural number and computing sum of n numbers
	  if(number >0) {
	     sumFormula = number * (number + 1)/2 ; 
	  }
	  for(int i = num ; num >= 0 ; i --) {
	     sum += num ; 
	  }
	  if(sumFormula == sum) {
	     System.out.println("Sum of " + number +" is " +sum) ;
	  }
	  input.close() ;
   
   }
}