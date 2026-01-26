package com.annotation.depricatedimplementation;

public class LegacyAPI {

	@Deprecated
	public void oldFeature() {
		System.out.println("oldFeature() id deprecated. Please use newFeature() instead") ;
	}
	
	public void newFeature() {
		System.out.println("newFeature() is the recommended method.") ;
	}
}
