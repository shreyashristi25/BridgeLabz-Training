package com.functionalinterfaces.unitconverter;

public interface UnitConverter {

	double km_to_mile = 0.621371 ;
	double kg_to_lbs = 2.20462 ;
	
	//static methods for unit conversion
	static double kmToMile (double  km) {
		return km * km_to_mile ;
	}
	
	static double milesToKm(double miles) {
		return miles /km_to_mile ;
	}
	
	static double kgToLbs(double kg) {
		return kg * kg_to_lbs ;
	}
	
	static double lbsToKg(double lbs) {
		return lbs /kg_to_lbs ;
	}
}
