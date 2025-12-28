
import java.util.Scanner;
public class MergeSortedArray {

    // Function to merge nums2 into nums1
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;       
        int j = n - 1;       
        int k = m + n - 1;   

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } 
			else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
		
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		//Taking user input and displaying result
        System.out.print("Enter number of elements in nums1 (m): ");
        int m = sc.nextInt();
        System.out.print("Enter number of elements in nums2 (n): ");
        int n = sc.nextInt();

        int [] nums1 = new int[m + n];
        int [] nums2 = new int[n];

        System.out.println("Enter " + m + " elements of nums1 (sorted):");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }
       
        for (int i = m; i < m + n; i++) {
            nums1[i] = 0;
        }

        System.out.println("Enter " + n + " elements of nums2 (sorted):");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        merge(nums1, m, nums2, n);
		
		System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}


