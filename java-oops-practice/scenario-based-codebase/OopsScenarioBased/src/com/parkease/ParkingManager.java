package com.parkease;

public class ParkingManager {

	//private variables to ensure limited access
	private String [] bookingLogs;
    private int logCount;

    //constructor
    public ParkingManager(int maxLogs) {
        bookingLogs = new String[maxLogs];
        logCount = 0;
    }

    // methods to book slot, release slot and print logs
    public void bookSlot(ParkingSlot slot, Vehicle vehicle, int hours) {
    	
        if (!slot.isOccupied() && vehicle.getVehicleType().equals(slot.getVehicleTypeAllowed())) {
            slot.assignSlot();
            double charges = vehicle.calculateCharges(hours);
            
            String log = "Slot " + slot.getSlotId() + " booked for " + vehicle.getVehicleNumber() + " (" + vehicle.getVehicleType() + ") at " + slot.getLocation() +
                         " | Duration: " + hours + " hrs | Charges: ₹" + charges;
            
            if (logCount < bookingLogs.length) {
                bookingLogs[logCount++] = log;
            }
            System.out.println("Booking successful! " + log);
        } 
        else {
            System.out.println("Slot not available or vehicle type mismatch.");
        }
    }

    public void releaseSlot(ParkingSlot slot) {
        slot.releaseSlot();
        System.out.println("Slot " + slot.getSlotId() + " is now free.");
    }

    public void printLogs() {
        System.out.println("--- Booking Logs ---");
        for (int i = 0; i < logCount; i++) {
            System.out.println(bookingLogs[i]);
        }
    }

}
