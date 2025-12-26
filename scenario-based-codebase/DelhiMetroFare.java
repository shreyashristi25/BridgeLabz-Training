
import java.util.Scanner;
public class DelhiMetroFare {

    //creating methods calculateFare and deductFare to calculate fare according to the distance and deduct fare
    public static int calculateFare(int distance) {
        return (distance <= 5) ? 10 : (distance <= 10 ? 20 : 30);
    }
    
    public static int deductFare(int balance, int fare) {
        return balance - fare;
    }

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		//Taking user input and checking for travel and balance of the smart card
		
        int balance;
        System.out.print("Enter initial Smart Card balance: ₹");
        balance = sc.nextInt();

        while (balance > 0) {
            System.out.print("Enter distance travelled (km): ");
            int distance = sc.nextInt();

            int fare = calculateFare(distance);

            if (fare > balance) {
                System.out.println("Insufficient balance! Please recharge.");
                break;
            }
			balance = deductFare(balance, fare);

            System.out.println("Fare deducted: ₹" + fare);
            System.out.println("Remaining balance: ₹" + balance);
			
            System.out.print("Do you want to continue? (yes/no): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Delhi Metro Smart Card!");
                break;
            }
        }

        if (balance <= 0) {
            System.out.println("Insufficient! Please recharge.");
        }

        sc.close();
    }
}
