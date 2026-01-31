package com.functionalinterfaces.smartdevicecontrol;

public class TV implements DeviceControl{

	@Override
	public void turnOn() {
		System.out.println("TV Turned ON!") ;
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV Turned OFF!") ;
	}
}
