package com.json.car;
import java.util.* ;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CarToJSON {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//taking input from user and displaying result
        System.out.print("Enter car brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter car model: ");
        String model = sc.nextLine();

        System.out.print("Enter car year: ");
        int year = sc.nextInt();

        Car car = new Car(brand, model, year);

        ObjectMapper mapper = new ObjectMapper();
        
        try {
            String jsonString = mapper.writeValueAsString(car);
            System.out.println("\nCar object in JSON format:");
            System.out.println(jsonString);
        }
        catch (JsonProcessingException e) {
            System.out.println("Error converting Car object to JSON: " + e.getMessage());
        }


        sc.close();


	}

}
