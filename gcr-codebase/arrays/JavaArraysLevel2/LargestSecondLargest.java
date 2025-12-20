
import java.util.*;
public class LargestSecondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // creating variables number,maxDigit and index and getting user input and assigning values according to the problem
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int maxDigit = 10;
        int [] digits = new int[maxDigit];
        int index = 0;

        //Extracting digits to store in array and increasing the size of accordingly
        while (number > 0) {
            if (index == maxDigit) {
                maxDigit = maxDigit + 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i] ;
                }
                digits = temp ; 
            }
            digits[index] = number % 10 ;
            number = number / 10;
            index++;
        }

        // checking for largest and second largest and displaying results accordingly
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("Largest digit is : " + largest);
        System.out.println("Second largest digit is: " + secondLargest);

        input.close();
    }
}
