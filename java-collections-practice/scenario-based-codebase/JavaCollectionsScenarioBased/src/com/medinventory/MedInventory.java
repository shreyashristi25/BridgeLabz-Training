package com.medinventory;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;


public class MedInventory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//taking user input and displaying result accordingly
        System.out.print("Enter inventory file path: ");
        String filePath = sc.nextLine();

        Set<Item> uniqueItems = new HashSet<>();
        Map<String, List<Item>> categorizedItems = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length != 4) {
                    System.out.println("Invalid line: " + line);
                    continue;
                }

                Item item = new Item(tokens[0], tokens[1],
                        Integer.parseInt(tokens[2]), tokens[3]);

                if (!uniqueItems.add(item)) {
                    System.out.println("Duplicate found: " + item.getItemId());
                }

                categorizedItems.computeIfAbsent(tokens[1], k -> new ArrayList<>()).add(item);

                if (SmartHospitalInventory.isExpired(item.getExpiryDate())) {
                    System.out.println("Expired item: " + item);
                }
                
                try {
                    SmartHospitalInventory.checkCritical(item);
                } catch (LowSupplyException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Printing categorized inventory
        System.out.println("--- Categorized Inventory ---");
        for (Map.Entry<String, List<Item>> entry : categorizedItems.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }




	}

}
