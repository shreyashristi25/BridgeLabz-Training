package com.multithreading.resturantorderprocessingsystem;

public class Chef extends Thread{

	private String dishName;
    private int cookTime; 

    //constructor
    public Chef(String name, String dishName, int cookTime) {
        super(name); 
        this.dishName = dishName;
        this.cookTime = cookTime;
    }

    @Override
    public void run() {
        System.out.println(getName() + " started preparing " + dishName);

        int[] progressMarks = {25, 50, 75, 100};
        for (int mark : progressMarks) {
            try {
                Thread.sleep(cookTime / 4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " preparing " + dishName + ": " + mark + "% complete");
        }

        System.out.println(getName() + " finished preparing " + dishName);
    }

}
