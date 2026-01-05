package com.swiftcart;

//creating ICheckout interface
public interface ICheckout {

	void generateBill() ;
	void applyDiscount(double couponValue) ;
}
