package com.homenest;

//creating Camera as subclass of Device class 
public class Camera extends Device{

	//constructor
	public Camera(int id, double usage) {
        super(id, usage);
    }

    @Override
    public void reset() {
        System.out.println("Camera reset: lens recalibrated.");
    }

}
