
import java.util.*;
public class FinalPrices {

	//creating finalPrices to check for the final prices such that j > i and prices[j] <= prices[i]
    public static int [] finalPrices(int [] prices) {
        int n = prices.length;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int discount = 0;
            for (int j = i + 1; j < n; j++) {
                if (prices[j] <= prices[i]) {
                    discount = prices[j];
                    break;
                }
            }
            answer[i] = prices[i] - discount;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		//getting user input and displaying result
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
		
        int[] prices = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int[] result = finalPrices(prices);
        System.out.println("Final prices after discount :");
        System.out.println(Arrays.toString(result));
    }
}
