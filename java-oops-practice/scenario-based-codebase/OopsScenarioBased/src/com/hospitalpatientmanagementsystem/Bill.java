package com.hospitalpatientmanagementsystem;

public class Bill implements Payable {

	private int patientId;
    private double amount;
    private double discount;
    private double tax;

    public Bill(int patientId, double amount, double discount, double tax) {
        this.patientId = patientId;
        this.amount = amount;
        this.discount = discount;
        this.tax = tax;
    }

    @Override
    public double calculatePayment() {
        double discounted = amount - (amount * discount);
        return discounted + (discounted * tax);
    }

    public void displayInfo() {
        System.out.println("Bill for Patient ID: " + patientId + " | Final Amount: " + calculatePayment());
    }

}
