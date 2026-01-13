package com.deliverychain;

public class Stage {

	public String name ;
	public Stage next  ;
	
	//constructor
	public Stage(String name) {
		this.name = name ;
		this.next = null ;
	}
}
