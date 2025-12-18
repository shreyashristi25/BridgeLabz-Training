
import java.util.* ;
public class YoungestTallest {
	public static void main (String args[]) {
		Scanner input = new Scanner (System.in) ;
		
		//creating variables amarAge, akbarAge, anthonyAge, amarHeight, akbarHeight, anthonyHeight and getting user input
		int amarAge, akbarAge, anthonyAge ;
		double amarHeight, akbarHeight, anthonyHeight ;
        
		System.out.println("Enter Amar's age : ") ;
	    amarAge = input.nextInt() ;
		System.out.println("Enter Akbar's age : ") ;
		akbarAge = input.nextInt() ;
		System.out.println("Enter Anthony's age : ") ;
		anthonyAge = input.nextInt() ;
		System.out.println("Enter Amar's height : ") ;
		amarHeight = input.nextDouble() ;
		System.out.println("Enter Akbar's age : ") ;
		akbarHeight =  input.nextDouble() ;
		System.out.println("Enter Anthony's age : ") ;
		anthonyHeight =  input.nextDouble() ;
		
		//Checking for the youngest among three
		if(amarAge < akbarAge && amarAge < anthonyAge){
			System.out.println("Amar is youngest ") ;
		}
		else if (akbarAge < amarAge && akbarAge < anthonyAge) {
			System.out.println("Akbar is youngest") ;
		}
		else {
			System.out.println("Anthony is youngest") ;
		}
		
		//Checking for the tallest among three
		if(amarHeight > akbarHeight && amarHeight > anthonyHeight){
			System.out.println("Amar is tallest ") ;
		}
		else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
			System.out.println("Akbar is tallest") ;
		}
		else {
			System.out.println("Anthony is tallest") ;
		}
		
		input.close() ;
	}
}