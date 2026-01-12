package com.homenest;

//creating a class Lock as subclass of Device class 
public class Lock extends Device{

	//constructor
	public Lock(int id, double usage) {
        super(id, usage);
    }

    @Override
    public void reset() {
        System.out.println("Lock reset: security codes refreshed.");
    }

}
