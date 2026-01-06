
import java.util.* ;
class GoodTriplets {
	
	//method to count number of good triplets
	public static int countGoodTriplets(int [] arr, int a, int b, int c) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(arr[i] - arr[j]) > a) continue;
                for (int k = j + 1; k < n; k++) {
                    if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in) ;
		
		//taking user input and displaying result
		System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
		
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter values of a, b, c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = countGoodTriplets(arr, a, b, c);

        System.out.println("Number of good triplets: " + result);

        sc.close();
	
	}
}