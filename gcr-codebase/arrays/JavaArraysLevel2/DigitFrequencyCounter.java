
import java.util.* ;
public class DigitFrequencyCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // creating a variable number 
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        if (number < 0) {
            System.out.println("Invalid input! Please enter a positive number.");
        }

        //extracting and storing digits in array
        int num = number;
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        int[] digits = new int[count];
        num = number;
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(num % 10); // extract last digit
            num /= 10;
        }

        //creating frquency array and counting frequency of digits and displaying frequencu if greater than 0
        int[] frequency = new int[10];
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times.");
            }
        }

        input.close();
    }
}

