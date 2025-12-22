
import java.util.*;
public class VotingEligibility {

    //creating methods generateAges, checkEligibilty and displayResult
	//To generate ages using random() method, checking eligibility of students and displaying result in tabular form
    
	public static int [] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + rand.nextInt(90);
        }
        return ages;
    }

    public static String [][] checkEligibilty(int[] ages) {
        String [][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);

            if (age < 0) {
                result[i][1] = "false"; 
            } else if (age >= 18) {
                result[i][1] = "true";  
            } else {
                result[i][1] = "false"; 
            }
        }
        return result;
    }
	public static void displayResult(String[][] arr) {
        System.out.println("Age\tCan Vote?");
        System.out.println("-------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		//getting user input, calling functions and displaying result
        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        int [] ages = generateAges(n);

        String [][] result = checkEligibilty(ages);

        displayResult(result);

        sc.close();
    }
}


