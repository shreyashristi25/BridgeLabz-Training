
import java.util.Scanner ;
public class UniqueCharacters {

    // creating methods findLength, findUniqueCharacters, displayUniqueCharacters
	// To find length and throw exception, find unique or non repeating charcters and displaying result 
    
	public static int findlengthgth(String text) {
        int count = 0 ;
        try {
            while (true) {
                text.charAt(count) ;
                count++ ;
            }
        } catch (Exception e) {
          
        }
        return count ;
    }

    public static char [] findUniqueCharacters(String text) {
        int length = findlengthgth(text) ;
        char [] temp = new char[length] ; 
        int uniqueCount = 0 ;

        for (int i = 0 ; i < length ; i++) {
            char ch = text.charAt(i) ;
            boolean isUnique = true ;

            for (int j = 0 ; j < uniqueCount ; j++) {
                if (temp[j] == ch) {
                    isUnique = false ;
                    break ;
                }
            }
            if (isUnique) {
                temp[uniqueCount] = ch ;
                uniqueCount++ ;
            }
        }

        char [] result = new char[uniqueCount] ;
        for (int i = 0 ; i < uniqueCount ; i++) {
            result[i] = temp[i] ;
        }
        return result ;
    }
	public static void displayUniqueCharacters(char [] arr) {
        System.out.println("Unique Characters are :") ;
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ") ;
        }
        System.out.println() ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
	
		//getting user input and displaying result
        System.out.println("Enter a string:") ;
        String input = sc.nextLine() ;

        char [] uniqueChars = findUniqueCharacters(input) ;
        displayUniqueCharacters(uniqueChars) ;

        sc.close() ;
    }
}
