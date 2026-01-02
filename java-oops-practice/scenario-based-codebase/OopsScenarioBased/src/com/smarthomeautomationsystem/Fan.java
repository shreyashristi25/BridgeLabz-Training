package com.smarthomeautomationsystem;

//creating Fan as subclass of Appliance class
public class Fan extends Appliance{

	//constructor
	public Fan(int id, String name, double powerUsage) {
        super(id, name, powerUsage);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("Light turned ON instantly.");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("Light turned OFF.");
    }

}
