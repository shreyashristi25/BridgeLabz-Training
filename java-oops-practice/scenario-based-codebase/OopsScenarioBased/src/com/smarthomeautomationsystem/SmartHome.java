package com.smarthomeautomationsystem;

//driver class for all other classes of Smart Home Automation System
public class SmartHome {

	public static void main(String[] args) {

		//creating objects, accessing methods and displaying result
		Appliance light = new Light(1, "Philips LED", 10);
        Appliance fan = new Fan(2, "Ceiling Fan", 60);
        Appliance ac = new AC(3, "Samsung AC", 1500);

        UserController controller = new UserController();

        controller.toggleAppliance(light);
        controller.toggleAppliance(fan);
        controller.toggleAppliance(ac);

        light.displayInfo();
        fan.displayInfo();
        ac.displayInfo();

        controller.compareEnergyUsage(light, ac);
        controller.compareEnergyUsage(fan, ac);


	}

}
