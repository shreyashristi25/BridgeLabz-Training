package com.runtimeanalysisofalgo;
import java.util.* ;
public class DataStructureSearchComparison {

	// Linear Search in Array
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Take dataset size from user
        System.out.print("Enter dataset size (e.g., 1000, 100000, 1000000): ");
        int n = sc.nextInt();

        // Generate dataset
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n * 10); 
        }

        // Taking target value from user
        System.out.print("Enter target value to search: ");
        int target = sc.nextInt();

        // Array Search
        long startArray = System.nanoTime();
        int arrayResult = linearSearch(array, target);
        long endArray = System.nanoTime();
        double timeArrayMs = (endArray - startArray) / 1_000_000.0;

        // HashSet Search
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : array) {
        	hashSet.add(num);
        }

        long startHash = System.nanoTime();
        boolean hashResult = hashSet.contains(target);
        long endHash = System.nanoTime();
        double timeHashMs = (endHash - startHash) / 1_000_000.0;

        // TreeSet Search
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : array) {
        	treeSet.add(num);
        }

        long startTree = System.nanoTime();
        boolean treeResult = treeSet.contains(target);
        long endTree = System.nanoTime();
        double timeTreeMs = (endTree - startTree) / 1_000_000.0;

        // displaying results

        System.out.println("Dataset Size: " + n);
        System.out.println("Target: " + target);

        System.out.println("Array Search Result: " + (arrayResult != -1 ? "Found at index " + arrayResult : "Not Found"));
        System.out.println("Array Search Time: " + timeArrayMs + " ms");

        System.out.println("HashSet Search Result: " + (hashResult ? "Found" : "Not Found"));
        System.out.println("HashSet Search Time: " + timeHashMs + " ms");

        System.out.println("TreeSet Search Result: " + (treeResult ? "Found" : "Not Found"));
        System.out.println("TreeSet Search Time: " + timeTreeMs + " ms");
    }

}
