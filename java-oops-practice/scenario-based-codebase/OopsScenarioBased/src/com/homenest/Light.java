package com.homenest;

//creating Light as subclass of Device class 
public class Light extends Device{

	//constructor
	public Light(int id, double usage) {
        super(id, usage);
    }

    @Override
    public void reset() {
        System.out.println("Light reset: brightness set to default.");
    }
}

