package com.parkease;

public class ParkingSlot {

	//private variables to ensure limited access
	private int slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String location;

    //constructor
    public ParkingSlot(int slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    //getters to get slot id, location, vehicle allowed and check if slot is occupied
    public int getSlotId() { 
    	return slotId; 
    }
    public String getLocation() { 
    	return location; 
    }
    public String getVehicleTypeAllowed() {
    	return vehicleTypeAllowed;
    }
    public boolean isOccupied() { 
    	return isOccupied; 
    }

    // methods to change occupancy
    public void assignSlot() { 
    	this.isOccupied = true; 
    }
    public void releaseSlot() { 
    	this.isOccupied = false; 
    }
}


