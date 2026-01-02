package com.smarthomeautomationsystem;

public class UserController {

	//methods to toggle and compare energy usage of appliances
	public void toggleAppliance(Appliance appliance) {
        if (appliance.isOn()) {
            appliance.turnOff();
        } else {
            appliance.turnOn();
        }
    }

    public void compareEnergyUsage(Appliance a1, Appliance a2) {
        if (a1.getPowerUsage() > a2.getPowerUsage()) {
            System.out.println(a1.getClass().getSimpleName() + " consumes more energy than " + a2.getClass().getSimpleName());
        } else if (a1.getPowerUsage() < a2.getPowerUsage()) {
            System.out.println(a2.getClass().getSimpleName() + " consumes more energy than " + a1.getClass().getSimpleName());
        } else {
            System.out.println("Both appliances consume equal energy.");
        }
    }

}
