package com.inheritance.multiple;

//creating PaidOnlineCourse as subclass of OnlineCourse
public class PaidOnlineCourse extends OnlineCourse{

	double fee;
    double discount; 

    //constructor
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded,
                     double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: ₹" + calculateFinalPrice());
    }

    //method to calculate final price
    double calculateFinalPrice() {
        return fee - (fee * discount / 100);
    }

}
