
import java.util.*   ;
public class RandomNumber {
	
	//creating methods generate4DigitRandomArray and findAverageMinMax to get random numbers and finding average, min, and max of an array
	public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + (int)(Math.random() * 9000);
        }
        return numbers;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
		double [] array = new double[3];

        for (int num : numbers) {
            sum += num;
            array[0] = Math.min(min, num);
            array[1] = Math.max(max, num);
        }
        array[2] = (double) sum / numbers.length;
        return array;
    }

	public static void main(String args  []) {
		Scanner input = new Scanner(System.in)  ;
		
		//creating arrays randomNumbers and results, computing average, min, max and displaying result 
		int[] randomNumbers = generate4DigitRandomArray(5);
        double[] results = findAverageMinMax(randomNumbers) ;
        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Average value is : " + results[0]);
        System.out.println("Minimum value is : " + results[1]);
        System.out.println("Maximum value is : " + results[2]);

        input.close() ;
    }
}