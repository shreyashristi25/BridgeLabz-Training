package com.birdsanctuary;
//creating Duck as subclass of Bird that implements Flyable and Swimmable
public class Duck extends Bird implements Flyable, Swimmable{

	    //constructor
		public Duck(String id, String name) {
			super(id, name, "Eagle") ;
		}
		
		@Override
		public void fly() {
			System.out.println(getName()+"Can Fly(short distances)!") ;
		}
		
		@Override
		public void swim() {
			System.out.println(getName()+" Can Swim!") ;
		}
		@Override
		public void displayDetails() {
			System.out.println("Duck -> ID : " +getId() +" | Name : " +getName()) ;
		}
}
