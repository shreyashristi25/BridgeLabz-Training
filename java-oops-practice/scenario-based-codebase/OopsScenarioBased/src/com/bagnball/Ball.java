package com.bagnball;

public class Ball  implements Storable{ 

	//private methods to ensure limited access
	private int id ;
	private String color ;
	private String size ;
	
	//constructor
	public Ball(int id, String color, String size) {
		this.id = id ;
		this.color = color ;
		this.size = size ;
	}
	
	//getter methods to get id, color, size
	public int getId() {
		return id ;
	}
	public String getColor() {
		return color ;
	}
	public String getSize() {
		return size ;
	}
	
	@Override
	public String toString() {
		return "Ball -> ID : " +id +" | Color : " +color +", Size : " +size ;
	}
}
