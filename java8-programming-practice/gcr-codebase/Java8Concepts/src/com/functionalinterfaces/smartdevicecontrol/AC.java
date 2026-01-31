package com.functionalinterfaces.smartdevicecontrol;

public class AC implements DeviceControl{

	@Override
	public void turnOn() {
		System.out.println("AC Turned ON!") ;
	}
	
	@Override
	public void turnOff() {
		System.out.println("AC Turned OFF!") ;
	}
}
