package com.hashmaps.implementcustomhashmap;
import java.util.* ;

//driver class for CustomHashMap class 
public class CustomHashMapMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//creating object of CustomHashMap class
        CustomHashMap myMap = new CustomHashMap();

        //Taking user input, accessing methods and displaying result
        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter key: ");
            String key = sc.nextLine();
            System.out.print("Enter value: ");
            int value = sc.nextInt();
            sc.nextLine();
            myMap.put(key, value);
        }

        System.out.println("Stored map: ");
        myMap.display();

        System.out.print("Enter key to retrieve: ");
        String key = sc.nextLine();
        System.out.println("Value = " + myMap.get(key));

        System.out.print("Enter key to delete: ");
        key = sc.nextLine();
        myMap.remove(key);

        System.out.println("Map after deletion: ");
        myMap.display();

        sc.close();

	}

}
