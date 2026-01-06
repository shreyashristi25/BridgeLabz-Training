
import java.util.* ;
class EquivalenceOfStringArrays {
	
	//method to check equivalence of two string arrays
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String w : word1) {
            sb1.append(w) ;
        }
        for(String w : word2) {
            sb2.append(w) ;                         
        }
        return sb1.toString().equals(sb2.toString());
    }
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in) ;
		
		//taking user input and displaying result
		System.out.println("Enter the number of words in array1 :") ;
		int n1 = sc.nextInt() ;
		
		System.out.println("Enter the elemnts of array1 :") ;
		String [] words1 = new String[n1] ;
		for(int i = 0; i < n1; i++) {
			words1[i] =  sc.nextLine() ;
		}
		
		System.out.println("Enter the number of words in array 2 :") ;
		int n2 = sc.nextInt() ;
		
		System.out.println("Enter the elemnts of array2 :") ;
		String [] words2 = new String[n2] ;
		for(int i = 0; i < n2; i++) {
			words2[i] =  sc.nextLine() ;
		}
		
		boolean result = arrayStringsAreEqual(words1, words2) ;
		System.out.println("Are the two string arrays same ? " +result) ;
	}
}