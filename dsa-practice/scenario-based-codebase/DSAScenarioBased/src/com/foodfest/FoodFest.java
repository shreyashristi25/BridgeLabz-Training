package com.foodfest;
import java.util.* ;

public class FoodFest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		// Taking input for number of zones
        System.out.println("Enter number of Zones:");
        int zoneCount = sc.nextInt();
        sc.nextLine();

        Map<String, int[]> zoneFootfalls = new LinkedHashMap<>();

        //taking user input for zone name, number of foot fall entries per zone
        for (int z = 0; z < zoneCount; z++) {
            System.out.println("Enter Zone name:");
            String zoneName = sc.nextLine();

            System.out.println("Enter number of footfall entries for " + zoneName + ":");
            int n = sc.nextInt();

            int[] footFall = new int[n];
            
            System.out.println("Enter footfalls for " + zoneName + ":");
            for (int i = 0; i < n; i++) {
                footFall[i] = sc.nextInt();
            }
            sc.nextLine(); 

            StallsSort.mergeSort(footFall, 0, n - 1);
            
            zoneFootfalls.put(zoneName, footFall);
        }

        // Displaying sorted master list per zone
        System.out.println(" Master Footfall List by Zone:");
        for (Map.Entry<String, int[]> entry : zoneFootfalls.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (int f : entry.getValue()) {
                System.out.print(f + ", ");
            }
            System.out.println();
        }

        sc.close();


	}

}
