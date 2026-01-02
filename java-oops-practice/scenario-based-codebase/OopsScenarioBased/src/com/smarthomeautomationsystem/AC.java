package com.smarthomeautomationsystem;

//creating Light as subclass of Appliance class
public class AC extends Appliance{

	//constructor
	public AC(int id, String name, double powerUsage) {
        super(id, name, powerUsage);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("AC cooling started with delay.");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("AC turned OFF.");
    }

}
