package com.functionalinterfaces.smartdevicecontrol;

public class Light implements DeviceControl{

	@Override
	public void turnOn() {
		System.out.println("Light Turned ON!") ;
	}
	
	@Override
	public void turnOff() {
		System.out.println("Light Turned OFF!") ;
	}
}
