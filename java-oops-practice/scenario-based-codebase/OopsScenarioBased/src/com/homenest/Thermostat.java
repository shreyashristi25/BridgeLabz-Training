package com.homenest;

//creating class Thermostat as subclass of Device class
public class Thermostat extends Device{

	public Thermostat(int id, double usage) {
        super(id, usage);
    }

    @Override
    public void reset() {
        System.out.println("Thermostat reset: temperature set to 22°C.");
    }

}
