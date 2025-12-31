package com.inheritance.hybrid;

//creating class PetrolVehicle that extends Vehicle class and implements refuelable interface
public class PetrolVehicle extends Vehicle implements Refuelable{
	
	int fuelTankCapacity; 

    PetrolVehicle(int maxSpeed, String model, int fuelTankCapacity) {
        super(maxSpeed, model);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling. Tank capacity: " + fuelTankCapacity + " liters");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Petrol Vehicle, Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }

}
