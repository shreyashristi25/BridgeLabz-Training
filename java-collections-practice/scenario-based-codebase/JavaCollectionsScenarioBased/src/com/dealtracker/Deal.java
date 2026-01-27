package com.dealtracker;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Deal implements Promotion{

	private String code;
    private LocalDate validTill;
    private int discount; // percentage
    private int minPurchase;

    //constructor
    public Deal(String code, String validTill, int discount, int minPurchase) {
        this.code = code;
        this.validTill = LocalDate.parse(validTill, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.discount = discount;
        this.minPurchase = minPurchase;
    }

    @Override
    public String getCode() {
    	return code; 
    }
    @Override
    public int getDiscountValue() { 
    	return discount; 
    }
    
    //methods to get date till which item is valid and minimum number of purchases
    public LocalDate getValidTill() {
    	return validTill; 
    }
    public int getMinPurchase() {
    	return minPurchase; 
    }

    @Override
    public String toString() {
        return code + " | " + discount + "% off | Min: " + minPurchase + " | ValidTill: " + validTill;
    }

}
