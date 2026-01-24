package com.onlineticketbooking;

public class Event {

	public String name ;
	public int time  ;
	public int height ;
	Event left, right ;

	//constructor
	public Event(String name, int time ) {
		this.name = name ;
		this.time = time ;
		this.height = 1 ;
		this.left = this.right = null ;
	}
}
