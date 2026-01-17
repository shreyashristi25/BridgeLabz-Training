package com.bagnball;

public class Bag {

	//private methods to ensure limited access
	private int id;
    private String color;
    private int capacity;
    private Ball [] balls;
    private int count; 

    //constructor
    public Bag(int id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
        this.balls = new Ball[capacity]; 
        this.count = 0;
    }

    //getter methods to get id, color, capacity, ball count
    public int getId() { 
    	return id;
    }
    public String getColor() {
    	return color; 
    }
    public int getCapacity() {
    	return capacity; 
    }
    public int getBallCount() {
    	return count; 
    }

    //method to add ball, remove ball by id, display all balls and display bag info
    public void addBall(Ball ball) {
        if (count < capacity) {
            balls[count] = ball;
            count++;
            System.out.println("Ball added: " + ball);
        } else {
            System.out.println("Bag is full! Cannot add ball.");
        }
    }

    public void removeBall(int ballId) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (balls[i].getId() == ballId) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Removed ball: " + balls[index]);
            for (int i = index; i < count - 1; i++) {
                balls[i] = balls[i + 1];
            }
            balls[count - 1] = null;
            count--;
        } else {
            System.out.println("Ball not found in this bag.");
        }
    }

    public void displayBalls() {
        if (count == 0) {
            System.out.println("No balls in this bag.");
        } else {
            System.out.println("Balls in Bag " + id + ":");
            for (int i = 0; i < count; i++) {
                System.out.println("  " + balls[i]);
            }
        }
    }


    public void displayBagInfo() {
        System.out.println("Bag[ID=" + id + ", Color=" + color +", Capacity=" + capacity + ", BallCount=" + count + "]");
    }

}
