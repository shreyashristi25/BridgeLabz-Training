
import java.util.* ;
public class VowelConsonant2DArray {

    //creating methods checkVowelConsonant, to2DArray and displayResult
	//To check for vowel and consonant, to store it into a 2D Array
    public static String checkVowelConsonant(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32) ;
        }
        if (ch >= 'a' && ch <= 'z') {
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel" ;
            } 
			else {
                return "Consonant" ;
            }
        } 
		else {
            return "Not a Letter" ;
        }
    }
	public static String [][] to2DArray(String text) {
        String[][] result = new String[text.length()][2] ;

        for (int i = 0 ; i < text.length() ; i++) {
            char ch = text.charAt(i) ;
            result[i][0] = String.valueOf(ch) ;
            result[i][1] = checkVowelConsonant(ch) ;
        }
        return result ;
    }

    public static void displayResult(String[][] arr) {
        System.out.println("Character\tType") ;
        System.out.println("-------------------------") ;
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1]) ;
        }
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

		//getting user input, calling functions and displaying result
        System.out.println("Enter a string:") ;
        String input = sc.nextLine() ;

        String[][] result = to2DArray(input) ;

        displayResult(result) ;

        sc.close() ;
    }
}
